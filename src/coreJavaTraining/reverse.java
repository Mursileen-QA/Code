package coreJavaTraining;

public class reverse {

	public static void main(String[] args) {

		String a = "madam";
		String t = "";

		for (int i = a.length() - 1; i >= 0; i--) {
			// System.out.println(a.charAt(i));
			t = t + a.charAt(i);

		}
		System.out.println(t);
		if (a.equals(t)) {

			System.out.println("palindrome");
		}

		else {
			System.out.println(" not palindrome");

		}

	}

}
