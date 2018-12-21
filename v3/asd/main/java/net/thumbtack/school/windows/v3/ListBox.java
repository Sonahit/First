package net.thumbtack.school.windows.v3;
import net.thumbtack.school.windows.v3.base.RectWindow;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringJoiner;

public class ListBox extends RectWindow {
	
	private String [] lines = new String [0];
	
	public ListBox(Point topLeft, Point bottomRight, boolean active, String[] lines) {
	      super(topLeft,bottomRight,active);
	      this.lines = lines;
	      
	}
	public ListBox(int xLeft, int yTop, int width, int height, boolean active, String[] lines) {
	      super(xLeft,yTop,width,height,active);
	      super.getTopLeft();
	      super.getBottomRight();
	      this.lines = lines;
	       if(lines == null) this.lines = null;
	       else this.lines = lines.clone();
		
	}
	public ListBox(Point topLeft, Point bottomRight,  String[] lines){
	    super(topLeft,bottomRight);
   	    super.getHeight();
   	    super.getWidth();
	       if(lines == null) this.lines = null;
	       else this.lines = lines.clone();
	}
	public ListBox(int xLeft, int yTop, int width, int height, String[] lines){
	      super(xLeft,yTop,width,height);
	      super.getTopLeft();
	      super.getBottomRight();
	       if(lines == null) this.lines = null;
	       else this.lines = lines.clone();
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

	public boolean isIntersects(ListBox listBox) {
	      return 
	    		  listBox.getWidth() > 0 
					&& listBox.getHeight() > 0 
					&& super.getWidth() > 0 
					&& super.getHeight() > 0
					&& listBox.getTopLeft().getX() < super.getTopLeft().getX() + super.getWidth()
					&& listBox.getTopLeft().getX() + listBox.getWidth() > super.getTopLeft().getX()
					&& listBox.getTopLeft().getY() < super.getTopLeft().getY() + super.getHeight()
					&& listBox.getTopLeft().getY() + listBox.getHeight() > super.getTopLeft().getY();


		}
	
	public boolean isInside(ListBox listBox) {
		
	return	 super.getTopLeft().getX() + super.getWidth()> listBox.getTopLeft().getX() 
 		   && super.getTopLeft().getY() + super.getHeight() > listBox.getTopLeft().getY() 
           && listBox.getTopLeft().getX() > 0 
           && listBox.getTopLeft().getY() > 0; 



}

}
