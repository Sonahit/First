package net.thumbtack.school.windows.v2;

public class RectButton3D extends RectButton {
    private int zHeight;
   
	public RectButton3D(Point topLeft, Point bottomRight, boolean active, String text, int zHeight){
  	     super(topLeft, bottomRight,active,text);
		 if (topLeft.equals(bottomRight)) {
		        super.getHeight();
		        super.getWidth();
		        this.zHeight = 1;
	       }
	       else {
	     	  this.zHeight = zHeight;
	          super.getHeight();
	          super.getWidth();	     
		}
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
      super.getWidth();
      super.getHeight();
  
	}


	public void setActive(boolean active){
      super.setActive(active);

	}


	public int getWidth(){
        return super.getWidth();

	}


	public int getHeight(){
		return super.getHeight();

	}
	
	public int getZHeight(){
		return zHeight;

	}

	public void setZHeight(int zHeight){
		this.zHeight = zHeight;
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
      super.resize(ratio);
	}


	public boolean isInside(int x, int y) {
       return (
    		   
    		   (super.getTopLeft().getX() + super.getWidth() > x & super.getTopLeft().getY() + super.getHeight() > y) & (x > 0 & y > 0)
    		   
    		   );


	}


	public boolean isInside(Point point){
	       return (
	    		   
	    		   (super.getTopLeft().getX() + super.getWidth() > point.getX() & super.getTopLeft().getY() + super.getHeight() > point.getY()) & (point.getX() > 0 & point.getY() > 0)
	    		   
	    		   ); 

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
	public String getText() {
		return super.getText();
		
	}
	

    public void setText(String text) {
    	super.setText(text);
	}

	public boolean isFullyVisibleOnDesktop(Desktop desktop) {

		return
				super.getTopLeft().getX() >= 0
				&& super.getTopLeft().getY() >= 0
				&& super.getWidth() + super.getTopLeft().getX()  <= desktop.getWidth()  
				&& (super.getHeight() + super.getTopLeft().getY()) <= desktop.getHeight(); 
    		  
    		  
	}

}
