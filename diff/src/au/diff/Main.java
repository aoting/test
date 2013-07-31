package au.diff;

import name.fraser.neil.plaintext.diff_match_patch;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		diff_match_patch diff_match = new diff_match_patch();
		String t1 = "abc def";
		String t2 = "cde deg";
		System.out.println(diff_match.diff_main(t1, t2));
	}

}
