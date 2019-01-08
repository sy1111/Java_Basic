package excercise;

public class CodingEx03 {

	public static void main(String[] args) {
		String sample = "018234567";
		
		boolean isValid = checkNumbers(sample);

		if (isValid) {
			System.out.println("Correct!");
		} else {
			System.out.println("Wrong!");
		}
	}

	/**
	 * 입력: String
	 * 리턴: boolean
	 * 
	 * .... 0 ~ 9
	 * 
	 */
	public static boolean checkNumbers(String str) {
		boolean[] checks = new boolean[10];
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '0') {
				if (checks[i] == true) {
					return false;
				}
				checks[0] = true;
			} else if (str.charAt(i) == '1') {
				if (checks[i] == true) {
					return false;
				}
				checks[1] = true;
			} else if (str.charAt(i) == '2') {
				if (checks[i] == true) {
					return false;
				}
				checks[2] = true;
			}
			else if (str.charAt(i) == '3') {
				if (checks[i] == true) {
					return false;
				}
				checks[3] = true;
			}
			else if (str.charAt(i) == '4') {
				if (checks[i] == true) {
					return false;
				}
				checks[4] = true;
			}
			else if (str.charAt(i) == '5') {
				if (checks[i] == true) {
					return false;
				}
				checks[5] = true;
			}
			else if (str.charAt(i) == '6') {
				if (checks[i] == true) {
					return false;
				}
				checks[6] = true;
			}
			else if (str.charAt(i) == '7') {
				if (checks[i] == true) {
					return false;
				}
				checks[7] = true;
			}
			else if (str.charAt(i) == '8') {
				if (checks[i] == true) {
					return false;
				}
				checks[8] = true;
			}
			else if (str.charAt(i) == '9') {
				if (checks[i] == true) {
					return false;
				}
				checks[9] = true;
			}
		}
		
		for (int i = 0; i < checks.length; i++) {
			if (checks[i] == false) {
				return false;
			}
		}
		
		return true;
	}
}














