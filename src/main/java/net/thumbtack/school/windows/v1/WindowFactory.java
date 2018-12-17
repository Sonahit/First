package net.thumbtack.school.windows.v1;

public class WindowFactory {
	static Point leftTop;
	static Point rightBottom;
	static boolean active;
	static Point center;
	static int radius;
	static int count1;
	static int count2;
	public static RectButton createRectButton(Point leftTop, Point rightBottom, boolean active) {
		WindowFactory.leftTop = leftTop;
		WindowFactory.rightBottom = rightBottom;
		WindowFactory.active = active;
		count1++;
		return null;
	}
	

	public static RoundButton createRoundButton(Point center, int radius, boolean active) {
		WindowFactory.center = center;
		WindowFactory.radius = radius;
		WindowFactory.active = active;
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
