package whtsapp.development;

public class Version1 {
	String name;
	String use_Tech;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUse_Tech() {
		return use_Tech;
	}
	public void setUse_Tech(String use_Tech) {
		this.use_Tech = use_Tech;
	}
	public void display() {
		System.out.println(name);
		System.out.println(use_Tech);
	}
	
}
