package variables;

public class Ex02_GlobalVariable {
	int age = 10;

	public void dogAge() {
		age = age + 7;
		System.out.println("Dog age is : " + age);
	}

	public static void main(String args[]) {
		Ex02_GlobalVariable puppy = new Ex02_GlobalVariable();
		System.out.println("Dog age before: " + puppy.age);
		System.out.println("Dog age after call method dogAge ");
		puppy.dogAge();
	}

}
