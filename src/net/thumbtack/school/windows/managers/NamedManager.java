package net.thumbtack.school.windows.managers;

import net.thumbtack.school.windows.v4.base.WindowException;

public class NamedManager<T> extends Manager<T> {
	String text;
	NamedManager(T obj , String text) throws WindowException {
		super(obj);
		this.text = text;
	}
	
	String getName() {
		return text;
	}

	void setName(String text) {
		this.text = text;
	}
}
