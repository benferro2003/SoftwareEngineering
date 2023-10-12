package c3654717;

public class Subject implements Delivery{
	public String name;
	public String description;
	
	public abstract int getCredit();
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}

}
