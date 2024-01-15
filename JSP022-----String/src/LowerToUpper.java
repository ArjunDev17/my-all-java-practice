
public class LowerToUpper {

	public static void main(String[] args) {
		String s1 = "ramseeta";
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length - 1; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = (char) ((int) ch[i] - 32);
			}
			System.out.print(ch[i]);
		}

	}

}
