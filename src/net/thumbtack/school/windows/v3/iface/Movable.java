package net.thumbtack.school.windows.v3.iface;
import net.thumbtack.school.windows.v3.Point;

public interface Movable {
	
	void moveTo(int x, int y) ;
	
	void moveRel(int dx, int dy) ;
    
    
	void moveTo(Point point) ;

 
}
