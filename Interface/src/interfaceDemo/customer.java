package interfaceDemo;

public class customer {
	
	private String name;
	private String city;
	//generate getter & setter methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	//Parameterized Constructor
	public customer(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
