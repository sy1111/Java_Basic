package excercise;

import java.util.Arrays;

public class StringDemoEx {

	public static void main(String[] args) {
		String str = "This is \nString\n Demo Ex"; 
		String str2 = new String("다른 방법의 생성방법");
		
		char[] chArr = {'대', '한', '민', '국'};
		String str3 = new String(chArr);
		
		/*
		 *  \하하하\
		 * 
		 * immutable
		 */
		/*
		 * System.out.println(str);
		 * 
		 * System.out.println(str3.length());
		 * 
		 * String newStr = str2 + " " + str3;
		 * 
		 * System.out.println(str2.concat(str3));
		 * 
		 * System.out.println(str2.indexOf("방법"));
		 */
		
		String m = "조총희, 김수용, 김현성, 김병석, 문세현,정명준";
		String[] names = m.split(",");
		
		for (int i = 0; i < names.length; i++) {
			names[i] = names[i].trim();
			System.out.println(names[i]);
		}
	}

}









