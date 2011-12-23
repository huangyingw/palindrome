public class palindrome {
	static int palindrome_num(int num) {
		int new_num = 0;
		int temp = num;
		while (0 != temp) {
			new_num = new_num * 10 + temp % 10;
			temp /= 10;
		}
		if (new_num == num)
			return 1;
		else
			return 0;
	}

	static int palindrome_str(String string, int index, int len) {
		if (1 == len)
			return 1;
		else if (string.charAt(len - 1) != string.charAt(0))
			return 0;
		else
			return palindrome_str(string, index + 1, len - 2);
	}

	static int palindrome_str_loop(String string, int len) {
		int j = 0;
		for (int i = 0; i < len; i++) {
			j = len - 1 - i;
			if (string.charAt(i) != string.charAt(j))
				return 0;
		}
		return 1;
	}

	public static void main(String args[]) {
		System.out.println(palindrome_num(12321));
		System.out.println(palindrome_num(22321));
		System.out.println(palindrome_num(123454321));
		System.out.println(palindrome_str("1234321", 0, 7));

		System.out.println(palindrome_str_loop("1234321", 7));
		System.out.println(palindrome_str_loop("1334321", 7));
		/*
		 * 1 0 1 1 1 0
		 */

	}
}
