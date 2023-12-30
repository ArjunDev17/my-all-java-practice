package all.numbers;

public class Automorphic_Num {
public static int check(int n) {
	int squ=n*n;
	while(n>0) {
		if(n%10!=squ%10) {
		return 0;
	}else {
		n=n/10;
		squ/=10;
	}
		
	}
	return 1;
	
}
	public static void main(String[] args) {
	
	}
	static{
		int s=check(5);
		if(s==1) {
			System.out.println("Number is  Automorphic");	
		}else
			System.out.println("Number is not Automorphic");
	}

}
