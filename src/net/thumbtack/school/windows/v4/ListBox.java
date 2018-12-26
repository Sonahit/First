package net.thumbtack.school.windows.v4;

import java.util.Arrays;

import net.thumbtack.school.windows.v4.base.*;


public class ListBox extends RectWindow {

	private String [] lines;
	private ComboBox sell;
	public ListBox(Point topLeft, Point bottomRight,  WindowState state, String[] lines)throws WindowException {
	      super(topLeft,bottomRight);
	      setLines(lines);
	      if(state == WindowState.DESTROYED) throw new WindowException(WindowErrorCode.WRONG_STATE);
	      super.setState(state);
	    	  try {
	    	      this.lines = new String [lines.length];
	    	      }
	    	      catch(NullPointerException exc) {
	    	    	  this.lines = null;
	    	      }
	      setLines(lines);
	}
	public ListBox(int xLeft, int yTop, int width, int height,  WindowState state, String[] lines) throws WindowException {
	      super(xLeft,yTop,width,height);
	      super.getTopLeft();
	      super.getBottomRight();
	      try {
		      this.lines = new String [lines.length];
		      }
		      catch(NullPointerException exc) {
		    	  this.lines = null;
		      }
		      setLines(lines);
	      if(state == WindowState.DESTROYED) throw new WindowException(WindowErrorCode.WRONG_STATE);
	      super.setState(state);
		
	}

	public ListBox(int xLeft, int yTop, int width, int height, String status, String[] lines) throws WindowException {
	      super(xLeft,yTop,width,height);
	      super.getTopLeft();
	      super.getBottomRight();
	      if(lines != null) {
		      this.lines = new String [lines.length];
		      setLines(lines);
		      }
		      else setLines(null);
	      if(status == "ACTIVE"
	    		  || status == "INACTIVE") 
		      super.setState(WindowState.valueOf(status));
	      else throw new WindowException(WindowErrorCode.WRONG_STATE);

		
	}
	
	public ListBox(Point topLeft, Point bottomRight, String status, String[] lines) throws WindowException {
	    super(topLeft,bottomRight);
   	    super.getHeight();
   	    super.getWidth();
   	 try {
	      this.lines = new String [lines.length];
	      }
	      catch(NullPointerException exc) {
	    	  this.lines = null;
	      }
	      setLines(lines);
	      if(status == "ACTIVE"
	    		  || status == "INACTIVE") 
		      super.setState(WindowState.valueOf(status));
	      else throw new WindowException(WindowErrorCode.WRONG_STATE);
	}
	
	public ListBox(Point topLeft, Point bottomRight,  String[] lines) throws WindowException{
	    super(topLeft,bottomRight);
   	    super.getHeight();
   	    super.getWidth();
   	 try {
	      this.lines = new String [lines.length];
	      }
	      catch(NullPointerException exc) {
	    	  this.lines = null;
	      }
     setLines(lines);
	}
	
	public ListBox(int xLeft, int yTop, int width, int height, String[] lines) throws WindowException{
	      super(xLeft,yTop,width,height);
	      super.getTopLeft();
	      super.getBottomRight();
	      try {
	      this.lines = new String [lines.length];
	      }
	      catch(NullPointerException exc) {
	    	  this.lines = null;
	      }
	      setLines(lines);
	}
	

    public void checkIndex(int index, String [] lines) throws WindowException {
    	try {
    		String temp;
    		temp = lines[index];
    		lines[index] = temp;
    	}
    	catch (NullPointerException ex) {
    		throw new WindowException(WindowErrorCode.EMPTY_ARRAY);
    	}
    	catch (ArrayIndexOutOfBoundsException ex) {
    		throw new WindowException(WindowErrorCode.WRONG_INDEX);
    	}
    }
	
	public String[] getLinesSlice(int from, int to) throws WindowException {
	    try {
    		if(getLines().length < to || to == from) {
    			throw new WindowException(WindowErrorCode.WRONG_INDEX);
    		}
			String temp[] = new String [(to-from)];
	    	for(int i = 0; i < to - from; i++) {
	    		temp[i] = getLines()[i+from];
	    	}
	    	return temp;
	    }
	    catch(NullPointerException e) {
	    	throw new WindowException(WindowErrorCode.EMPTY_ARRAY);
	    }
	    catch(ArrayIndexOutOfBoundsException e) {
	    	throw new WindowException(WindowErrorCode.WRONG_INDEX);
	    }
	}

	public String getLine(int index) throws WindowException{
		try {
		if(index >= getLines().length) {
			throw new WindowException(WindowErrorCode.WRONG_INDEX);
		}
	    return getLines()[index];
		}
		catch(NullPointerException exc) {
			throw new WindowException(WindowErrorCode.EMPTY_ARRAY);
		}
	}
	public String[] getLines() throws WindowException{
		try {
		return lines;
		}
		catch(NullPointerException exc ) {
			return null;
		}
	}

	public void setLines(String[] lines) throws WindowException{
		if(lines == null) {
			this.lines = null;
		}
		else {
    	this.lines = new String [lines.length];
		System.arraycopy(lines, 0, this.lines, 0, lines.length);
		}
}
	
	
	public void setLine(int index, String line) throws WindowException{
		    checkIndex(index,getLines());
			getLines()[index] = line;
		
	}
	public Integer findLine(String line)throws WindowException {
		if(getLines() != null) {
	    for(int index = 0; index < getLines().length;  index++ ) {
	    		if(getLines()[index].equals(line)) return index;
	    	}
		}
	    return null; 
	}
	public void reverseLineOrder() throws WindowException{
	     if(getLines() != null) {
	    	 int start = 0;
	    	 int end = getLines().length - 1;
             while(start < end) {
            	 String temp = getLines()[start];
            	 getLines()[start] = getLines()[end];
            	 getLines()[end] = temp;  	 
            	 start++;
            	 end--;
	          }
         }
	}
	public void reverseLines() throws WindowException{
		if(getLines() != null) {
		   for(int i = 0; i < getLines().length ; i++) {
			   StringBuilder strb = new StringBuilder (getLines()[i]);
			   strb.reverse();
			   getLines()[i] = strb.toString();
	       }
		}
	}
	public void duplicateLines() throws WindowException{
	if(getLines() != null) {
	    String [] temp = getLines();
	    temp = new String [temp.length * 2];
	    int j = 1;
	    int k = 0;
	    for(int i = 0; i < getLines().length; i++) {
		    System.out.println(getLines()[i]);
		    temp[k] = getLines()[i];
	    	temp[j] = getLines()[i];
		    System.out.println(temp[j]);
	    	j = j + 2;
	    	k = k +2;
	    	if(j > temp.length) break;
	    }
	    setLines(temp.clone()); 
	}
	}
	public void removeOddLines() throws WindowException{
		 if(getLines() != null) {

			    for(int i = 0; i < getLines().length ; i++) {
			    	if(i % 2 == 1) {
			    		getLines()[i] = "";
			    	}
			    }
				String [] temp = getLines();
				if( getLines().length % 2 == 0 ) 
				    temp = new String [getLines().length / 2];
				else 
					temp = new String [getLines().length / 2 + 1];
				int j = 0;
			    for(int i = 0; i < getLines().length ; i++) {
			    	if(getLines()[i] != "") {
			    		   temp[j] = getLines()[i];
			    		   j++;
			    	}
			    }
			    setLines(temp.clone()); 
			 }
	} 
	public boolean isSortedDescendant() throws WindowException{
		if(getLines() != null) {
		   for(int i = 0; i < getLines().length - 1; i++) {
              if(getLines()[i].charAt(getLines()[i].length()-1) > getLines()[i+1].charAt(getLines()[i+1].length()-1)) {
              }
              else return false;
		   }
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.hashCode(lines);
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
		ListBox other = (ListBox) obj;
		return Arrays.equals(lines, other.lines);
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
