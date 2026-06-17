package example.spring.rest;

import java.time.LocalDate;

public class Person {
	private String name;
	private String profession;
	private LocalDate birthDate;

	public Person() {
		
		
	}

	public Person(String name, String profession, LocalDate birthDate) {
		super();
		this.name = name;
		this.profession = profession;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	

}
