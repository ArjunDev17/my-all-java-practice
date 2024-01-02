package mobile.battery.world;

public class Battery {
	String name;
	int cost;
	Battery(String name,int cost){
		this.name=name;
		this.cost=cost;
	}
		
	public void display() {
		System.out.println("Mobile name is :"+Mobile.Mobil_Name);
		System.out.println("Battery name is:"+name);
	}

}
