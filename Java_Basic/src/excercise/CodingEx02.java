package excercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodingEx02 {

	public static void main(String[] args) {
		String m = "NumOfPieP123";	// num_of_pie_x_1_2_3

		// String result = ConvertPotholeCase(m);
		System.out.println(ConvertPotholeCase(m));
	}

	/**
	 * 입력: String
	 * 리턴: String(potholecase )
	 * camelCase --> PotholeCase
	 * 
	 * ex) "numOfPies" --> "num_of_pies"
	 * 
	 * 
	 * 
	 */
	public static String ConvertPotholeCase(String input) {

		String result = "";
		
		int startIndex = 0;
		for (int i = 0; i < input.length(); i++) {
			
			char ch = input.charAt(i);
			if (ch >= 'A' && ch <= 'Z')	{ //대문자
				if (i == 0) {
					result = result + (char)(ch + 32);
				} else {
					result = result + input.substring(startIndex, i) + "_" + (char)(ch + 32);
				}
				
				startIndex = i + 1;
				
			} else if (ch >= '0' && ch <= '9') { // 숫자
				result = result + input.substring(startIndex, i) + "_" + ch;
				startIndex = i + 1;
			}
		}
		
		return result;
	}
}







