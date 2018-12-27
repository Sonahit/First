package net.thumbtack.school.windows.v4;
import net.thumbtack.school.windows.v4.base.*;

class RoundButton extends RoundWindow {
	
	public RoundButton(Point center, int radius, WindowState state, String text) throws WindowException{
		super(center,radius,text);
		 if(state == WindowState.DESTROYED) throw new WindowException(WindowErrorCode.WRONG_STATE);
	      super.setState(state);
	}
	
	public RoundButton(Point center, int radius,  WindowState state)throws WindowException{
		super(center,radius);
		 if(state == WindowState.DESTROYED) throw new WindowException(WindowErrorCode.WRONG_STATE);
	      super.setState(state);
	}

	public RoundButton(int xCenter, int yCenter, int radius,  WindowState state, String text)throws WindowException{
		super(xCenter,yCenter,radius,text);
		super.getCenter();
		 if(state == WindowState.DESTROYED) throw new WindowException(WindowErrorCode.WRONG_STATE);
	      super.setState(state);
	}

	public RoundButton(Point center, int radius, String status, String text)throws WindowException{
		super(center,radius,text);
		if(status == "ACTIVE"
	    		  || status == "INACTIVE") 
		      super.setState(WindowState.valueOf(status));
	      else throw new WindowException(WindowErrorCode.WRONG_STATE);
	}

	public RoundButton(int xCenter, int yCenter, int radius,  String status, String text)throws WindowException{
		super(xCenter,yCenter,radius,text);
		if(status == "ACTIVE"
	    		  || status == "INACTIVE") 
		      super.setState(WindowState.valueOf(status));
	      else throw new WindowException(WindowErrorCode.WRONG_STATE);
		super.getCenter();
	}

	
	public RoundButton(Point center, int radius, String text)throws WindowException{
		super(center,radius,text);
	}


	public RoundButton(int xCenter, int yCenter, int radius, String text)throws WindowException{
		super(xCenter,yCenter,radius,text);
		super.getCenter();
	}
	
public RoundButton(int xCenter, int yCenter, int radius, boolean active)throws WindowException{
	super(xCenter,yCenter,radius);
	super.getCenter();
}

public RoundButton(int xCenter, int yCenter, int radius, WindowState state)throws WindowException{
	super(xCenter,yCenter,radius);
	super.getCenter();
	if(state == WindowState.DESTROYED) throw new WindowException(WindowErrorCode.WRONG_STATE);
    super.setState(state);
	
}

public RoundButton(Point center, int radius)throws WindowException{
	super(center,radius);
}


public RoundButton(int xCenter, int yCenter, int radius)throws WindowException{
	super(xCenter,yCenter,radius);
	super.getCenter();
}



}