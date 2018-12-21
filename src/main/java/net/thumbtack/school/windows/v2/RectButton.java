package main.java.net.thumbtack.school.windows.v2;


class RectButton {
	private int width;
    private int height;
    private boolean active = true;
    private Point topLeft = new Point() ; 
    private Point bottomRight = new Point() ;
    private String text;
   
	public RectButton(Point topLeft, Point bottomRight, boolean active, String text){
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
	       this.active = active;
		   this.text = text;
		}

		public RectButton(int xLeft, int yTop, int width, int height, boolean active, String text){
		  topLeft.setX(xLeft);
		  topLeft.setY(yTop);
		  bottomRight.setX((width+xLeft)-1);
		  bottomRight.setY((height+yTop)-1);
		  this.width = width;
		  this.height =  height;
	      this.active = active;
		  this.text = text;
		}
		
		public RectButton(int xLeft, int yTop, int width, int height, String text) {
			  topLeft.setX(xLeft);
			  topLeft.setY(yTop);
			  bottomRight.setX((width+xLeft)-1);
			  bottomRight.setY((height+yTop)-1);
			  this.width = width;
	    	  this.height =  height;
			  this.text = text;
		}

		 
		public RectButton(Point topLeft, Point bottomRight, String text) {
	   	  this.topLeft = topLeft;
	   	  this.bottomRight = bottomRight;

		  width = bottomRight.getX() - topLeft.getX() + 1;
		  height = bottomRight.getY() - topLeft.getY() + 1;
		  this.text = text;

		}
		
	public RectButton(Point topLeft, Point bottomRight, boolean active){
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
       this.active = active;
	}

	public RectButton(int xLeft, int yTop, int width, int height, boolean active){
	  topLeft.setX(xLeft);
	  topLeft.setY(yTop);
	  bottomRight.setX((width+xLeft)-1);
	  bottomRight.setY((height+yTop)-1);
	  this.width = width;
	  this.height =  height;
      this.active = active;

	}
	
	public RectButton(int xLeft, int yTop, int width, int height) {
		  topLeft.setX(xLeft);
		  topLeft.setY(yTop);
		  bottomRight.setX((width+xLeft)-1);
		  bottomRight.setY((height+yTop)-1);
		  this.width = width;
    	  this.height =  height;

	}

	 
	public RectButton(Point topLeft, Point bottomRight) {
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

	
	public boolean isActive(){
       return active;
	}


	public void setTopLeft(Point topLeft){
   	  this.topLeft = topLeft;
   	  
	 }


	public void setBottomRight(Point bottomRight){
   
   	  this.bottomRight = bottomRight;
      width = bottomRight.getX()+1;
      height = bottomRight.getY()+1;
  
	}


	public void setActive(boolean active){
      this.active = active;

	}


	public int getWidth(){
        return width;

	}


	public int getHeight(){
		return height;

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


	public boolean isIntersects(RectButton rectButton){

		return  rectButton.getWidth() > 0 
				&& rectButton.getHeight() > 0 
				&& width > 0 
				&& height > 0
				&& rectButton.getTopLeft().getX() < topLeft.getX() + width 
				&& rectButton.getTopLeft().getX() + rectButton.getWidth() > topLeft.getX()
				&& rectButton.getTopLeft().getY() < topLeft.getY() + height 
				&& rectButton.getTopLeft().getY() + rectButton.getHeight() > topLeft.getY();
	}
	

	public boolean isInside(RectButton rectButton){
       return 
    		   
    		   topLeft.getX() + width > rectButton.getTopLeft().getX() 
    		   && topLeft.getY() + height > rectButton.getTopLeft().getY() 
               && rectButton.getTopLeft().getX() > 0 
               && rectButton.getTopLeft().getY() > 0; 



	}
	public String getText() {
		return text;
		
	}
	

    public void setText(String text) {
    	this.text = text;
	}


	public boolean isFullyVisibleOnDesktop(Desktop desktop) {

		final int xL0 = topLeft.getX();
		final int yL0 = topLeft.getY();
		
		
		return
				topLeft.getX() >= 0
				&& topLeft.getY() >= 0
				&& width + topLeft.getX()  <= desktop.getWidth()  
				&& (height + topLeft.getY()) <= desktop.getHeight(); 
    		  
    		  
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (active ? 1231 : 1237);
		result = prime * result + ((bottomRight == null) ? 0 : bottomRight.hashCode());
		result = prime * result + height;
		result = prime * result + ((topLeft == null) ? 0 : topLeft.hashCode());
		result = prime * result + width;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		RectButton other = (RectButton) obj;
		if (active != other.active) {
			return false;
		}
		if (bottomRight == null) {
			if (other.bottomRight != null) {
				return false;
			}
		} else if (!bottomRight.equals(other.bottomRight)) {
			return false;
		}
		if (height != other.height) {
			return false;
		}
		if (topLeft == null) {
			if (other.topLeft != null) {
				return false;
			}
		} else if (!topLeft.equals(other.topLeft)) {
			return false;
		}
		if (width != other.width) {
			return false;
		}
		return true;
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