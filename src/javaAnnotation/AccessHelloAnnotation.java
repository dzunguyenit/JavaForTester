package javaAnnotation;

import java.lang.reflect.Method;

public class AccessHelloAnnotation {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		HellAnnotationoImpliment hello = new HellAnnotationoImpliment();
		Method method = hello.getClass().getMethod("sayHello");

		HelloAnnotation annotation = method.getAnnotation(HelloAnnotation.class);

		System.out.println("value is: " + annotation.value());
	}

}
