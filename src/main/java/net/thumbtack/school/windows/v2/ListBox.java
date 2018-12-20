package main.java.net.thumbtack.school.windows.v2;

import java.util.Arrays;

public class ListBox {
	
	private Point topLeft = new Point();
	private Point bottomRight = new Point();
	private int width;
	private int height;
	private boolean active = true;
	private String [] lines = {""};
	
	public ListBox(Point topLeft, Point bottomRight, boolean active, String[] lines) {
		/*РЎРѕР·РґР°РµС‚ ListBox РїРѕ РєРѕРѕСЂРґРёРЅР°С‚Р°Рј СѓРіР»РѕРІ - Р»РµРІРѕРіРѕ РІРµСЂС…РЅРµРіРѕ Рё РїСЂР°РІРѕРіРѕ РЅРёР¶РЅРµРіРѕ, 
		С„Р»Р°РіСѓ Р°РєС‚РёРІРЅРѕСЃС‚Рё Рё РЅР°Р±РѕСЂСѓ СЃС‚СЂРѕРє. 
		РћР±СЂР°С‰Р°РµРј РІРЅРёРјР°РЅРёРµ РЅР° С‚Рѕ, С‡С‚Рѕ РѕР±Рµ С‚РѕС‡РєРё РІС…РѕРґСЏС‚ РІ ListBox, 
		С‚Р°Рє С‡С‚Рѕ РµСЃР»Рё СЃРѕР·РґР°С‚СЊ ListBox СЃ topLeft.equals(bottomRight), 
		С‚Рѕ Р±СѓРґРµС‚ СЃРѕР·РґР°РЅ ListBox С€РёСЂРёРЅС‹ Рё РІС‹СЃРѕС‚С‹ 1. РџР°СЂР°РјРµС‚СЂ lines РјРѕР¶РµС‚ Р±С‹С‚СЊ null.*/
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
		//РЎРѕР·РґР°РµС‚ ListBox РїРѕ РєРѕРѕСЂРґРёРЅР°С‚Р°Рј Р»РµРІРѕРіРѕ РІРµСЂС…РЅРµРіРѕ СѓРіР»Р°, С€РёСЂРёРЅРµ, РІС‹СЃРѕС‚Рµ, С„Р»Р°РіСѓ Р°РєС‚РёРІРЅРѕСЃС‚Рё Рё РЅР°Р±РѕСЂСѓ СЃС‚СЂРѕРє. РџР°СЂР°РјРµС‚СЂ lines РјРѕР¶РµС‚ Р±С‹С‚СЊ null.
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
		//РЎРѕР·РґР°РµС‚ Р°РєС‚РёРІРЅС‹Р№ ListBox РїРѕ РєРѕРѕСЂРґРёРЅР°С‚Р°Рј СѓРіР»РѕРІ - Р»РµРІРѕРіРѕ РІРµСЂС…РЅРµРіРѕ Рё РїСЂР°РІРѕРіРѕ РЅРёР¶РЅРµРіРѕ Рё РЅР°Р±РѕСЂСѓ СЃС‚СЂРѕРє. РџР°СЂР°РјРµС‚СЂ lines РјРѕР¶РµС‚ Р±С‹С‚СЊ null.
     	this.topLeft = topLeft;
    	this.bottomRight = bottomRight;
        this.lines = lines;
	}
	public ListBox(int xLeft, int yTop, int width, int height, String[] lines){
		//РЎРѕР·РґР°РµС‚ Р°РєС‚РёРІРЅС‹Р№ ListBox РїРѕ РєРѕРѕСЂРґРёРЅР°С‚Р°Рј Р»РµРІРѕРіРѕ РІРµСЂС…РЅРµРіРѕ СѓРіР»Р°, С€РёСЂРёРЅРµ Рё РІС‹СЃРѕС‚Рµ Рё РЅР°Р±РѕСЂСѓ СЃС‚СЂРѕРє. РџР°СЂР°РјРµС‚СЂ lines РјРѕР¶РµС‚ Р±С‹С‚СЊ null.
		topLeft.setX(xLeft);
		topLeft.setY(yTop);
		bottomRight.setX((width+xLeft)-1);
		bottomRight.setY((height+yTop)-1);
		this.width = width;
		this.height =  height;
        this.lines = lines;
	}
	public Point getTopLeft() {
		//		Р’РѕР·РІСЂР°С‰Р°РµС‚ Р»РµРІСѓСЋ РІРµСЂС…РЅСЋСЋ С‚РѕС‡РєСѓ ListBox.
	    return topLeft;
	}
	public Point getBottomRight() {
		//	Р’РѕР·РІСЂР°С‰Р°РµС‚ РїСЂР°РІСѓСЋ РЅРёР¶РЅСЋСЋ С‚РѕС‡РєСѓ ListBox.
	    return bottomRight;
	}
	public boolean isActive() {
		//Р’РѕР·РІСЂР°С‰Р°РµС‚ true, РµСЃР»Рё ListBox Р°РєС‚РёРІРµРЅ, РёРЅР°С‡Рµ false
	    return active;
	}
	public void setTopLeft(Point topLeft) {
		//	РЈСЃС‚Р°РЅР°РІР»РёРІР°РµС‚ Р»РµРІСѓСЋ РІРµСЂС…РЅСЋСЋ С‚РѕС‡РєСѓ ListBox.
     	this.topLeft = topLeft;
	
	}
	public void setBottomRight(Point bottomRight) {
		//	РЈСЃС‚Р°РЅР°РІР»РёРІР°РµС‚ РїСЂР°РІСѓСЋ РЅРёР¶РЅСЋСЋ С‚РѕС‡РєСѓ ListBox.
    	this.bottomRight = bottomRight;
	}
	public void setActive(boolean active) {
			//РЈСЃС‚Р°РЅР°РІР»РёРІР°РµС‚ СЃРѕСЃС‚РѕСЏРЅРёРµ Р°РєС‚РёРІРЅРѕСЃС‚Рё ListBox.
	    this.active = active;
	}
	public int getWidth() {
		//	Р’РѕР·РІСЂР°С‰Р°РµС‚ С€РёСЂРёРЅСѓ ListBox.
	    return width;
	}
	public int getHeight() {
			//	Р’РѕР·РІСЂР°С‰Р°РµС‚ РІС‹СЃРѕС‚Сѓ ListBox.
	    return height;
	}
	public String[] getLines() {
			//	Р’РѕР·РІСЂР°С‰Р°РµС‚ РєРѕРїРёСЋ РЅР°Р±РѕСЂР° СЃС‚СЂРѕРє ListBox.
	    return lines;
	}
	public void setLines(String[] lines) {
			//РЈСЃС‚Р°РЅР°РІР»РёРІР°РµС‚ РЅР°Р±РѕСЂ СЃС‚СЂРѕРє ListBox.
	    this.lines = lines;
	}
	public String[] getLinesSlice(int from, int to) {
		//Р’РѕР·РІСЂР°С‰Р°РµС‚ РЅР°Р±РѕСЂ СЃС‚СЂРѕРє ListBox, РЅР°С‡РёРЅР°СЏ СЃРѕ СЃС‚СЂРѕРєРё вЂњfromвЂќ Рё РґРѕ СЃС‚СЂРѕРєРё (вЂњtoвЂќ-1) РІРєР»СЋС‡РёС‚РµР»СЊРЅРѕ . 
		//Р•СЃР»Рё РІ ListBox СЃС‚СЂРѕРє РјРµРЅСЊС€Рµ, С‡РµРј вЂњtoвЂќ, РІРѕР·РІСЂР°С‰Р°РµС‚ СЃС‚СЂРѕРєРё РѕС‚ вЂњfromвЂќ Рё РґРѕ РєРѕРЅС†Р°. 
		// Р“Р°СЂР°РЅС‚РёСЂСѓРµС‚СЃСЏ, С‡С‚Рѕ вЂњfromвЂќ < вЂњtoвЂќ. Р•СЃР»Рё РјР°СЃСЃРёРІ СЃС‚СЂРѕРє СЂР°РІРµРЅ null, РІРѕР·РІСЂР°С‰Р°РµС‚ null.
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
		//Р’РѕР·РІСЂР°С‰Р°РµС‚ СЃС‚СЂРѕРєСѓ СЃ РЅРѕРјРµСЂРѕРј index. Р•СЃР»Рё СЃС‚СЂРѕРєРё СЃ С‚Р°РєРёРј РЅРѕРјРµСЂРѕРј РЅРµС‚ РёР»Рё РјР°СЃСЃРёРІ СЃС‚СЂРѕРє СЂР°РІРµРЅ null, РІРѕР·РІСЂР°С‰Р°РµС‚ null.
	    if(lines[index] == null) return null;
	    return lines[index];
	
	}
	public void setLine(int index, String line) {
		//Р—Р°РјРµРЅСЏРµС‚ СЃС‚СЂРѕРєСѓ СЃ РЅРѕРјРµСЂРѕРј index. Р•СЃР»Рё СЃС‚СЂРѕРєРё СЃ С‚Р°РєРёРј РЅРѕРјРµСЂРѕРј РЅРµС‚ РёР»Рё РјР°СЃСЃРёРІ СЃС‚СЂРѕРє СЂР°РІРµРЅ null, РЅРёС‡РµРіРѕ РЅРµ РґРµР»Р°РµС‚.
		if(lines[index] != null) {
			lines[index] = line;
		}
		
	}
	public Integer findLine(String line) {
		//	Р�С‰РµС‚  РїРµСЂРІСѓСЋ СЃРѕРІРїР°РґР°СЋС‰СѓСЋ СЃ line СЃС‚СЂРѕРєСѓ РІ РјР°СЃСЃРёРІРµ СЃС‚СЂРѕРє ListBox. Р•СЃР»Рё СЃС‚СЂРѕРєР° РЅР°Р№РґРµРЅР°, РІРѕР·РІСЂР°С‰Р°РµС‚ РµРµ РёРЅРґРµРєСЃ, РІ РїСЂРѕС‚РёРІРЅРѕРј СЃР»СѓС‡Р°Рµ РІРѕР·РІСЂР°С‰Р°РµС‚ null.
	    for(int index = 0; index < lines.length;  index++ ) {
	    	if(line == lines[index]) {
	    		return index;
	    	}
	    }
	    return null; 
	}
	public void reverseLineOrder() {
		//РџРµСЂРµРІРѕСЂР°С‡РёРІР°РµС‚ РјР°СЃСЃРёРІ СЃС‚СЂРѕРє ListBox., С‚Рѕ РµСЃС‚СЊ РґРµР»Р°РµС‚ 0-СЋ СЃС‚СЂРѕРєСѓ - РїРѕСЃР»РµРґРЅРµР№, РїРµСЂРІСѓСЋ - РїСЂРµРґРїРѕСЃР»РµРґРЅРµР№ Рё С‚.Рґ. Р•СЃР»Рё РјР°СЃСЃРёРІ СЃС‚СЂРѕРє СЂР°РІРµРЅ null, РЅРµ РґРµР»Р°РµС‚ РЅРёС‡РµРіРѕ.
	   for(int i = lines.length; i > -1; i--) {
		   lines[i] = lines[lines.length-i];
		   if( i == lines.length) break;
	   }
	}
	public void reverseLines() {
		//РџРµСЂРµРІРѕСЂР°С‡РёРІР°РµС‚ РєР°Р¶РґСѓСЋ СЃС‚СЂРѕРєСѓ РІ РјР°СЃСЃРёРІРµ СЃС‚СЂРѕРє ListBox.Р•СЃР»Рё РјР°СЃСЃРёРІ СЃС‚СЂРѕРє СЂР°РІРµРЅ null, РЅРµ РґРµР»Р°РµС‚ РЅРёС‡РµРіРѕ.
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
		//	Р—Р°РјРµРЅСЏРµС‚ РјР°СЃСЃРёРІ СЃС‚СЂРѕРє РЅР° РЅРѕРІС‹Р№ РјР°СЃСЃРёРІ, РІРјРµСЃС‚Рѕ РєР°Р¶РґРѕР№ СЃС‚СЂРѕРєРё РІСЃС‚Р°РІР»РµРЅС‹ РґРІРµ РєРѕРїРёРё РµРµ. Р•СЃР»Рё РјР°СЃСЃРёРІ СЃС‚СЂРѕРє СЂР°РІРµРЅ null, РЅРµ РґРµР»Р°РµС‚ РЅРёС‡РµРіРѕ.
	    for(int i = 0; i < lines.length ; i++) {
	    	lines[i] = "ee";
	    }
	}
	public void removeOddLines() {
		//	Р—Р°РјРµРЅСЏРµС‚ РјР°СЃСЃРёРІ СЃС‚СЂРѕРє РЅР° РЅРѕРІС‹Р№ РјР°СЃСЃРёРІ, РІ РєРѕС‚РѕСЂРѕРј РєР°Р¶РґР°СЏ РЅРµС‡РµС‚РЅР°СЏ РёСЃС…РѕРґРЅР°СЏ СЃС‚СЂРѕРєР° СѓРґР°Р»РµРЅР°. Р•СЃР»Рё РјР°СЃСЃРёРІ СЃС‚СЂРѕРє СЂР°РІРµРЅ null РёР»Рё СЃРѕРґРµСЂР¶РёС‚ С‚РѕР»СЊРєРѕ РѕРґРЅСѓ СЃС‚СЂРѕРєСѓ, РЅРµ РґРµР»Р°РµС‚ РЅРёС‡РµРіРѕ.
	    for(int i = 0; i < lines.length ; i++) {
	    	if(i % 2 == 1) {
	    			lines[i] = "";
	    	}
	    }
	} 
	public boolean isSortedDescendant() {
		//	Р’РѕР·РІСЂР°С‰Р°РµС‚ true, РµСЃР»Рё РјР°СЃСЃРёРІ СЃС‚СЂРѕРє СЃС‚СЂРѕРіРѕ СѓРїРѕСЂСЏРґРѕС‡РµРЅ РїРѕ СѓР±С‹РІР°РЅРёСЋ, РёРЅР°С‡Рµ false. Р•СЃР»Рё РјР°СЃСЃРёРІ СЃС‚СЂРѕРє СЂР°РІРµРЅ null, РІРѕР·РІСЂР°С‰Р°РµС‚ true.
		return false;
	}
	public void moveTo(int x, int y) {
		//		РџРµСЂРµРґРІРёРіР°РµС‚ ListBox  С‚Р°Рє, С‡С‚РѕР±С‹ Р»РµРІС‹Р№ РІРµСЂС…РЅРёР№ СѓРіРѕР» РµРіРѕ РѕРєР°Р·Р°Р»СЃСЏ РІ С‚РѕС‡РєРµ (x, y).
	}
	public void moveTo(Point point) {
		//		РџРµСЂРµРґРІРёРіР°РµС‚ ListBox  С‚Р°Рє, С‡С‚РѕР±С‹ Р»РµРІС‹Р№ РІРµСЂС…РЅРёР№ СѓРіРѕР» РµРіРѕ РѕРєР°Р·Р°Р»СЃСЏ РІ С‚РѕС‡РєРµ point.
		}	
	public void moveRel(int dx, int dy) {
		//	РџРµСЂРµРґРІРёРіР°РµС‚ ListBox РЅР° (dx, dy).
		}
	public void resize(double ratio) {
		//	Р�Р·РјРµРЅСЏРµС‚ С€РёСЂРёРЅСѓ Рё РґР»РёРЅСѓ ListBox РІ ratio СЂР°Р· РїСЂРё СЃРѕС…СЂР°РЅРµРЅРёРё РєРѕРѕСЂРґРёРЅР°С‚ Р»РµРІРѕР№ РІРµСЂС…РЅРµР№ С‚РѕС‡РєРё. Р”СЂРѕР±РЅР°СЏ С‡Р°СЃС‚СЊ РІС‹С‡РёСЃР»РµРЅРЅРѕР№ РґР»РёРЅС‹ РёР»Рё С€РёСЂРёРЅС‹ РѕС‚Р±СЂР°СЃС‹РІР°РµС‚СЃСЏ. Р•СЃР»Рё РїСЂРё С‚Р°РєРѕРј РёР·РјРµРЅРµРЅРёРё РґР»РёРЅР° РёР»Рё С€РёСЂРёРЅР° РєР°РєРѕР№-С‚Рѕ РёР· СЃС‚РѕСЂРѕРЅ РѕРєР°Р¶РµС‚СЃСЏ РјРµРЅСЊС€Рµ 1, С‚Рѕ РѕРЅР° РїСЂРёРЅРёРјР°РµС‚СЃСЏ СЂР°РІРЅРѕР№ 1.
		}
	public boolean isInside(int x, int y) {
		//	РћРїСЂРµРґРµР»СЏРµС‚, Р»РµР¶РёС‚ Р»Рё С‚РѕС‡РєР° (x, y) РІРЅСѓС‚СЂРё ListBox. Р•СЃР»Рё С‚РѕС‡РєР° Р»РµР¶РёС‚ РЅР° СЃС‚РѕСЂРѕРЅРµ, СЃС‡РёС‚Р°РµС‚СЃСЏ, С‡С‚Рѕ РѕРЅР° Р»РµР¶РёС‚ РІРЅСѓС‚СЂРё.
	return false;
	}
	public boolean isInside(Point point) {
		//	РћРїСЂРµРґРµР»СЏРµС‚, Р»РµР¶РёС‚ Р»Рё С‚РѕС‡РєР° point РІРЅСѓС‚СЂРё ListBox. Р•СЃР»Рё С‚РѕС‡РєР° Р»РµР¶РёС‚ РЅР° СЃС‚РѕСЂРѕРЅРµ, СЃС‡РёС‚Р°РµС‚СЃСЏ, С‡С‚Рѕ РѕРЅР° Р»РµР¶РёС‚ РІРЅСѓС‚СЂРё.
		return false;
	}
	public boolean isIntersects(ListBox listBox) {
		//	РћРїСЂРµРґРµР»СЏРµС‚, РїРµСЂРµСЃРµРєР°РµС‚СЃСЏ  Р»Рё ListBox СЃ РґСЂСѓРіРёРј ListBox. РЎС‡РёС‚Р°РµС‚СЃСЏ, С‡С‚Рѕ ListBoxвЂ™С‹ РїРµСЂРµСЃРµРєР°СЋС‚СЃСЏ, РµСЃР»Рё Сѓ РЅРёС… РµСЃС‚СЊ С…РѕС‚СЊ РѕРґРЅР° РѕР±С‰Р°СЏ С‚РѕС‡РєР°.
		return false;
	}
	public boolean isInside(ListBox listBox) {
		//	РћРїСЂРµРґРµР»СЏРµС‚, Р»РµР¶РёС‚ Р»Рё ListBox С†РµР»РёРєРѕРј РІРЅСѓС‚СЂРё С‚РµРєСѓС‰РµРіРѕ ListBox. 
		return false;
	}
	public boolean isFullyVisibleOnDesktop(Desktop desktop) {
	//РћРїСЂРµРґРµР»СЏРµС‚, РІРµСЂРЅРѕ Р»Рё, С‡С‚Рѕ РІРµСЃСЊ ListBox РЅР°С…РѕРґРёС‚СЃСЏ РІ РїСЂРµРґРµР»Р°С… Desktop. 
		return false;
	}
/*	РјРµС‚РѕРґС‹ equals Рё hashCode.  
	РќРµ РїРёС€РёС‚Рµ СЌС‚Рё РјРµС‚РѕРґС‹ СЃР°РјРё, РёСЃРїРѕР»СЊР·СѓР№С‚Рµ СЃСЂРµРґСЃС‚РІР° IDEA. 
*/
}
