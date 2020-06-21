package variables;

public class Ex03_StaticVariable {
	public static int age = 10;

	public static void dogAge() {
		age = age + 7;
		System.out.println("Dog age is : " + age);
	}

	public static void main(String args[]) {
		
//		Ex03_StaticVariable ex = new Ex03_StaticVariable();
		System.out.println("Dog age before: " + Ex03_StaticVariable.age);
		System.out.println("Dog age after call method dogAge ");
		Ex03_StaticVariable.dogAge();
	}

}
