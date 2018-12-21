package net.thumbtack.school.windows.v3;
import net.thumbtack.school.windows.v3.base.RoundWindow;

class RoundButton extends RoundWindow {

	public RoundButton(Point center, int radius, boolean active, String text){
		super(center,radius,active,text);
	}
	
	public RoundButton(Point center, int radius, boolean active){
		super(center,radius,active);
	}

	public RoundButton(int xCenter, int yCenter, int radius, boolean active, String text){
		super(xCenter,yCenter,radius,active,text);
		super.getCenter();
	}

	 
	public RoundButton(Point center, int radius, String text){
		super(center,radius,text);
	}


	public RoundButton(int xCenter, int yCenter, int radius, String text){
		super(xCenter,yCenter,radius,text);
		super.getCenter();
	}
	
public RoundButton(int xCenter, int yCenter, int radius, boolean active){
	super(xCenter,yCenter,radius);
	super.getCenter();
}


public RoundButton(Point center, int radius){
	super(center,radius);
}


public RoundButton(int xCenter, int yCenter, int radius){
	super(xCenter,yCenter,radius);
	super.getCenter();
}



}