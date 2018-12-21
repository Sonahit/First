package net.thumbtack.school.windows.v3.base;

import net.thumbtack.school.windows.v3.Point;
import net.thumbtack.school.windows.v3.Desktop;
import net.thumbtack.school.windows.v3.iface.Movable;
import net.thumbtack.school.windows.v3.iface.Resizable;

public abstract class RectWindow extends Window implements Movable, Resizable {
	private int width;
    private int height;
    private Point topLeft = new Point() ; 
    private Point bottomRight = new Point() ;
    
	public RectWindow (Point topLeft, Point bottomRight, boolean active, String text){
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
		}

		public RectWindow (int xLeft, int yTop, int width, int height, boolean active, String text){
		  topLeft.setX(xLeft);
		  topLeft.setY(yTop);
		  bottomRight.setX((width+xLeft)-1);
		  bottomRight.setY((height+yTop)-1);
		  this.width = width;
		  this.height =  height;
		}
		
		public RectWindow (int xLeft, int yTop, int width, int height, String text) {
			  topLeft.setX(xLeft);
			  topLeft.setY(yTop);
			  bottomRight.setX((width+xLeft)-1);
			  bottomRight.setY((height+yTop)-1);
			  this.width = width;
	    	  this.height =  height;
		}

		 
		public RectWindow (Point topLeft, Point bottomRight, String text) {
	   	  this.topLeft = topLeft;
	   	  this.bottomRight = bottomRight;

		  width = bottomRight.getX() - topLeft.getX() + 1;
		  height = bottomRight.getY() - topLeft.getY() + 1;

		}
		
	public RectWindow (Point topLeft, Point bottomRight, boolean active){
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
	}

	public RectWindow (int xLeft, int yTop, int width, int height, boolean active){
	  topLeft.setX(xLeft);
	  topLeft.setY(yTop);
	  bottomRight.setX((width+xLeft)-1);
	  bottomRight.setY((height+yTop)-1);
	  this.width = width;
	  this.height =  height;

	}
	public int getWidth(){ return width;}
	
	public int getHeight(){return height;}
	
	public RectWindow (int xLeft, int yTop, int width, int height) {
		  topLeft.setX(xLeft);
		  topLeft.setY(yTop);
		  bottomRight.setX((width+xLeft)-1);
		  bottomRight.setY((height+yTop)-1);
		  this.width = width;
    	  this.height =  height;

	}

	 
	public RectWindow (Point topLeft, Point bottomRight) {
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
	


	public void setTopLeft(Point topLeft){
   	  this.topLeft = topLeft;
   	  
	 }


	public void setBottomRight(Point bottomRight){
   
   	  this.bottomRight = bottomRight;
      width = bottomRight.getX()+1;
      height = bottomRight.getY()+1;
  
	}



	public void moveTo(int x, int y){
		topLeft.setX(x);
		topLeft.setY(y);
		bottomRight.setX(topLeft.getX()+width-1);
		bottomRight.setY(topLeft.getY()+height-1);
	}

	public void moveTo(Point point){
	  	  topLeft = point;
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
	

}
