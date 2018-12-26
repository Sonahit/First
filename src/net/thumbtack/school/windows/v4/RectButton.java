package net.thumbtack.school.windows.v4;
import net.thumbtack.school.windows.v4.base.*;


public class RectButton extends RectWindow {
    
	public RectButton(Point topLeft, Point bottomRight, WindowState state, String text) throws WindowException{
	       super(topLeft,bottomRight,text);
	       super.getHeight();
	       super.getWidth();
	       if(state == WindowState.DESTROYED) throw new WindowException(WindowErrorCode.WRONG_STATE);
		      super.setState(state);
	}
		public RectButton(int xLeft, int yTop, int width, int height, WindowState state , String text) throws WindowException{
		       super(xLeft,yTop,width,height,text);
		       super.getTopLeft();
		       super.getBottomRight();
		       if(state == WindowState.DESTROYED) throw new WindowException(WindowErrorCode.WRONG_STATE);
			      super.setState(state);
		}

		public RectButton(Point topLeft, Point bottomRight, String state, String text) throws WindowException{
		       super(topLeft,bottomRight,text);
		       super.getHeight();
		       super.getWidth();
			      if(state == "ACTIVE"
			    		  || state == "INACTIVE") 
				      super.setState(WindowState.valueOf(state));
			      else throw new WindowException(WindowErrorCode.WRONG_STATE);
		}
			public RectButton(int xLeft, int yTop, int width, int height, String state , String text) throws WindowException{
			       super(xLeft,yTop,width,height,text);
			       super.getTopLeft();
			       super.getBottomRight();
				      if(state == "ACTIVE"
				    		  || state == "INACTIVE") 
					      super.setState(WindowState.valueOf(state));
				      else throw new WindowException(WindowErrorCode.WRONG_STATE);
			}
			
		public RectButton(int xLeft, int yTop, int width, int height, String text)throws WindowException {
		       super(xLeft,yTop,width,height,text);
		       super.getTopLeft();
		       super.getBottomRight();
		}

		 
		public RectButton(Point topLeft, Point bottomRight, String text)throws WindowException {
		       super(topLeft,bottomRight,text);
		       super.getHeight();
		       super.getWidth();

		}
		

	
	public RectButton(int xLeft, int yTop, int width, int height)throws WindowException {
	       super(xLeft,yTop,width,height);
	       super.getTopLeft();
	       super.getBottomRight();
	}

	 
	public RectButton(Point topLeft, Point bottomRight) throws WindowException{
   	 super(topLeft,bottomRight);

	}
	public boolean isIntersects(RectButton rectButton){

		return  rectButton.getWidth() > 0 
				&& rectButton.getHeight() > 0 
				&& super.getWidth() > 0 
				&& super.getHeight() > 0
				&& rectButton.getTopLeft().getX() < super.getTopLeft().getX() + getWidth() 
				&& rectButton.getTopLeft().getX() + rectButton.getWidth() > super.getTopLeft().getX()
				&& rectButton.getTopLeft().getY() < super.getTopLeft().getY() + super.getHeight() 
				&& rectButton.getTopLeft().getY() + rectButton.getHeight() > super.getTopLeft().getY();
	}
	

	public boolean isInside(RectButton rectButton){
       return 
    		   
    		   super.getTopLeft().getX() + getWidth() > rectButton.getTopLeft().getX() 
    		   && super.getTopLeft().getY() + super.getHeight() > rectButton.getTopLeft().getY() 
               && rectButton.getTopLeft().getX() > 0 
               && rectButton.getTopLeft().getY() > 0; 



	}

}