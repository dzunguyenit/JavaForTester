package lang.Class;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;

public class GetActualType {
	public static void main(String args[]) {

		Type tp1 = Float1.class.getGenericSuperclass();
		System.out.println(tp1);

		ParameterizedType pt1 = (ParameterizedType) tp1;
		System.out.println(pt1.getActualTypeArguments()[0]);

		System.out.println("------------------------------------------------------");

		Type tp2 = Float2.class.getGenericSuperclass();
		System.out.println(tp2);

		ParameterizedType pt2 = (ParameterizedType) tp2;
		System.out.println(pt2.getActualTypeArguments()[1]);

		System.out.println("------------------------------------------------------");

		Type tp3 = String1.class.getGenericSuperclass();
		System.out.println(tp2);

		ParameterizedType pt3 = (ParameterizedType) tp3;
		System.out.println(pt3.getActualTypeArguments()[0]);
	}
}

@SuppressWarnings("serial")
class Float1 extends ArrayList<Float> {
	public Float1() {

	}
}

@SuppressWarnings("serial")
class Float2 extends HashMap<String, Integer> {
	public Float2() {

	}
}

@SuppressWarnings("serial")
class String1 extends ArrayList<String> {
	public String1() {

	}
}
