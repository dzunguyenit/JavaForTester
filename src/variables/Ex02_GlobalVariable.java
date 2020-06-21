package variables;

public class Ex02_GlobalVariable {
	static int age = 10;
	static int gender = 10;

	public void dogAge() {

		int gender = 0;
		System.out.println("Age = " + age);
		System.out.println("Gender is : " + gender);
	}

	public void dogAge2() {
		System.out.println("Gender is : " + gender);
		System.out.println("Dog age is : " + age);
	}

	public static void main(String args[]) {
//		Ex02_GlobalVariable variable = new Ex02_GlobalVariable();
		System.out.println("Dog age before: " + Ex02_GlobalVariable.age);
		System.out.println("Dog age after call method dogAge ");
//		variable.dogAge();
	}

}
