package javaForTester;

public class Ex01_Variable {
	public void dogAge() {
		int age = 0;
		age = age + 7;
		System.out.println("Dog age is : " + age);
	}

	public static void main(String args[]) {
		Ex01_Variable age = new Ex01_Variable();
		age.dogAge();
	}

}
