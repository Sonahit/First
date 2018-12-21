package net.thumbtack.school.windows.v2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringJoiner;

public class ListBox {
	
	private Point topLeft = new Point();
	private Point bottomRight = new Point();
	private int width;
	private int height;
	private boolean active = true;
	private String [] lines = new String [0];
	
	public ListBox(Point topLeft, Point bottomRight, boolean active, String[] lines) {
	       if (topLeft.equals(bottomRight)) {
	     	  height = 1;
	     	  width = 1;
	        }
	        else {
		      this.topLeft = topLeft;
		      this.bottomRight = bottomRight;
	     	  width = this.bottomRight.getX() - this.topLeft.getX()   + 1;
	     	  height =  this.bottomRight.getY() - this.topLeft.getY()   + 1;
	        }
	       if(lines == null) this.lines = null;
	       else this.lines = lines.clone();

	        this.active = active;
	}
	public ListBox(int xLeft, int yTop, int width, int height, boolean active, String[] lines) {
	    topLeft.setX(xLeft);
		topLeft.setY(yTop);
		bottomRight.setX((width+xLeft)-1);
		bottomRight.setY((height+yTop)-1);
		this.width = width;
		this.height =  height;
        this.active = active;
	       if(lines == null) this.lines = null;
	       else this.lines = lines.clone();
		
	}
	public ListBox(Point topLeft, Point bottomRight,  String[] lines){
     	this.topLeft = topLeft;
    	this.bottomRight = bottomRight;
   	    width = this.bottomRight.getX() - this.topLeft.getX()   + 1;
   	    height =  this.bottomRight.getY() - this.topLeft.getY()   + 1;
	       if(lines == null) this.lines = null;
	       else this.lines = lines.clone();
	}
	public ListBox(int xLeft, int yTop, int width, int height, String[] lines){
		topLeft.setX(xLeft);
		topLeft.setY(yTop);
		bottomRight.setX((width+xLeft)-1);
		bottomRight.setY((height+yTop)-1);
		this.width = width;
		this.height = height;
	       if(lines == null) this.lines = null;
	       else this.lines = lines.clone();
	}
	public Point getTopLeft() {
	    return topLeft;
	}
	public Point getBottomRight() {
	    return bottomRight;
	}
	public boolean isActive() {
	    return active;
	}
	public void setTopLeft(Point topLeft) {

     	this.topLeft = topLeft;
	
	}
	public void setBottomRight(Point bottomRight) {
	   	  this.bottomRight = bottomRight;
	      width = bottomRight.getX()+1;
	      height = bottomRight.getY()+1;
	}
	public void setActive(boolean active) {

	    this.active = active;
	}
	public int getWidth() {

	    return width;
	}
	public int getHeight() {

	    return height;
	}
	public String[] getLines() {
	    return lines;
	}
	
	public void setLines(String[] lines) {
		
	       if(lines == null) this.lines = null;
	       else this.lines = lines.clone();
	}
	public String[] getLinesSlice(int from, int to) {
	    
		if(lines != null) {
    		if(lines.length < to) {
    			to = lines.length;
    		}
			String temp[] = new String [(to-from)];
	    	for(int i = 0; i < to - from; i++) {
	    		temp[i] = lines[i+from];
	    	}
	    	return temp;
		}
       return null;
	}

	public String getLine(int index) {
	    if (index > lines.length - 1) return null;
	    return lines[index];
	
	}

	public void setLine(int index, String line) {
		if(lines != null) {
			lines[index] = line;
		}		
	}
	public Integer findLine(String line) {
		if(lines != null) {
	    for(int index = 0; index < lines.length;  index++ ) {
	    		if(lines[index].equals(line)) return index;
	    	}
		}
	    return null; 
	}
	public void reverseLineOrder() {
	     if(lines != null) {
	    	 int start = 0;
	    	 int end = lines.length - 1;
             while(start < end) {
            	 String temp = lines[start];
            	 lines[start] = lines[end];
            	 lines[end] = temp;  	 
            	 start++;
            	 end--;
	          }
         }
	}
	public void reverseLines() {
		if(lines != null) {
		   for(int i = 0; i < lines.length ; i++) {
			   StringBuilder strb = new StringBuilder (lines[i]);
			   strb.reverse();
			   lines[i] = strb.toString();
	       }
		}
	}
	public void duplicateLines() {
	if(lines != null) {
	    String [] temp = lines;
	    temp = new String [temp.length * 2];
	    int j = 1;
	    int k = 0;
	    for(int i = 0; i < lines.length; i++) {
		    System.out.println(lines[i]);
		    temp[k] = lines[i];
	    	temp[j] = lines[i];
		    System.out.println(temp[j]);
	    	j = j + 2;
	    	k = k +2;
	    	if(j > temp.length) break;
	    }
	    lines = temp.clone();
	}
	}
	public void removeOddLines() {
	 if(lines != null) {

	    for(int i = 0; i < lines.length ; i++) {
	    	if(i % 2 == 1) {
	    		   lines[i] = "";
	    	}
	    }
		String [] temp = lines;
		if( lines.length % 2 == 0 ) 
		    temp = new String [lines.length / 2];
		else 
			temp = new String [lines.length / 2 + 1];
		int j = 0;
	    for(int i = 0; i < lines.length ; i++) {
	    	if(lines[i] != "") {
	    		   temp[j] = lines[i];
	    		   j++;
	    	}
	    }
	    lines = temp.clone();
	 }
	} 
	public boolean isSortedDescendant() {
		if(lines != null) {
		   for(int i = 0; i < lines.length - 1; i++) {
              if(lines[i].charAt(lines[i].length()-1) > lines[i+1].charAt(lines[i+1].length()-1)) {
              }
              else return false;
		   }
		}
		return true;
	}
	public void moveTo(int x, int y) {
		topLeft.setX(x);
		topLeft.setY(y);
		bottomRight.setX(topLeft.getX()+width-1);
		bottomRight.setY(topLeft.getY()+height-1);
	}
	public void moveTo(Point point) {
	  	  topLeft = point;
		  bottomRight.setX(topLeft.getX()+width-1);
		  bottomRight.setY(topLeft.getY()+height-1);
		}	
	public void moveRel(int dx, int dy) {
		topLeft.setX(topLeft.getX()+dx);
		topLeft.setY(topLeft.getY()+dy);
		bottomRight.setX(topLeft.getX()+width-1);
		bottomRight.setY(topLeft.getY()+height-1);
		}
	public void resize(double ratio) {
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
	public boolean isInside(Point point) {
	       return (
	    		   
	    		   (topLeft.getX() + width > point.getX() & topLeft.getY() + height > point.getY()) & (point.getX() > 0 & point.getY() > 0)
	    		   
	    		   ); 

	}
	public boolean isIntersects(ListBox listBox) {
	      return 
	    		  listBox.getWidth() > 0 
					&& listBox.getHeight() > 0 
					&& width > 0 
					&& height > 0
					&& listBox.getTopLeft().getX() < topLeft.getX() + width 
					&& listBox.getTopLeft().getX() + listBox.getWidth() > topLeft.getX()
					&& listBox.getTopLeft().getY() < topLeft.getY() + height 
					&& listBox.getTopLeft().getY() + listBox.getHeight() > topLeft.getY();


		}
	
	public boolean isInside(ListBox listBox) {
		
	return	 topLeft.getX() + width > listBox.getTopLeft().getX() 
 		   && topLeft.getY() + height > listBox.getTopLeft().getY() 
           && listBox.getTopLeft().getX() > 0 
           && listBox.getTopLeft().getY() > 0; 



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
		result = prime * result + Arrays.hashCode(lines);
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
		ListBox other = (ListBox) obj;
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
		if (!Arrays.equals(lines, other.lines)) {
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
