package prob3;

public abstract class Bird {
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public abstract void sing();
	
	public abstract void fly();
}
