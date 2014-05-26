public class Palindrome {
	public Palindrome(int test) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		System.out.println(palindrome_num(12321));
		System.out.println(palindrome_num(22321));
		System.out.println(palindrome_num(123454321));
		System.out.println(palindrome_str("1234321".toCharArray(), 0, 6));
		System.out.println(palindrome_str("12344321".toCharArray(), 0, 7));
		System.out.println(palindrome_str_loop("1234321".toCharArray(), 7));
		System.out.println(palindrome_str_loop("1334321".toCharArray(), 7));
		/*
		 * 1 0 1 1 1 1 0
		 */
	}

	static int palindrome_num(int num) {
		int new_num = 0;
		int temp = num;

		while (0 != temp) {
			new_num = new_num * 10 + temp % 10;
			temp /= 10;
		}

		if (new_num == num) {
			return 1;
		}
		else {
			return 0;
		}
	}

	static int palindrome_str(char[] string, int begin, int end) {
		if (begin < end && begin < string.length && end < string.length) {
			if (string[end] != string[begin]) {
				return 0;
			}
			else {
				return palindrome_str(string, begin + 1, end - 1);
			}
		}
		else {
			return 1;
		}
	}

	static int palindrome_str_loop(char[] string, int len) {
		int j = 0;

		for (int i = 0; i <= len / 2; i++) {
			j = len - 1 - i;

			if (string[i] != string[j]) {
				return 0;
			}
		}

		return 1;
	}

	public Boolean isPalindrome() {
		return true;
	}
}
