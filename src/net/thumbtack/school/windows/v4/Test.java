package net.thumbtack.school.windows.v4;

import java.lang.reflect.Modifier;

import net.thumbtack.school.windows.v3.iface.Movable;

public class Test {

	public static void main(String[] args) throws NoSuchMethodException {
		// TODO Auto-generated method stub

        Movable.class.getMethod("moveTo", Point.class).getModifiers();
        System.out.println((Movable.class.getMethod("moveTo", Point.class).getModifiers() & Modifier.ABSTRACT));
	}

}
