package net.thumbtack.school.windows.v3.base;

import net.thumbtack.school.windows.v3.Point;
import net.thumbtack.school.windows.v3.RectButton;
import net.thumbtack.school.windows.v3.Desktop;
import net.thumbtack.school.windows.v3.iface.Movable;
import net.thumbtack.school.windows.v3.iface.Resizable;

public abstract class Window implements Movable, Resizable {
    private String text;
    private boolean active = true;
    
	public String getText() { return text;}	
	
    public void setText(String text) {this.text = text;}
    
    public boolean isActive(){	return active; }
    
    public void setActive(boolean active){this.active = active;}
    public abstract boolean isInside(int x, int y);
    public abstract boolean isInside(Point point);
    public abstract boolean isFullyVisibleOnDesktop(Desktop desktop) ;
}
	




