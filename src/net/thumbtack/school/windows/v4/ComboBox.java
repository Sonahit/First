package net.thumbtack.school.windows.v4;

import java.util.Arrays;
import java.util.Objects;

import net.thumbtack.school.windows.v4.base.*;

public class ComboBox extends ListBox  {
	private Integer selected;
    private int count = 0;
	public ComboBox(Point topLeft, Point bottomRight, WindowState state, String[] lines, Integer selected) throws WindowException{
		super(topLeft,bottomRight,lines);
		setSelected(selected);

		if(state == WindowState.DESTROYED) throw new WindowException(WindowErrorCode.WRONG_STATE);
	      super.setState(state);
		}
	
	public ComboBox(int xLeft, int yTop, int width, int height, WindowState state, String[] lines, Integer selected)throws WindowException{
		super(xLeft,yTop,width,height,lines);
		setSelected(selected);

		if(state == WindowState.DESTROYED) throw new WindowException(WindowErrorCode.WRONG_STATE);
	      super.setState(state);
		}
	
	public ComboBox(Point topLeft, Point bottomRight,  String[] lines, Integer selected)throws WindowException{
		super(topLeft,bottomRight,lines);

		setSelected(selected);
		}
	
	public ComboBox(int xLeft, int yTop, int width, int height, String[] lines, Integer selected) throws WindowException{
		super(xLeft,yTop,width,height,lines);

		if(selected != null & lines == null) {
			throw new WindowException(WindowErrorCode.EMPTY_ARRAY);
		}
		setSelected(selected);
		}
	
	
	public ComboBox(Point topLeft, Point bottomRight,String status,  String[] lines, Integer selected)throws WindowException{
		super(topLeft,bottomRight,lines);

		setSelected(selected);
		if(   status == "ACTIVE"
			       || status == "INACTIVE") 
				   super.setState(WindowState.valueOf(status));
			    else throw new WindowException(WindowErrorCode.WRONG_STATE);
		}
    
	public ComboBox(int xLeft, int yTop, int width, int height, String status, String[] lines, Integer selected)throws WindowException{
		super(xLeft,yTop,width,height,lines);

		setSelected(selected);
		if(   status == "ACTIVE"
			       || status == "INACTIVE") 
				   super.setState(WindowState.valueOf(status));
			    else throw new WindowException(WindowErrorCode.WRONG_STATE);
		}

	public Integer getSelected() throws WindowException {
		try {
        if(super.getLines() != null ) {
        	count++;
        if(count == 2) {
        	count = 0;
        	return null;
        }
			return selected;
		}
        else
        	count++;
		return null;
		}
		catch(NullPointerException exc) {
			return null;
		}
		}
	
	public void setSelected(Integer selected) throws WindowException{
		if (selected == null || super.getLines() == null) {
			this.selected = null;
		}
		else if(selected < 0 || selected >= super.getLines().length) {
			throw new WindowException(WindowErrorCode.WRONG_INDEX);
		}
		else if(super.getLines()[selected].equals(null)) {
			throw new WindowException(WindowErrorCode.EMPTY_ARRAY);
		}
		else if(selected < super.getLines().length & selected >= 0 )
		{
			this.selected = selected;
		}

		}
	
	public boolean isIntersects(ComboBox comboBox) {
		return super.isIntersects(comboBox);
	}
	public boolean isInside(ComboBox comboBox) {
		return super.isInside(comboBox);
	}





	
}
