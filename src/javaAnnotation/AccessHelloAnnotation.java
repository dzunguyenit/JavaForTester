package javaAnnotation;

import java.lang.reflect.Method;

public class AccessHelloAnnotation {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		HellAnnotationoImpliment hello = new HellAnnotationoImpliment();
		System.out.println("Class is: " + hello.getClass());
		Method method = hello.getClass().getMethod("sayHello");

		System.out.println("Method is: " + hello.getClass().getMethod("sayHello"));

		HelloAnnotation annotation = method.getAnnotation(HelloAnnotation.class);

		System.out.println("value is: " + annotation.value());
		System.out.println("value is: " + annotation.value1());
	}

}
