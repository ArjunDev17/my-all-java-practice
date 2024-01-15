
public class ReverseStringInSamePlace {

	public static void main(String[] args) {
		String str = "welcome here";
		String[] st = str.split(" ");
		for (int i = 0; i < st.length; i++) {
			revStr(st[i]);
		}

	}

	private static void revStr(String st) {
		// System.out.println(st);
		for (int i = st.length() - 1; i >= 0; i--) {
			System.out.print(st.charAt(i) + "");
		}
		System.out.print(" ");

	}

}
