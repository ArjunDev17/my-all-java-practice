class NotBestApproch {
	public static boolean isPalendrom1(String s1) {
	String str="MALYALAM";
	String st2;
	int le=str.length()-1;
	
	for(int i=le;i>0;i--) {
		str.charAt(i);
	}
	return false;
	}
}
class BA{
	public static boolean isPalendrom(String s1) {
		int i=0,j=s1.length()-1;
		while(i<j) {
			if(s1.charAt(i)!=s1.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
		
	}
}

public class StrinPalendrome {
	public static void main(String[] args) {
		String s1="Ramayan";
		boolean b=BA.isPalendrom(s1);
		System.out.println("String is palendrom ? "+BA.isPalendrom(s1));
	}
}
