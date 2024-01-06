class BA1{
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
public class CheckPal {

	public static void main(String[] args) {
		String s="malyaylam";
		System.out.println(BA1.isPalendrom(s));

	}

}
