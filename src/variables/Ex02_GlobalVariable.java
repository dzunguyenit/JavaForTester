package variables;

public class Ex02_GlobalVariable {
	static int age = 10;

	public void dogAge() {
		System.out.println("Dog age is : ");
	}

	public void dogAge2() {
		System.out.println("Dog age is : " + age);
	}

	public static void main(String args[]) {
//		Ex02_GlobalVariable variable = new Ex02_GlobalVariable();
		System.out.println("Dog age before: " + Ex02_GlobalVariable.age);
		System.out.println("Dog age after call method dogAge ");
//		variable.dogAge();
	}

}
