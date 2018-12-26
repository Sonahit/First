package net.thumbtack.school.windows.managers;

import net.thumbtack.school.windows.v4.Desktop;
import net.thumbtack.school.windows.v4.Point;
import net.thumbtack.school.windows.v4.base.RectWindow;
import net.thumbtack.school.windows.v4.base.RoundWindow;
import net.thumbtack.school.windows.v4.base.WindowErrorCode;
import net.thumbtack.school.windows.v4.base.WindowException;

public class PairManager<T, V> {
	private T obj1;
	private V obj2;

	PairManager(T obj1, V obj2) throws WindowException {
		if (obj1 == null || obj2 == null) {
			throw new WindowException(WindowErrorCode.NULL_WINDOW);
		}
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	T getFirstWindow() throws WindowException {
		try {
			return obj1;
		} catch (NullPointerException exc) {
			throw new WindowException(WindowErrorCode.NULL_WINDOW);
		}
	}

	void setFirstWindow(T obj1) throws WindowException {
		if (obj1 == null) {
			throw new WindowException(WindowErrorCode.NULL_WINDOW);
		}
		this.obj1 = obj1;
	}

	V getSecondWindow() throws WindowException {
		try {
			return obj2;
		} catch (NullPointerException exc) {
			throw new WindowException(WindowErrorCode.NULL_WINDOW);
		}
	}

	void setSecondWindow(V obj2) throws WindowException {
		if (obj2 == null) {
			throw new WindowException(WindowErrorCode.NULL_WINDOW);
		}
		this.obj2 = obj2;
	}

	public static boolean allWindowsFullyVisibleOnDesktop(PairManager<?, ?> objs, Desktop desktop) {
        String checkClass = objs.getClass().getName();

		if (checkClass.contains("Rect") || checkClass.contains("Box") ) {
			RectWindow rectCheck1 = (RectWindow) objs.obj1;
			RectWindow rectCheck2 = (RectWindow) objs.obj2;
			return rectCheck1.isFullyVisibleOnDesktop(desktop) && rectCheck2.isFullyVisibleOnDesktop(desktop) ;
		}
		if (checkClass.contains("Round")|| checkClass.contains("Radio")) {
			RoundWindow roundCheck1 = (RoundWindow) objs.obj1;
			RoundWindow roundCheck2 = (RoundWindow) objs.obj2;
			return roundCheck1.isFullyVisibleOnDesktop(desktop) && roundCheck2.isFullyVisibleOnDesktop(desktop) ;
		}
		return false;
		
	}

	public static boolean allWindowsFullyVisibleOnDesktop(PairManager<?, ?> objs1, PairManager<?, ?> objs2,
			Desktop desktop) {
		String checkClass = objs1.getClass().get

		if (checkClass.contains("Rect") || checkClass.contains("Box") ) {
			RectWindow rectCheck1 = (RectWindow) objs1.obj1;
			RectWindow rectCheck2 = (RectWindow) objs1.obj2;
			return rectCheck1.isFullyVisibleOnDesktop(desktop) && rectCheck2.isFullyVisibleOnDesktop(desktop) ;
		}
		if (checkClass.contains("Round")|| checkClass.contains("Radio")) {
			RoundWindow roundCheck1 = (RoundWindow) objs1.obj1;
			RoundWindow roundCheck2 = (RoundWindow) objs1.obj2;
			return roundCheck1.isFullyVisibleOnDesktop(desktop) && roundCheck2.isFullyVisibleOnDesktop(desktop) ;
		}
		return false;
	}
}
