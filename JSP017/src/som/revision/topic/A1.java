package som.revision.topic;

public class A1 {

	public static void main(String[] args) {
		
		String s1="Ram";
		String s2="Ram";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3=new String("Ram");
		String s4=new String("Ram");
		String s5=s4;
		
		System.out.println();
		System.out.println(s3.equals(s4));//it is comparing value
		System.out.println(s3==s4);// it is comparing object
		System.out.println(s5==s4);// it is compa
		

	}

}
