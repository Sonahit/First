import java.util.Scanner;

public class Shtripling {
	private static String deleteBlanks(String str) {
		StringBuilder returnString = new StringBuilder();
		for (char ch : str.toCharArray()) {
			if (ch != ' ') {
				returnString.append(ch);
			}
		}
		return returnString.toString();
	}

	private static boolean isNumber(char ch) {
		return ch >= '0' & ch <= '9';
	}

	private static int getResult(String str) {
		int result = 0;
		int numR = 0;
		int numL = 0;
		for (int i = 0; i < str.length(); i++) {
			if (!isNumber(str.charAt(i))) {
				numR = getNumber(str, i, 'R');
				numL = getNumber(str, i, 'L');
			}
			switch (str.charAt(i)) {
			case '+':
				result = numR + numL;
				break;
			}
		}
		return result;
	}

	private static int getTens(String str, int index, char direction) {
		int tens = 0;
		if (direction == 'R') {
			if (index <= str.length() - 1) {
				while (str.charAt(index) >= '0' && '9' <= str.charAt(index)) {
					tens += 1;
					index += 1;
				}
			}
			if (direction == 'L') {
				while (str.charAt(index) >= '0' && '9' <= str.charAt(index)) {
					tens += 1;
					index -= 1;
				}
			}
		}

		return tens;
	}

	private static int getNumber(String str, int index, char direction) {
		int number = 0;
		int tens = 0;
		if (direction == 'R') {
			tens = getTens(str, index, direction);
			if (index <= str.length() - 1) {
				while (str.charAt(index) >= '0' && '9' <= str.charAt(index) && tens != 0) {
					index += 1;
					number += Character.getNumericValue(str.charAt(index)) * Math.pow(10, tens);
					tens -= 1;

				}
			}
			if (direction == 'L') {
				tens = getTens(str, index, direction);
				while (str.charAt(index) >= '0' && '9' <= str.charAt(index) && tens != 0) {
					index -= 1;
					number += Character.getNumericValue(str.charAt(index)) * Math.pow(10, tens);
					;
					tens -= 1;
				}
			}
		}
		return number;
	}

	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String primer = scan.nextLine();
		primer = deleteBlanks(primer);
		int i = getResult(primer);
		System.out.println(i);
	}

}
