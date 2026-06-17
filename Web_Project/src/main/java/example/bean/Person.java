package example.bean;

public class Person {
	
	private String name;
	private int age;
	private float weight;

	public Person() {
		
		System.out.println("Inside the person no-args Constructor");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		System.out.println("Getting Age");
		return age;
	}

	public void setAge(int age) {
		System.out.println("Setting Age");
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	

}
