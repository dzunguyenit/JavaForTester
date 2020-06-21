package javaAnnotation;

public class HellAnnotationoImpliment {
	@HelloAnnotation(value1 = 10, value = 100)
	public void sayHello() {
		System.out.println("hello annotation");
	}

}
