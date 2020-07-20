package javaAnnotation;

import java.lang.reflect.Method;

public class AccessHelloAnnotation {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		HellAnnotationoImpliment hello = new HellAnnotationoImpliment();
		System.out.println("Class is: " + hello.getClass());
		Method methodSayHello = hello.getClass().getMethod("sayHello");

		System.out.println("Method is: " + hello.getClass().getMethod("sayHello"));

		HelloAnnotation annotationSayHello = methodSayHello.getAnnotation(HelloAnnotation.class);

		System.out.println("value is: " + annotationSayHello.value());
		System.out.println("value is: " + annotationSayHello.value1());

		Method methodYeah = hello.getClass().getMethod("sayYeah");

		HelloAnnotation annotationSayYeah = methodYeah.getAnnotation(HelloAnnotation.class);

		System.out.println("value is: " + annotationSayYeah.value());
		System.out.println("value is: " + annotationSayYeah.value1());
	}

}
