package net.thumbtack.school.windows.v3.base;

import net.thumbtack.school.windows.v3.Point;
import net.thumbtack.school.windows.v3.Desktop;

public abstract class RoundWindow extends Window    {
	
	  private int yCenter;
	  private int radius;
	  private int xCenter;
	  private Point center = new Point();
	  private boolean active = true;
	public RoundWindow(Point center, int radius, boolean active, String text){
		this.center = center;
		this.radius = radius;
	}
	
	public RoundWindow(Point center, int radius, boolean active){
		this.center = center;
		this.radius = radius;
	}

	public RoundWindow(int xCenter, int yCenter, int radius, boolean active, String text){
		center.setX(xCenter);
		center.setY(yCenter);
		this.radius = radius;
	}

	 
	public RoundWindow(Point center, int radius, String text){
		this.center = center;
		this.radius = radius;
	}


	public RoundWindow(int xCenter, int yCenter, int radius, String text){
		center.setX(xCenter);
		center.setY(yCenter);
		this.radius = radius;
	}
	
public RoundWindow(int xCenter, int yCenter, int radius, boolean active){
	center.setX(xCenter);
	center.setY(yCenter);
	this.radius = radius;
}


public RoundWindow(Point center, int radius){
	this.center = center;
	this.radius = radius;
}


public RoundWindow(int xCenter, int yCenter, int radius){
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

public void moveTo(Point point){
	center = point;
}


public void setCenter(int x, int y){
	center.setX(x);
	center.setY(y);
}
	

public void setRadius(int radius){
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


}
