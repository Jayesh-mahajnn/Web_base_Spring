package example.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	private String make;
	private String model;
	
//	@Autowired //Marks this field to be auto-wired
	
	
	@Autowired(required = false)
	@Qualifier("diesel") //make sure not use primary at that time and Qualifier make decision to make autowiring 
	private Engine engine;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String make, String model, Engine engine) {
		super();
		this.make = make;
		this.model = model;
		this.engine = engine;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", engine=" + engine + "]";
	}

}
