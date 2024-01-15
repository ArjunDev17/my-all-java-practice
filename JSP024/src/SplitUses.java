
public class SplitUses {

	public static void main(String[] args) {
		String s1="good morning sir";
		String[] st=s1.split(" ");
		System.out.println();
		int n=st.length;
		System.out.println(n);
		for(int i=st.length-1;i>=0;i--) {			
			System.out.print(st[i]+" ");
		}
	}

}
