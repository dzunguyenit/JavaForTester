package reflection;

public class Human {

	String name;
	int age;
	String gender;
	String career;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public void printInformationHuman() {
		System.out.println("Information Human: " + name + " - " + age + " age - " + gender + " - " + career);
	}

}
