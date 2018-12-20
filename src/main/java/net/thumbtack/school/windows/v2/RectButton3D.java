package main.java.net.thumbtack.school.windows.v2;

public class RectButton3D extends RectButton {
	private int width;
    private int height;
    private int zHeight;
   
	public RectButton3D(Point topLeft, Point bottomRight, boolean active, String text, int zHeight){
  	     super(topLeft, bottomRight,active,text);
		 if (topLeft.equals(bottomRight)) {
	    	  height = 1;
	    	  width = 1;
	    	  zHeight = 1;
	       }
	       else {
	     	  this.zHeight = zHeight;
	    	  width = bottomRight.getX() - super.getTopLeft().getX()   + 1;
	    	  height =  bottomRight.getY() - super.getTopLeft().getY()   + 1;
		}
	}

		public RectButton3D(int xLeft, int yTop, int width, int height, boolean active, String text, int zHeight){
		  super(xLeft, yTop,width,height,active);
		  this.width = width;
		  this.height =  height;
		}
		
		public RectButton3D(int xLeft, int yTop, int width, int height, String text, int zHeight) {
			super(xLeft,yTop,width,height,text);
			  this.width = width;
	    	  this.height =  height;
		}

		 
		public RectButton3D(Point topLeft, Point bottomRight, String text, int zHeight) {
		  super(topLeft, bottomRight,text);
		  width = bottomRight.getX() - super.getTopLeft().getX() + 1;
		  height = bottomRight.getY() - super.getTopLeft().getY() + 1;
		}
		
	public Point getTopLeft(){
       return super.getTopLeft();

	}


	public Point getBottomRight(){
       return super.getBottomRight();

	}

	
	public boolean isActive(){
       return super.isActive();
	}


	public void setTopLeft(Point topLeft){
   	  super.setTopLeft(topLeft);
   	  
	 }


	public void setBottomRight(Point bottomRight){
   
   	  super.setBottomRight(bottomRight);
      width = bottomRight.getX()+1;
      height = bottomRight.getY()+1;
  
	}


	public void setActive(boolean active){
      super.setActive(active);

	}


	public int getWidth(){
        return width;

	}


	public int getHeight(){
		return height;

	}


	public void moveTo(int x, int y){
		super.moveTo(x, y);
	}


	public void moveTo(Point point){
	  	  super.moveTo(point);	
	  	  }

			
	public void moveRel(int dx, int dy){
		super.moveRel(dx, dy);
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
      super.getBottomRight().setX(super.getTopLeft().getX()+width - 1);
      super.getBottomRight().setY(super.getTopLeft().getY()+height - 1);
     
	}


	public boolean isInside(int x, int y) {
       return (
    		   
    		   (super.getTopLeft().getX() + width > x & super.getTopLeft().getY() + height > y) & (x > 0 & y > 0)
    		   
    		   );


	}


	public boolean isInside(Point point){
	       return (
	    		   
	    		   (super.getTopLeft().getX() + width > point.getX() & super.getTopLeft().getY() + height > point.getY()) & (point.getX() > 0 & point.getY() > 0)
	    		   
	    		   ); 

	}


	public boolean isIntersects(RectButton rectButton){

		return  rectButton.getWidth() > 0 
				&& rectButton.getHeight() > 0 
				&& width > 0 
				&& height > 0
				&& rectButton.getTopLeft().getX() < super.getTopLeft().getX() + width 
				&& rectButton.getTopLeft().getX() + rectButton.getWidth() > super.getTopLeft().getX()
				&& rectButton.getTopLeft().getY() < super.getTopLeft().getY() + height 
				&& rectButton.getTopLeft().getY() + rectButton.getHeight() > super.getTopLeft().getY();
	}
	

	public boolean isInside(RectButton rectButton){
       return 
    		   
    		   super.getTopLeft().getX() + width > rectButton.getTopLeft().getX() 
    		   && super.getTopLeft().getY() + height > rectButton.getTopLeft().getY() 
               && rectButton.getTopLeft().getX() > 0 
               && rectButton.getTopLeft().getY() > 0; 



	}
	public boolean isInside(RectButton3D rectButton3D){
	       return 
	    		   
	    		   super.getTopLeft().getX() + width > rectButton3D.getTopLeft().getX() 
	    		   && super.getTopLeft().getY() + height > rectButton3D.getTopLeft().getY() 
	               && rectButton3D.getTopLeft().getX() > 0 
	               && rectButton3D.getTopLeft().getY() > 0; 



		}
	public String getText() {
		return super.getText();
		
	}
	

    public void setText(String text) {
    	super.setText(text);
	}


	public boolean isFullyVisibleOnDesktop(Desktop desktop) {

		final int xL0 = super.getTopLeft().getX();
		final int yL0 = super.getTopLeft().getY();
		
		
		return
				super.getTopLeft().getX() >= 0
				&& super.getTopLeft().getY() >= 0
				&& width + super.getTopLeft().getX()  <= desktop.getWidth()  
				&& (height + super.getTopLeft().getY()) <= desktop.getHeight(); 
    		  
    		  
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + height;
		result = prime * result + width;
		result = prime * result + zHeight;
		return result;
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
		RectButton3D other = (RectButton3D) obj;
		if (height != other.height) {
			return false;
		}
		if (width != other.width) {
			return false;
		}
		if (zHeight != other.zHeight) {
			return false;
		}
		return true;
	}


}
