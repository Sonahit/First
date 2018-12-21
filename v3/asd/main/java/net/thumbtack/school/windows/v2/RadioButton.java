package net.thumbtack.school.windows.v2;

public class RadioButton extends RoundButton {
    boolean checked = true;
	
	public RadioButton(Point center, int radius, boolean active, String text, boolean checked){
		super(center,radius,active,text);
		this.checked = checked;
	}

	public RadioButton(int xCenter, int yCenter, int radius, boolean active, String text, boolean checked){
		super(xCenter,yCenter,radius,active,text);
		super.setCenter(xCenter, yCenter);
		this.checked = checked;
	}

	 
	public RadioButton(Point center, int radius, String text, boolean checked){
		super(center,radius,text);
		this.checked = checked;
	}


	public RadioButton(int xCenter, int yCenter, int radius, String text, boolean checked){
		super(xCenter,yCenter,radius,text);
		super.setCenter(xCenter, yCenter);
		this.checked = checked;
	}
	
public Point getCenter(){
	return super.getCenter();
}


public int getRadius(){
	return super.getRadius();
}

public boolean isActive(){
	return super.isActive();
}

public boolean isChecked() {
	return checked;
}
public void setChecked(boolean checked) {
	this.checked = checked;
}
public void moveTo(int x, int y){
	super.moveTo(x, y);
}


public void moveTo(Point point){
	super.moveTo(point);
}


public void setCenter(int x, int y){
	super.setCenter(x, y);
}
	

public void setRadius(int radius){
	super.setRadius(radius);
}
	

public void setActive(boolean active){
	super.setActive(active);
}
	

public void moveRel(int dx, int dy){
	super.moveRel(dx, dy);
}
	

public void resize(double ratio){
	super.resize(ratio);
}


public boolean isInside(int x, int y) {
		return Math.pow((super.getCenter().getX() - x),2) + Math.pow((super.getCenter().getY() - y),2) <= Math.pow((super.getRadius()),2); 
	}


public boolean isInside(Point point){

	 return Math.pow((point.getX() -super.getCenter().getX()),2) + Math.pow((point.getY() -super.getCenter().getY()),2) <= Math.pow((super.getRadius()),2);
	}


public boolean isFullyVisibleOnDesktop(Desktop desktop) {
		return     (super.getCenter().getX() - super.getRadius()) >= 0
				&& (super.getCenter().getY() - super.getRadius()) >= 0
				&& (super.getCenter().getX() + super.getRadius()) < desktop.getWidth() 
				&& (super.getCenter().getY() + super.getRadius()) < desktop.getHeight();
	}

public String getText() {
	
	return super.getText();
}


public void setText(String text) {

	super.setText(text);
}
}
