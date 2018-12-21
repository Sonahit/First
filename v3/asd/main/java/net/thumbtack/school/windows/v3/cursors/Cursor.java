package net.thumbtack.school.windows.v3.cursors;
import net.thumbtack.school.windows.v3.*;

public class Cursor {
	private int x;
	private int y;
	private int cursorForm;
	
	public Cursor(int x, int y, int cursorForm) {
	this.x = x;
	this.y = y;
	this.cursorForm = cursorForm;
//	Создает курсор указанной формы. Мы пока не будем конкретизировать понятие вида курсора, а просто будем считать, что имеются различные формы курсоров, каждая форма имеет свой номер, нумерация произвольная. Курсор помещается в точку (x,y).
	}
	
public Cursor(Point point, int cursorForm) {
//	Создает курсор указанной формы. Курсор помещается в точку point.
    this.x = point.getX();
    this.y = point.getY();
    this.cursorForm = cursorForm;
}
public int getCursorForm() {
//	Возвращает форму курсора.
    return cursorForm;
}
public  void setCursorForm(int cursorForm) {
//	Устанавливает форму курсора.
    this.cursorForm = cursorForm;
}
public  int getX() {
//	Возвращает x-координату курсора.
    return x;
}
public  int getY() {
//	Возвращает y-координату курсора.
    return y;
}
public void setX(int x) {
//Устанавливает x-координату курсора.
   this.x = x;
}

public void setY(int y) {
//Устанавливает y-координату курсора.
   this.y = y;
}
public void moveTo(int x, int y) {
//	Перемещает курсор в точку (x,y).
    this.x = x;
    this.y = y;
}
public void moveTo(Point point) {
	//Перемещает курсор в точку point.
    this.x = point.getX();
    this.y = point.getY();
}
public void moveRel(int dx, int dy) {
   this.x = x + dx;
   this.y = y + dy;
}
}