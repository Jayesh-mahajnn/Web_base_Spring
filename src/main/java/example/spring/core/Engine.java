package example.spring.core;

public class Engine {
	private String type; 

	public Engine() {
		// TODO Auto-generated constructor stub
	}

	public Engine(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Engine [type=" + type + "]";
	}
	

}
