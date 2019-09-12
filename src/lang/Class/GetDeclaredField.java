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

			for (Field field : fields) {
				System.out.println("Field = " + field.toString());
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@SuppressWarnings("unused")
	private int huynh = 8;
	@SuppressWarnings("unused")
	private int thanh = 9;
	@SuppressWarnings("unused")
	private int vu = 10;

	public GetDeclaredField() {
		// no argument constructor
	}

	public GetDeclaredField(long nguyen, int huynh, int thanh, int vu) {
		this.nguyen = nguyen;
		this.huynh = huynh;
		this.thanh = thanh;
		this.vu = vu;
	}

	long nguyen = 7;
}