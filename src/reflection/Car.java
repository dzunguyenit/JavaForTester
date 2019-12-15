package reflection;

public class Car {

	String name;
	String brand;
	String color;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void printInformationCar() {
		System.out.println("Information Car: " + name + " - " + brand + " - " + color);
	}

}
