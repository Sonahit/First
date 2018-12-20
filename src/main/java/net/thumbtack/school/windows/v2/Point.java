package main.java.net.thumbtack.school.windows.v2;

class Point { 
	private int x;
	private int y;
	
	public Point (int x , int y) {
		this.x = x;
		this.y = y;
	}
		
	public Point() {
		x = 0;
		y = 0;
	}
	public Point(Point Point) {
    x = Point.getX();
    y = Point.getY();
	}
	
	public int getX () {
		return x;
	}
	
	public int getY () {
		return y;
	}
	
	
	public void setX (int x) {
		this.x = x;
	}
	
	public void setY (int y) {
		this.y = y;
	}
	
	
	public void moveTo(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void moveRel(int dx, int dy) {
		this.x = this.x + dx;
		this.y = this.y + dy;
	}
	
	public boolean isVisibleOnDesktop (Desktop desktop) {
		return (((desktop.getWidth() > x) & (x > 0)) && (y > 0 & (desktop.getHeight() > y)));
	}
	
	public boolean isNotVisibleOnDesktop (Desktop desktop) {
		return ((x <= desktop.getWidth()) & (x <= 0) ) || ( (y <= 0) & (y <= desktop.getHeight()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}



}


