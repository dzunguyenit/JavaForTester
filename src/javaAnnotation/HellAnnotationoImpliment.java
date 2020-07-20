package javaAnnotation;

public class HellAnnotationoImpliment {
	@HelloAnnotation(value1 = 10, value = 0)
	public void sayHello() {
		System.out.println("sayHello");
	}

	@HelloAnnotation(value1 = 9, value = 10)
	public void sayYeah() {
		System.out.println("sayYeah");
	}

}
