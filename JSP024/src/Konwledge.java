public class Konwledge {

	public static void main(String[] args) {
		String str="knowledge";
		String str1="";
		String str2="";
		int legth=str.length();
		System.out.println(legth);
		int h=legth/2;
		for(int i=h;i<legth;i++) {			
			str1+=str.charAt(i);
		}
		System.out.println("**********************");
		for(int i=h-1;i>=0;i--) {
			
			str2+=str.charAt(i);
		}
		System.out.println(str1+str2);
		AnotherMethodFor(str);
	}

	private static void AnotherMethodFor(String str) {
		
		
	}
	
	

}
