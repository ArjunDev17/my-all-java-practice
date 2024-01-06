
public class MaxWord {

	public static void main(String[] args) {
		String str="i am only one";
		String st[]=str.split(" ");
		int max=0;
		String re="";
		for(int i=0;i<st.length;i++) {
			int count=st[i].length();
			if(count>max) {
				max=count;
				re=st[i];
			}			
		//	findMaxWo(st[i]);
		}
		System.out.println(re);
	}

	private static void findMaxWo(String str) {
		int count=0;
		int n=str.length();
		String str1="";
		if(n>count) {
			count=n;
			str1=str;
			System.out.println(str1);
		}
		
		
	}

}
