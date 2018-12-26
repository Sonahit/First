package net.thumbtack.school.windows.managers;

import net.thumbtack.school.windows.v4.Point;
import net.thumbtack.school.windows.v4.base.*;

public class Manager<T> {
	private T obj;

	Manager(T obj) throws WindowException {
		if (obj == null) {
			throw new WindowException(WindowErrorCode.NULL_WINDOW);
		}
		this.obj = obj;
	}

	T getWindow() throws WindowException {
		try {
			return obj;
		} catch (NullPointerException exc) {
			throw new WindowException(WindowErrorCode.NULL_WINDOW);
		}
	}

	void setWindow(T obj) throws WindowException {
		if (obj == null) {
			throw new WindowException(WindowErrorCode.NULL_WINDOW);
		}
		this.obj = obj;
	}

	public void moveTo(int x, int y) throws WindowException {
        String checkClass = obj.getClass().getName();

		if (checkClass.contains("Rect") || checkClass.contains("Box") ) {
			RectWindow rectChange = (RectWindow) obj;
			rectChange.moveTo(x, y);
			Manager<RectWindow> obj = new Manager<>(rectChange);
		}
		if (checkClass.contains("Round")|| checkClass.contains("Radio")) {
			RoundWindow roundChange = (RoundWindow) obj;
			roundChange.moveTo(x, y);
			Manager<RoundWindow> obj = new Manager<>(roundChange);
		}
	}

	public void moveTo(Point point) throws WindowException {
		moveTo(point.getX(),point.getY());
	}
}
