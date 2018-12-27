package net.thumbtack.school.windows.v4.base;

import net.thumbtack.school.windows.v4.*;

import java.util.Objects;

import net.thumbtack.school.windows.v4.Desktop;
import net.thumbtack.school.windows.v4.iface.Movable;
import net.thumbtack.school.windows.v4.iface.Resizable;

public abstract class RoundWindow extends Window implements Movable, Resizable   {
	  private int yCenter;
	  private int radius;
	  private int xCenter;
	  private Point center = new Point();

	public RoundWindow(Point center, int radius, WindowState status, String text) throws WindowException {
		this.center = center;
		this.radius = radius;
		super.setText(text);
	    if(status == WindowState.DESTROYED) throw new WindowException(WindowErrorCode.WRONG_STATE);
	    super.setState(status);
	}
	
	public RoundWindow(Point center, int radius, WindowState status) throws WindowException {
		this.center = center;
		this.radius = radius;
	    if(status == WindowState.DESTROYED) throw new WindowException(WindowErrorCode.WRONG_STATE);
	    super.setState(status);
	}

	public RoundWindow(int xCenter, int yCenter, int radius, WindowState status, String text) throws WindowException {
		super.setText(text);
		if(status == WindowState.DESTROYED) throw new WindowException(WindowErrorCode.WRONG_STATE);
	    super.setState(status);
		center.setX(xCenter);
		center.setY(yCenter);
		this.radius = radius;
	}
	
	public RoundWindow(int xCenter, int yCenter, int radius, WindowState status) throws WindowException {
		center.setX(xCenter);
		center.setY(yCenter);
		this.radius = radius;
		if(status == WindowState.DESTROYED) throw new WindowException(WindowErrorCode.WRONG_STATE);
	    super.setState(status);
	}
	
	public RoundWindow(Point center, int radius, String status, String text) throws WindowException {
		this.center = center;
		this.radius = radius;
		super.setText(text);
		if(   status == "ACTIVE"
	       || status == "INACTIVE") 
		   super.setState(WindowState.valueOf(status));
	    else throw new WindowException(WindowErrorCode.WRONG_STATE);
	}
	
	public RoundWindow(Point center, int radius, String text) throws WindowException {
		this.center = center;
		this.radius = radius;
		super.setText(text);
	}


	public RoundWindow(int xCenter, int yCenter, int radius, String text) throws WindowException {
		center.setX(xCenter);
		center.setY(yCenter);
		this.radius = radius;
		super.setText(text);
	}
	


public RoundWindow(Point center, int radius) throws WindowException{
	this.center = center;
	this.radius = radius;
}


public RoundWindow(int xCenter, int yCenter, int radius) throws WindowException{
	center.setX(xCenter);
	center.setY(yCenter);
	this.radius = radius;
}

public Point getCenter(){
	return center;
}


public int getRadius(){
	return radius;
}

public void moveTo(int x, int y){
	center.setX(x);
	center.setY(y);
}



public void setCenter(int x, int y)  {
	center.setX(x);
	center.setY(y);
}
	

public void setRadius(int radius) {
	this.radius = radius;
}
	



public void moveRel(int dx, int dy){
	center.setX(center.getX()+dx);
	center.setY(center.getY()+dy);
}
	

public void resize(double ratio){
	if( (int)(ratio * radius) <= 1 ) {
		radius = 1;
	}
	else radius = (int)(ratio * radius);
}


public boolean isInside(int x, int y) {
	 xCenter = center.getX();
	 yCenter = center.getY();
		return Math.pow((xCenter - x),2) + Math.pow((yCenter - y),2) <= Math.pow((radius),2); 
	}


public boolean isInside(Point point){
	 xCenter = center.getX();
	 yCenter = center.getY();
	 return Math.pow((point.getX() - xCenter),2) + Math.pow((point.getY() - yCenter),2) <= Math.pow((radius),2);
	}

public boolean isFullyVisibleOnDesktop(Desktop desktop) {
		return     (center.getX() - radius) >= 0
				&& (center.getY() - radius) >= 0
				&& (center.getX() + radius) < desktop.getWidth() 
				&& (center.getY() + radius) < desktop.getHeight();
	}

@Override
public int hashCode() {
	return Objects.hash(center, radius, xCenter, yCenter);
}

@Override
public boolean equals(Object obj) {
	if (this == obj) {
		return true;
	}
	if (!super.equals(obj)) {
		return false;
	}
	if (getClass() != obj.getClass()) {
		return false;
	}
	RoundWindow other = (RoundWindow) obj;
	return Objects.equals(center, other.center) && radius == other.radius && xCenter == other.xCenter
			&& yCenter == other.yCenter;
}



}
