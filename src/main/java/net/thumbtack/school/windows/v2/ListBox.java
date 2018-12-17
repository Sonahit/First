package net.thumbtack.school.windows.v2;

import java.util.Arrays;

public class ListBox {
	
	private Point topLeft = new Point();
	private Point bottomRight = new Point();
	private int width;
	private int height;
	private boolean active = true;
	private String [] lines = {""};
	
	public ListBox(Point topLeft, Point bottomRight, boolean active, String[] lines) {
		/*Создает ListBox по координатам углов - левого верхнего и правого нижнего, 
		флагу активности и набору строк. 
		Обращаем внимание на то, что обе точки входят в ListBox, 
		так что если создать ListBox с topLeft.equals(bottomRight), 
		то будет создан ListBox ширины и высоты 1. Параметр lines может быть null.*/
	       if (topLeft.equals(bottomRight)) {
	     	  height = 1;
	     	  width = 1;
	        }
	        else {
	     	  width = this.bottomRight.getX() - this.topLeft.getX()   + 1;
	     	  height =  this.bottomRight.getY() - this.topLeft.getY()   + 1;
	        }
	     	this.topLeft = topLeft;
	    	this.bottomRight = bottomRight;
	        this.lines = lines;
	        this.active = active;
	}
	public ListBox(int xLeft, int yTop, int width, int height, boolean active, String[] lines) {
		//Создает ListBox по координатам левого верхнего угла, ширине, высоте, флагу активности и набору строк. Параметр lines может быть null.
		topLeft.setX(xLeft);
		topLeft.setY(yTop);
		bottomRight.setX((width+xLeft)-1);
		bottomRight.setY((height+yTop)-1);
		this.width = width;
		this.height =  height;
        this.lines = lines;
        this.active = active;
		
	}
	public ListBox(Point topLeft, Point bottomRight,  String[] lines){
		//Создает активный ListBox по координатам углов - левого верхнего и правого нижнего и набору строк. Параметр lines может быть null.
     	this.topLeft = topLeft;
    	this.bottomRight = bottomRight;
        this.lines = lines;
	}
	public ListBox(int xLeft, int yTop, int width, int height, String[] lines){
		//Создает активный ListBox по координатам левого верхнего угла, ширине и высоте и набору строк. Параметр lines может быть null.
		topLeft.setX(xLeft);
		topLeft.setY(yTop);
		bottomRight.setX((width+xLeft)-1);
		bottomRight.setY((height+yTop)-1);
		this.width = width;
		this.height =  height;
        this.lines = lines;
	}
	public Point getTopLeft() {
		//		Возвращает левую верхнюю точку ListBox.
	    return topLeft;
	}
	public Point getBottomRight() {
		//	Возвращает правую нижнюю точку ListBox.
	    return bottomRight;
	}
	public boolean isActive() {
		//Возвращает true, если ListBox активен, иначе false
	    return active;
	}
	public void setTopLeft(Point topLeft) {
		//	Устанавливает левую верхнюю точку ListBox.
     	this.topLeft = topLeft;
	
	}
	public void setBottomRight(Point bottomRight) {
		//	Устанавливает правую нижнюю точку ListBox.
    	this.bottomRight = bottomRight;
	}
	public void setActive(boolean active) {
			//Устанавливает состояние активности ListBox.
	    this.active = active;
	}
	public int getWidth() {
		//	Возвращает ширину ListBox.
	    return width;
	}
	public int getHeight() {
			//	Возвращает высоту ListBox.
	    return height;
	}
	public String[] getLines() {
			//	Возвращает копию набора строк ListBox.
	    return lines;
	}
	public void setLines(String[] lines) {
			//Устанавливает набор строк ListBox.
	    this.lines = lines;
	}
	public String[] getLinesSlice(int from, int to) {
		//Возвращает набор строк ListBox, начиная со строки “from” и до строки (“to”-1) включительно . 
		//Если в ListBox строк меньше, чем “to”, возвращает строки от “from” и до конца. 
		// Гарантируется, что “from” < “to”. Если массив строк равен null, возвращает null.
	    String temp[] = {""};
	    	for(int i = from; i < to; i++) {
	    		if(lines[i] == null) {
	    			return null;
	    		}
	    		if(lines[i].length() < to) {
	    			to = lines[i].length();
	    		}
	    		temp[i] = lines[i].substring(from, to);
	    	}
	    	return temp;
	}

	public String getLine(int index) {
		//Возвращает строку с номером index. Если строки с таким номером нет или массив строк равен null, возвращает null.
	    if(lines[index] == null) return null;
	    return lines[index];
	
	}
	public void setLine(int index, String line) {
		//Заменяет строку с номером index. Если строки с таким номером нет или массив строк равен null, ничего не делает.
		if(lines[index] != null) {
			lines[index] = line;
		}
		
	}
	public Integer findLine(String line) {
		//	Ищет  первую совпадающую с line строку в массиве строк ListBox. Если строка найдена, возвращает ее индекс, в противном случае возвращает null.
	    for(int index = 0; index < lines.length;  index++ ) {
	    	if(line == lines[index]) {
	    		return index;
	    	}
	    }
	    return null; 
	}
	public void reverseLineOrder() {
		//Переворачивает массив строк ListBox., то есть делает 0-ю строку - последней, первую - предпоследней и т.д. Если массив строк равен null, не делает ничего.
	   for(int i = lines.length; i > -1; i--) {
		   lines[i] = lines[lines.length-i];
		   if( i == lines.length) break;
	   }
	}
	public void reverseLines() {
		//Переворачивает каждую строку в массиве строк ListBox.Если массив строк равен null, не делает ничего.
		   for(int i = 0; i < lines.length ; i++) {
			   char [] reverse  = {};
               reverse = lines[i].toCharArray();
               int length = reverse.length - 1;
               for(int c = 0; c < reverse.length - 1; c++) {
            	   char temp;
            	   temp = reverse[c];
            	   reverse[c] = reverse[length];
            	   reverse[length] = temp;
            	   length--;
            	   if(c == length || c == length - 1 ) break;
               }
               String line = Arrays.toString(reverse);
               lines[i] = line.replaceAll("\\W+", "");
		   System.out.print(lines[i] + "\t");
	   }
	}
	public void duplicateLines() {
		//	Заменяет массив строк на новый массив, вместо каждой строки вставлены две копии ее. Если массив строк равен null, не делает ничего.
	    for(int i = 0; i < lines.length ; i++) {
	    	lines[i] = "ee";
	    }
	}
	public void removeOddLines() {
		//	Заменяет массив строк на новый массив, в котором каждая нечетная исходная строка удалена. Если массив строк равен null или содержит только одну строку, не делает ничего.
	    for(int i = 0; i < lines.length ; i++) {
	    	if(i % 2 == 1) {
	    			lines[i] = "";
	    	}
	    }
	} 
	public boolean isSortedDescendant() {
		//	Возвращает true, если массив строк строго упорядочен по убыванию, иначе false. Если массив строк равен null, возвращает true.
		return false;
	}
	public void moveTo(int x, int y) {
		//		Передвигает ListBox  так, чтобы левый верхний угол его оказался в точке (x, y).
	}
	public void moveTo(Point point) {
		//		Передвигает ListBox  так, чтобы левый верхний угол его оказался в точке point.
		}	
	public void moveRel(int dx, int dy) {
		//	Передвигает ListBox на (dx, dy).
		}
	public void resize(double ratio) {
		//	Изменяет ширину и длину ListBox в ratio раз при сохранении координат левой верхней точки. Дробная часть вычисленной длины или ширины отбрасывается. Если при таком изменении длина или ширина какой-то из сторон окажется меньше 1, то она принимается равной 1.
		}
	public boolean isInside(int x, int y) {
		//	Определяет, лежит ли точка (x, y) внутри ListBox. Если точка лежит на стороне, считается, что она лежит внутри.
	return false;
	}
	public boolean isInside(Point point) {
		//	Определяет, лежит ли точка point внутри ListBox. Если точка лежит на стороне, считается, что она лежит внутри.
		return false;
	}
	public boolean isIntersects(ListBox listBox) {
		//	Определяет, пересекается  ли ListBox с другим ListBox. Считается, что ListBox’ы пересекаются, если у них есть хоть одна общая точка.
		return false;
	}
	public boolean isInside(ListBox listBox) {
		//	Определяет, лежит ли ListBox целиком внутри текущего ListBox. 
		return false;
	}
	public boolean isFullyVisibleOnDesktop(Desktop desktop) {
	//Определяет, верно ли, что весь ListBox находится в пределах Desktop. 
		return false;
	}
/*	методы equals и hashCode.  
	Не пишите эти методы сами, используйте средства IDEA. 
*/
}
