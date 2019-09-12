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
			Field sField = cls.getField("string1");
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

	public GetField(String string1, String string2) {
		this.string1 = string1;
		this.string2 = string2;
	}

	public String string1 = "tutorialspoint";
	public String string2 = "vunguyen";
}
