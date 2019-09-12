package lang.Class;

import java.lang.reflect.*;
import java.util.ArrayList;

public class GetGenericSuperclass {

	public static void main(String args[]) {

		// returns the superclass
		Type t = IntegerClass.class.getGenericSuperclass();
		System.out.println(t);

		ParameterizedType p = (ParameterizedType) t;
		System.out.println(p.getActualTypeArguments()[0]);
	}
}

@SuppressWarnings("serial")
class IntegerClass extends ArrayList<Integer> {
	public IntegerClass() {
		// no argument constructor
	}
}