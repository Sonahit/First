package net.thumbtack.school.windows.v4.cursors;
import net.thumbtack.school.windows.v4.Point;
import net.thumbtack.school.windows.v4.iface.Movable;

public class Cursor implements Movable {
	private int x;
	private int y;
	private CursorForm Form;
	
	
public Cursor(int x, int y, CursorForm Form) {
	this.x = x;
	this.y = y;
	this.Form = Form;

}
	
public Cursor(Point point, CursorForm Form) {

    this.x = point.getX();
    this.y = point.getY();
    this.Form = Form;
}
public CursorForm getCursorForm() {
	try {
    return Form.getForm();
	}
	catch(NullPointerException exc){
		return null;
	}
}
public  void setCursorForm(CursorForm Form)  {
	    this.Form = Form;


}
public  int getX() {

    return x;
}
public  int getY() {

    return y;
}
public void setX(int x)  {

   this.x = x;
}

public void setY(int y)  {

   this.y = y;
}
public void moveTo(int x, int y) {

    this.x = x;
    this.y = y;
}

public void moveRel(int dx, int dy) {
   this.x = x + dx;
   this.y = y + dy;
}
}