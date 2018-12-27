package net.thumbtack.school.windows.v4;

import net.thumbtack.school.windows.v4.base.WindowState;

class WindowFactory {
	static Point leftTop;
	static Point rightBottom;
	static WindowState status;
	static Point center;
	static int radius;
	static int count1;
	static int count2;
	static String text;
	
	
	public static RectButton createRectButton(Point leftTop, Point rightBottom, WindowState status, String text) {
		WindowFactory.leftTop = leftTop;
		WindowFactory.rightBottom = rightBottom;
		WindowFactory.status = status;
		WindowFactory.text = text;
		count1++;
		return null;
	}
	

	public static RoundButton createRoundButton(Point center, int radius, WindowState status, String text) {
		WindowFactory.center = center;
		WindowFactory.radius = radius;
		WindowFactory.status = status;
		WindowFactory.text = text;
		count2++;
		return null;
	}


	public static int getRectButtonCount() {
		return count1;
	}


	public static int getRoundButtonCount() {
		return count2;
	}


	public static int getWindowCount() {
		return count1 + count2;
	}


	public static void reset() {
		count1 = 0;
		count2 = 0;
	}

}
