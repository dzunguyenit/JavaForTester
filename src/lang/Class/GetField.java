package lang.Class;

import java.lang.reflect.Field;

public class GetField {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		GetField c = new GetField();
		Class cls = c.getClass();

		System.out.println("Field =");

		try {
			// string field
			Field sField = cls.getField("a");
			Field sField2 = cls.getField("string2");
			System.out.println("Public field1 found: " + sField.toString());
			System.out.println("Public field2 found: " + sField2.toString());
		} catch (NoSuchFieldException e) {
			System.out.println(e.toString());
		}
	}

	public GetField() {
		// no argument constructor
	}

	public GetField(int a, String string2) {
		this.a = a;
		this.string2 = string2;
	}

	public int a = 123;
	public String string2 = "vunguyen";
}
