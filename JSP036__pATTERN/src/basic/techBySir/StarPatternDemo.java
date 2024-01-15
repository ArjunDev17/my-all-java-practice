package basic.techBySir;

interface SingleLinePattern {
	abstract void printSingleLine(int n);
}

interface FiveLinePattern {
	abstract void fivePrintSingleLine(int n);
}

interface OddLinePattern {
	abstract void oddLine(int n);
}

interface RectanglePattern {
	abstract void rectPat(int n);
}

interface RectanglePatternCrossLine {
	abstract void rectPatCross(int n);
}

interface RectangleX {
	abstract void rectPatX(int n);
}

interface RightAngle {
	abstract void rightAngl(int n);
}

interface OppRightAngle {
	abstract void OpprightAngl(int n);
}

interface DownOppRightAngle {
	abstract void OpprightAngl(int n);
}

public class StarPatternDemo {
	public static void main(String[] args) {
		DownOppRightAngle dor = (int n) -> {
			
			for (int i = 1; i <= n; i++) {
				
				for (int j = 1; j <=i-1; j++) 
					
					System.out.print("  ");
					
					for (int j = i; j <=n; j++) {
						
						System.out.println(" *");
					}
				
				System.out.println();
			}
		};
		
		System.out.println("------------------");
DownOppRightAngle dor2 = (int n) -> {
			
			for (int i = 1; i <= n; i++) {
				
				for (int j = 1; j <=i-1; j++) 
					
					System.out.print("  ");
					
					for (int j = n; j >=i; j--) {
						
						System.out.println(j);
					}
				
				System.out.println();
			}
		};
		dor2.OpprightAngl(5);
		System.out.println("-----------");
		OppRightAngle ora = (int n) -> {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (j >= i)
						System.out.print("*");
				}
				System.out.println();
			}
		};
		// another type
		OppRightAngle ora2 = (int n) -> {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (j >= i)
						System.out.print("*");
				}
				System.out.println();
			}
		};
		ora.OpprightAngl(5);
		System.out.println("-----------");
		RightAngle ra = (int n) -> {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		};
		ra.rightAngl(5);
		System.out.println("----------------");
		RectangleX rx = (int n) -> {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (i == 1 || j == 1 || i == j || j == n || i == n || i + j == 6)
						System.out.print("*" + " ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
		};
		rx.rectPatX(5);
		System.out.println("------------------");
		RectanglePattern ro = (int n) -> {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (i == 1 || j == 1 || j == n || i == n)
						System.out.print("*" + " ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
		};
		ro.rectPat(5);
		System.out.println("----------------");
		RectanglePatternCrossLine rpcl = (int n) -> {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (i == 1 || j == 1 || j == n || i == n || i == j)
						System.out.print("*" + " ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}

		};
		rpcl.rectPatCross(5);

		System.out.println("------------------");

		SingleLinePattern slp = (int n) -> {
			for (int i = 0; i < n; i++) {
				System.out.print("* ");
			}
		};
		slp.printSingleLine(5);
		System.out.println();
		// *******************************************
		FiveLinePattern flp = (int n) -> {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		};
		flp.fivePrintSingleLine(5);

		// *******************************************
		System.out.println("--------------");

		OddLinePattern olp = (int n) -> {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i % 2 == 0)
						System.out.print("*");
				}
				System.out.println();
			}
		};
		olp.oddLine(5);
		// *******************************************

	}
}
