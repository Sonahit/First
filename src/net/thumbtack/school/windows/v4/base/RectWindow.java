package net.thumbtack.school.windows.v4.base;

import net.thumbtack.school.windows.v4.Point;

import java.util.Objects;

import net.thumbtack.school.windows.v4.Desktop;
import net.thumbtack.school.windows.v4.iface.Movable;
import net.thumbtack.school.windows.v4.iface.Resizable;
import net.thumbtack.school.windows.v4.base.WindowErrorCode;

public abstract class RectWindow extends Window implements Movable, Resizable {
	private int width;
    private int height;
    private Point topLeft = new Point() ; 
    private Point bottomRight = new Point() ;
    
	public RectWindow (Point topLeft, Point bottomRight, WindowState status, String text) throws WindowException {
	       if (topLeft.equals(bottomRight)) {
	    	  height = 1;
	    	  width = 1;
	    	  this.topLeft = topLeft;
	   	      this.bottomRight = bottomRight;

	       }
	       else {
	     	  this.topLeft = topLeft;
	     	  this.bottomRight = bottomRight;
	    	  width = this.bottomRight.getX() - this.topLeft.getX()   + 1;
	    	  height =  this.bottomRight.getY() - this.topLeft.getY()   + 1;

	       }
	        super.setText(text);
		    if(status == WindowState.DESTROYED) throw new WindowException(WindowErrorCode.WRONG_STATE);
	        super.setState(status);
		}

		public RectWindow (int xLeft, int yTop, int width, int height, WindowState status, String text) throws WindowException {
		  topLeft.setX(xLeft);
		  topLeft.setY(yTop);
		  bottomRight.setX((width+xLeft)-1);
		  bottomRight.setY((height+yTop)-1);
		  this.width = width;
		  this.height =  height;
		  super.setText(text);
		  if(status == WindowState.DESTROYED) throw new WindowException(WindowErrorCode.WRONG_STATE);
		  super.setState(status);
		}
		
			
		public RectWindow (int xLeft, int yTop, int width, int height, String text) throws WindowException  {
			  topLeft.setX(xLeft);
			  topLeft.setY(yTop);
			  bottomRight.setX((width+xLeft)-1);
			  bottomRight.setY((height+yTop)-1);
			  this.width = width;
	    	  this.height =  height;
	    	  super.setText(text);
		}

		 
		public RectWindow (Point topLeft, Point bottomRight, String text)  throws WindowException {
	   	  this.topLeft = topLeft;
	   	  this.bottomRight = bottomRight;
	   	  super.setText(text);
		  width = bottomRight.getX() - topLeft.getX() + 1;
		  height = bottomRight.getY() - topLeft.getY() + 1;

		}
		
		
	public RectWindow (Point topLeft, Point bottomRight, WindowState status) throws WindowException {
       if (topLeft.equals(bottomRight)) {
    	  height = 1;
    	  width = 1;
    	  this.topLeft = topLeft;
   	      this.bottomRight = bottomRight;

       }
       else {
     	  this.topLeft = topLeft;
     	  this.bottomRight = bottomRight;
    	  width = this.bottomRight.getX() - this.topLeft.getX()   + 1;
    	  height =  this.bottomRight.getY() - this.topLeft.getY()   + 1;

       }
       if(status == WindowState.DESTROYED) throw new WindowException(WindowErrorCode.WRONG_STATE);
       super.setState(status);
	}

	public RectWindow (int xLeft, int yTop, int width, int height, WindowState status) throws WindowException {
	  topLeft.setX(xLeft);
	  topLeft.setY(yTop);
	  bottomRight.setX((width+xLeft)-1);
	  bottomRight.setY((height+yTop)-1);
	  this.width = width;
	  this.height =  height;
	  if(status == WindowState.DESTROYED) throw new WindowException(WindowErrorCode.WRONG_STATE);
	  super.setState(status);

	}
    

	public RectWindow (int xLeft, int yTop, int width, int height) throws WindowException  {
		  topLeft.setX(xLeft);
		  topLeft.setY(yTop);
		  bottomRight.setX((width+xLeft)-1);
		  bottomRight.setY((height+yTop)-1);
		  this.width = width;
    	  this.height =  height;

	}

	 
	public RectWindow (Point topLeft, Point bottomRight)  throws WindowException {
   	  this.topLeft = topLeft;
   	  this.bottomRight = bottomRight;

	  width = bottomRight.getX() - topLeft.getX() + 1;
	  height = bottomRight.getY() - topLeft.getY() + 1;

	}

	public Point getTopLeft(){
       return topLeft;

	}


	public Point getBottomRight(){
       return bottomRight;

	}
	


	public void setTopLeft(Point topLeft) throws WindowException {
   	  this.topLeft = topLeft;
   	  
	 }


	public void setBottomRight(Point bottomRight) throws WindowException {
   
   	  this.bottomRight = bottomRight;
      width = bottomRight.getX()+1;
      height = bottomRight.getY()+1;
  
	}
	
	
	public int getWidth(){ return width;}
	
	public int getHeight(){return height;}
	
	public void moveTo(int x, int y){
		topLeft.setX(x);
		topLeft.setY(y);
		bottomRight.setX(topLeft.getX()+width-1);
		bottomRight.setY(topLeft.getY()+height-1);
	}

	
    public void moveRel(int dx, int dy){
    topLeft.setX(topLeft.getX()+dx);
    topLeft.setY(topLeft.getY()+dy);
    bottomRight.setX(topLeft.getX()+width-1);
    bottomRight.setY(topLeft.getY()+height-1);
    }	
    
    public void resize(double ratio){
        width = (int)(width*ratio);
        height = (int)(height*ratio);
        if(width<= 1 || height<= 1) {
      	 if (width<= 1 ) {
      		 width = 1;
      	 }
      	 if(height<= 1) {
      		 height = 1;
      	 }
        }
        bottomRight.setX(topLeft.getX()+width - 1);
        bottomRight.setY(topLeft.getY()+height - 1);
       
  	}




	public boolean isInside(int x, int y) {
       return (
    		   
    		   (topLeft.getX() + width > x & topLeft.getY() + height > y) & (x > 0 & y > 0)
    		   
    		   );


	}


	public boolean isInside(Point point){
	       return (
	    		   
	    		   (topLeft.getX() + width > point.getX() & topLeft.getY() + height > point.getY()) & (point.getX() > 0 & point.getY() > 0)
	    		   
	    		   ); 

	}




	public boolean isFullyVisibleOnDesktop(Desktop desktop) {

		return
				topLeft.getX() >= 0
				&& topLeft.getY() >= 0
				&& width + topLeft.getX()  <= desktop.getWidth()  
				&& (height + topLeft.getY()) <= desktop.getHeight(); 
    		  
    		  
	}

	@Override
	public int hashCode() {
		return Objects.hash(bottomRight, height, topLeft, width);
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
		RectWindow other = (RectWindow) obj;
		return Objects.equals(bottomRight, other.bottomRight) && height == other.height
				&& Objects.equals(topLeft, other.topLeft) && width == other.width;
	}






}
