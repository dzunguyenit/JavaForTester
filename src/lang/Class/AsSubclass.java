package lang.Class;

public class AsSubclass {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		try {
			AsSubclass asSubclass = new AsSubclass();
			AsSubclass subcls = new SubClass1();

			// class ClassDemo
			Class c = asSubclass.getClass();
			System.out.println(c);

			// sub class SubClass1
			Class c1 = subcls.getClass();
			System.out.println(c1);

//			// represent a subclass of the specified class object
			Class retval = c1.asSubclass(c);

			System.out.println(retval);
		} catch (ClassCastException e) {
			System.out.println(e.toString());
		}
	}
}

class SubClass1 extends AsSubclass {
	// sub class
}
