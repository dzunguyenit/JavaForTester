package variables;

public class Ex01_LocalVariable {
	public void dogAge() {
		int age = 0;
		age = age + 7;
		System.out.println("Dog age is : " + age);
	}

	public static void main(String args[]) {
		Ex01_LocalVariable puppy = new Ex01_LocalVariable();
		puppy.dogAge();
	}

}
