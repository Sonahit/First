package net.thumbtack.school.windows.v4.base;

import net.thumbtack.school.windows.v4.Point;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

import net.thumbtack.school.windows.v4.ComboBox;
import net.thumbtack.school.windows.v4.Desktop;
import net.thumbtack.school.windows.v4.iface.Movable;
import net.thumbtack.school.windows.v4.iface.Resizable;
import net.thumbtack.school.windows.v4.base.WindowState;

public abstract class Window implements Movable, Resizable {
    private String text;
    private WindowState status = WindowState.ACTIVE;

    
	public String getText()throws WindowException{  return text;}	
	

	
	public void setText(String text) throws WindowException {

		this.text = text;
	}
	

	
	public WindowState getState () {
		return status; 

	}


	public void setState(WindowState status)  throws WindowException{
        checkState(status);
		this.status = status;

	}
	
	private void checkState(WindowState status) throws WindowException{
		if (this.status == WindowState.DESTROYED & (       status == WindowState.ACTIVE
				||status == WindowState.INACTIVE
				||status == WindowState.DESTROYED)) {
			throw new WindowException(WindowErrorCode.WRONG_STATE);
		}
		else if(       status == WindowState.ACTIVE
				||status == WindowState.INACTIVE
				||status == WindowState.DESTROYED
		   ) this.status = status;
		else throw new WindowException(WindowErrorCode.WRONG_STATE);

	}

 
    public abstract boolean isInside(int x, int y);
    public abstract boolean isInside(Point point);
    public abstract boolean isFullyVisibleOnDesktop(Desktop desktop) ;



	@Override
	public int hashCode() {
		return Objects.hash(status, text);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Window other = (Window) obj;
		return status == other.status && Objects.equals(text, other.text);
	}



    
}
	




