package pack.thiskey;

public class CalltoThis {
public static void main(String[] args) {
		
		Box n1= new Box();
		BoxOp oo=new BoxOp(2,13,9);
		BoxOp oo1=new BoxOp(2);
		oo.display();
		
	}
	
}

class BoxOp{
	int hight;
	int length;
	int width;
	BoxOp(int n){
		System.out.println("data is :"+n);
	}
	BoxOp(){
		System.out.println("Parentclass");
	}
	BoxOp(int h,int l,int w) {
		this(12);
		hight=h;
		length=l;
		width=w;
	}
	void display() {
		System.out.println("Width :"+width+"\nHeight :"+hight+"\nLength :"+length);
	}
}
 class Box extends BoxOp {

	

}

