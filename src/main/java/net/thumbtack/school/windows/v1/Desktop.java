package net.thumbtack.school.windows.v1;


public class Desktop {
   private int width;
   private int height;
   public Desktop(int width, int height) {
	   this.width = width;
	   this.height = height;
   }


   public Desktop() {
	   width = 640;
	   height = 480;
   }

   public int getWidth() {
	   return width;
   }


   public int getHeight() {
	   return height;
   }


   public int getArea() {
	   return width * height;
   }


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + height;
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
	if (!(obj instanceof Desktop)) {
		return false;
	}
	Desktop other = (Desktop) obj;
	if (height != other.height) {
		return false;
	}
	if (width != other.width) {
		return false;
	}
	return true;
}






}
