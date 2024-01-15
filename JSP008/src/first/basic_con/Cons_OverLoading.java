package first.basic_con;

class Kabeer{
	 Kabeer(){
		System.out.println("Hi");
	}
	Kabeer(int i){
		System.out.println(i);
	}
	static {
		System.out.println("Jai shree Ram");
	}
}
public class Cons_OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kabeer ko=new Kabeer();
		Kabeer ko1=new Kabeer(4);

	}
	static {
		
	}

}
