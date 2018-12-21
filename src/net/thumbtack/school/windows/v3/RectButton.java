package net.thumbtack.school.windows.v3;
import net.thumbtack.school.windows.v3.base.RectWindow;

public class RectButton extends RectWindow {

	public RectButton(Point topLeft, Point bottomRight, boolean active, String text){
	       super(topLeft,bottomRight,active,text);
	       super.getHeight();
	       super.getWidth();
	}
		public RectButton(int xLeft, int yTop, int width, int height, boolean active, String text){
		       super(xLeft,yTop,width,height,active,text);
		       super.getTopLeft();
		       super.getBottomRight();
		}
		
		public RectButton(int xLeft, int yTop, int width, int height, String text) {
		       super(xLeft,yTop,width,height,text);
		       super.getTopLeft();
		       super.getBottomRight();
		}

		 
		public RectButton(Point topLeft, Point bottomRight, String text) {
		       super(topLeft,bottomRight,text);
		       super.getHeight();
		       super.getWidth();

		}
		
	public RectButton(Point topLeft, Point bottomRight, boolean active){
	       super(topLeft,bottomRight,active);
	       super.getHeight();
	       super.getWidth();
	}

	public RectButton(int xLeft, int yTop, int width, int height, boolean active){
	       super(xLeft,yTop,width,height,active);
	       super.getTopLeft();
	       super.getBottomRight();

	}
	
	public RectButton(int xLeft, int yTop, int width, int height) {
	       super(xLeft,yTop,width,height);
	       super.getTopLeft();
	       super.getBottomRight();
	}

	 
	public RectButton(Point topLeft, Point bottomRight) {
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
/*public class RectButton {
    public static void main (String args[]) {
    	Desktop desktop = new Desktop();
        Point topLeft = new Point(10, 20);
        Point bottomRight = new Point(30, 40);
        RectsButton rectButton = new RectsButton(10,20,30,40);




    }
}*/