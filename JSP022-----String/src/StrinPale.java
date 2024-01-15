
public class StrinPale {

	public static void main(String[] args) {
		String str="DhruvaSir";
		
		int le=str.length()-1;
		char[] st=new char[le];
		int j=0;
		for(int i=le;i>0;i--) {
			System.out.print(str.charAt(i));
			st[j++]=str.charAt(i);
			
		}
		System.out.println("________________");
			System.out.print(st);
			

	
		}
}
