package number.based2;

interface FuncInterface {
	void abstractFun(int x, int y, int z);

	default void normalFun() {
		System.out.println("Hello");
	}
}

public class FindingGreatestNumberBetweenThree {
	public static void main(String args[]) {
		FuncInterface fobj = (x, y, z) -> {
			int x1 = x > y ? x : y;
			int x2=x1>z?x1:z;
			System.out.println(x2);
		};
		fobj.abstractFun(15, 171, 19);

	}
}
