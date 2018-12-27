package net.thumbtack.school.windows.v4.iface;
import net.thumbtack.school.windows.v4.Point;


public interface Movable {

	
	void moveTo(int x, int y);
	
	void moveRel(int dx, int dy) ;
    
    
	default void moveTo(Point point) {
	   moveTo(point.getX(), point.getY());
	}
}
