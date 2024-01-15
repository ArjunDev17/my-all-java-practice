class PP {

	public void pp() {
		String s1 = "malyaylam";

		for (int i = 0; i < s1.length(); i++) {
			for (int k = i + 2; k <= s1.length(); k++) {
				String st = s1.substring(i, k);
				if (isPalendrom(st)) {
					System.out.println(st);
				}

			}
		}
	}

	public static boolean isPalendrom(String s1) {
		int i = 0, j = s1.length() - 1;
		while (i < j) {
			if (s1.charAt(i) != s1.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;

	}
}

public class PossiblePailendrom {

	public static void main(String[] args) {
		PP op = new PP();

		op.pp();
	}

}
/*
 
 * String s1="mom and dad always equal to GOd"
 * 
 * 
 * 
 */
