package net.thumbtack.school.windows.v2;

public class RoundButton {
	
	  private boolean active = true;
	  private int yCenter;
	  private int radius;
	  private int xCenter;
	  private Point center = new Point();
	  private String text;
	  
	public RoundButton(Point center, int radius, boolean active, String text){
		this.center = center;
		this.radius = radius;
		this.active = active;
		this.text = text;
	}
	
	public RoundButton(Point center, int radius, boolean active){
		this.center = center;
		this.radius = radius;
		this.active = active;
		this.text = text;
	}

	public RoundButton(int xCenter, int yCenter, int radius, boolean active, String text){
		center.setX(xCenter);
		center.setY(yCenter);
		this.radius = radius;
		this.active = active;
		this.text = text;
	}

	 
	public RoundButton(Point center, int radius, String text){
		this.center = center;
		this.radius = radius;
		this.text = text;
	}


	public RoundButton(int xCenter, int yCenter, int radius, String text){
		center.setX(xCenter);
		center.setY(yCenter);
		this.radius = radius;
		this.text = text;
	}
	
public RoundButton(int xCenter, int yCenter, int radius, boolean active){
	center.setX(xCenter);
	center.setY(yCenter);
	this.radius = radius;
	this.active = active;
}

 
public RoundButton(Point center, int radius){
	this.center = center;
	this.radius = radius;
}


public RoundButton(int xCenter, int yCenter, int radius){
	center.setX(xCenter);
	center.setY(yCenter);
	this.radius = radius;
}


public Point getCenter(){
	return center;
}

  
public int getRadius(){
	return radius;
}

public boolean isActive(){
	return active;
}


public void moveTo(int x, int y){
	center.setX(x);
	center.setY(y);
}


public void moveTo(Point point){
	center = point;
}


public void setCenter(int x, int y){
	center.setX(x);
	center.setY(y);
}
	

public void setRadius(int radius){
	this.radius = radius;
}
	

public void setActive(boolean active){
	this.active = active;
}
	

public void moveRel(int dx, int dy){
	center.setX(center.getX()+dx);
	center.setY(center.getY()+dy);
}
	

public void resize(double ratio){
	if( (int)(ratio * radius) <= 1 ) {
		radius = 1;
	}
	else radius = (int)(ratio * radius);
}

 
 public boolean isInside(int x, int y) {
	 xCenter = center.getX();
	 yCenter = center.getY();
		return Math.pow((xCenter - x),2) + Math.pow((yCenter - y),2) <= Math.pow((radius),2); 
	}


 public boolean isInside(Point point){
	 xCenter = center.getX();
	 yCenter = center.getY();
	 return Math.pow((point.getX() - xCenter),2) + Math.pow((point.getY() - yCenter),2) <= Math.pow((radius),2);
	}


public boolean isFullyVisibleOnDesktop(Desktop desktop) {
		return     (center.getX() - radius) >= 0
				&& (center.getY() - radius) >= 0
				&& (center.getX() + radius) < desktop.getWidth() 
				&& (center.getY() + radius) < desktop.getHeight();
	}

public String getText() {
	//Возвращает текст окна 	
	return text;
}


public void setText(String text) {
    //Устанавливает текст окна 
	this.text = text;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (active ? 1231 : 1237);
	result = prime * result + ((center == null) ? 0 : center.hashCode());
	result = prime * result + radius;
	result = prime * result + xCenter;
	result = prime * result + yCenter;
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
	if (!(obj instanceof RoundButton)) {
		return false;
	}
	RoundButton other = (RoundButton) obj;
	if (active != other.active) {
		return false;
	}
	if (center == null) {
		if (other.center != null) {
			return false;
		}
	} else if (!center.equals(other.center)) {
		return false;
	}
	if (radius != other.radius) {
		return false;
	}
	if (xCenter != other.xCenter) {
		return false;
	}
	if (yCenter != other.yCenter) {
		return false;
	}
	return true;
}


}