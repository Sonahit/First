package net.thumbtack.school.windows.v3;
import net.thumbtack.school.windows.v3.base.RectWindow;

public class RectButton3D extends RectWindow  {
	   private int zHeight;
	   
		public RectButton3D(Point topLeft, Point bottomRight, boolean active, String text, int zHeight){
	  	     super(topLeft, bottomRight,active,text);
		     super.getHeight();
		     super.getWidth();	     

		}

			public RectButton3D(int xLeft, int yTop, int width, int height, boolean active, String text, int zHeight){
			  super(xLeft, yTop,width,height,active,text);
		        super.getHeight();
		        super.getWidth();
		        this.zHeight = zHeight;
	          
			}
			
			public RectButton3D(int xLeft, int yTop, int width, int height, String text, int zHeight) {
				super(xLeft,yTop,width,height,text);
		        super.getHeight();
		        super.getWidth();
		        this.zHeight = zHeight;
			}

			 
			public RectButton3D(Point topLeft, Point bottomRight, String text, int zHeight) {
			  super(topLeft, bottomRight,text);
		      super.getHeight();
		      super.getWidth();
		      this.zHeight = zHeight;
			}
			public int getZHeight(){
				return zHeight;

			}

			public void setZHeight(int zHeight){
				this.zHeight = zHeight;
			}

			public boolean isIntersects(RectButton rectButton){

				return  rectButton.getWidth() > 0 
						&& rectButton.getHeight() > 0 
						&& super.getWidth() > 0 
						&& super.getHeight() > 0
						&& rectButton.getTopLeft().getX() < super.getTopLeft().getX() + super.getWidth() 
						&& rectButton.getTopLeft().getX() + rectButton.getWidth() > super.getTopLeft().getX()
						&& rectButton.getTopLeft().getY() < super.getTopLeft().getY() + super.getHeight() 
						&& rectButton.getTopLeft().getY() + rectButton.getHeight() > super.getTopLeft().getY();
			}
			
			public boolean isIntersects(RectButton3D rectButton3D){

				return  rectButton3D.getWidth() > 0 
						&& rectButton3D.getHeight() > 0 
						&& super.getWidth() > 0 
						&& super.getHeight() > 0
						&& rectButton3D.getTopLeft().getX() < super.getTopLeft().getX() + super.getWidth() 
						&& rectButton3D.getTopLeft().getX() + rectButton3D.getWidth() > super.getTopLeft().getX()
						&& rectButton3D.getTopLeft().getY() < super.getTopLeft().getY() + super.getHeight() 
						&& rectButton3D.getTopLeft().getY() + rectButton3D.getHeight() > super.getTopLeft().getY();
			}
			

			public boolean isInside(RectButton rectButton){
		       return 
		    		   
		    		   super.getTopLeft().getX() + super.getWidth() > rectButton.getTopLeft().getX() 
		    		   && super.getTopLeft().getY() + super.getHeight() > rectButton.getTopLeft().getY() 
		               && rectButton.getTopLeft().getX() > 0 
		               && rectButton.getTopLeft().getY() > 0; 



			}
			public boolean isInside(RectButton3D rectButton3D){
			       return 
			    		   
			    		   super.getTopLeft().getX() + super.getWidth() > rectButton3D.getTopLeft().getX() 
			    		   && super.getTopLeft().getY() + super.getHeight() > rectButton3D.getTopLeft().getY() 
			               && rectButton3D.getTopLeft().getX() > 0 
			               && rectButton3D.getTopLeft().getY() > 0
			               && rectButton3D.getZHeight() > 0
			               && rectButton3D.getZHeight() <= zHeight; 



				}
			
		public boolean isFullyVisibleOnDesktop(Desktop desktop) {

			return
					super.getTopLeft().getX() >= 0
					&& super.getTopLeft().getY() >= 0
					&& super.getWidth() + super.getTopLeft().getX()  <= desktop.getWidth()  
					&& (super.getHeight() + super.getTopLeft().getY()) <= desktop.getHeight(); 
	    		  
	    		  
		}
	
}