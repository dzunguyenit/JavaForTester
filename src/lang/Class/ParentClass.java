package lang.Class;

public class ParentClass {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		try {
			ParentClass parentClass = new ParentClass();
			ParentClass subClass = new SubClass();

			// class ClassDemo
			Class c = parentClass.getClass();
			System.out.println(c);

			// sub class SubClass1
			Class c1 = subClass.getClass();
			System.out.println(c1);

			Class d = subClass.getClass();
			System.out.println("Superclass = " + d.getSuperclass());

//			// represent a subclass of the specified class object
			Class retval = c1.asSubclass(c);

			System.out.println(retval);
		} catch (ClassCastException e) {
			System.out.println(e.toString());
		}
	}
}

class SubClass extends ParentClass {
	// sub class
}
