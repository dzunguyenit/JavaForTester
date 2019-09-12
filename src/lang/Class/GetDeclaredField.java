package lang.Class;

import java.lang.reflect.*;

public class GetDeclaredField {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		try {
			GetDeclaredField c = new GetDeclaredField();
			Class cls = c.getClass();

			// field long l
			Field[] fields = cls.getDeclaredFields();
			System.out.println("Field = " + fields.toString());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	private int a;
	private int b;
	private int c;

	public GetDeclaredField() {
		// no argument constructor
	}

	public GetDeclaredField(long l, int a, int b, int c) {
		this.l = l;
		this.a = a;
		this.b = b;
		this.c = c;
	}

	long l = 77688;
}