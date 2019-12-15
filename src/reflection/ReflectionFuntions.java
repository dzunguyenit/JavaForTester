package reflection;

import java.lang.reflect.Field;

public class ReflectionFuntions {

	public <T> void print(Class<T> zClass) {

		String className = "";
		if (zClass.isAnnotationPresent(EntityAnnotation.class) && zClass.isAnnotationPresent(EntityAnnotation.class)) {
			EntityAnnotation tableClass = zClass.getAnnotation(EntityAnnotation.class);
			className = tableClass.name();
			System.out.println("Class is: " + className);
		}
		Field[] fields = zClass.getClass().getDeclaredFields();

		if (zClass.getClass().getName().equals(className)) {
			for (Field field : fields) {
				System.out.println(field);
			}
		}
	}

	@SuppressWarnings("rawtypes")
	public static <T> void main(String[] args) {
		Human human = new Human();
		human.setName("Vu Nguyen");
		human.setAge(26);
		human.setGender("Male");
		human.setCareer("IT Engineer");

		Car car = new Car();
		car.setName("Lamborghini 2.0 Lux");
		car.setBrand("Lamborghini");
		car.setColor("Yellow");

		Class humanEntity = human.getClass();
		Field[] humanFields = humanEntity.getDeclaredFields();

		Class carEntity = car.getClass();
		Field[] carFields = carEntity.getDeclaredFields();

		if (humanEntity.getName().contains("Human")) {
			System.out.println("Class is: " + human.getClass().getName());
			for (Field field : humanFields) {
				System.out.println(field);
			}
			human.printInformationHuman();
		} else {
			System.out.println("Class is: " + car.getClass().getName());
			for (Field field : carFields) {
				System.out.println(field);
			}
			car.printInformationCar();
		}
	}
}
