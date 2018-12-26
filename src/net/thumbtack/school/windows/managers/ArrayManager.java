package net.thumbtack.school.windows.managers;

import net.thumbtack.school.windows.v4.Desktop;
import net.thumbtack.school.windows.v4.RadioButton;
import net.thumbtack.school.windows.v4.base.RectWindow;
import net.thumbtack.school.windows.v4.base.Window;
import net.thumbtack.school.windows.v4.base.WindowErrorCode;
import net.thumbtack.school.windows.v4.base.WindowException;
import net.thumbtack.school.windows.v4.cursors.Cursor;

public class ArrayManager<T> {
	T[] objs;

	ArrayManager(T[] objs) throws WindowException {
		for (T i : objs)
			if (i == null) {
				throw new WindowException(WindowErrorCode.NULL_WINDOW);
			}
		this.objs = objs;
	}

	T[] getWindow() {
		return objs;

	}

	void setWindow(T[] objs) throws WindowException {
		for (T i : objs)
			if (i == null) {
				throw new WindowException(WindowErrorCode.NULL_WINDOW);
			}
		this.objs = objs;
	}

	void setWindow(T objects, int i) throws WindowException {
		this.objs[i] = objects;
	}

	T getWindow(int i) throws WindowException {
		try {
			return objs[i];
		} catch (NullPointerException exc) {
			throw new WindowException(WindowErrorCode.NULL_WINDOW);
		}
	}

	public boolean allWindowsFullyVisibleOnDesktop(Desktop desktop) {
        
		
		return true;
	}

	public boolean anyWindowFullyVisibleOnDesktop(Desktop desktop) {
		return false;
	}

	public Window getFirstWindowFromCursor(Cursor cursor) {
		Window intersects = null;

		return intersects;
	}
	
	public boolean isSameSize (ArrayManager<?> obj) {
		return objs.equals(getWindow());
	}

}
