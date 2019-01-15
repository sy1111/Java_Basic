package basic;

public class Basic_04 {

	public static void main(String[] args) {
		drawTriangle(10);
	}
	
	/*
	 * 입력한 수만큼의 삼각형을 그리시오
	 * 
	 * 예) 입력: 3
	 *    *
	 *   ***
	 *  *****
	 *   
	 *    입력: 5
	 *       *    (4)
	 *      ***   (3) 
	 *     *****  (2) 
	 *    ******* (1)
	 *   *********
	 *    
	 */
	public static void drawTriangle(int height) {
		for (int i = 1; i <= height; i++) {
			// 첫번째 루프 --> *
			// 두번째 루프 --> **
			
			// 공백의 갯수 = height - i
			String whitespace = "";
			for (int j = 0; j < height - i; j++) {
				whitespace = whitespace + " ";
			}
			
			// 별의 갯수
			String row = "";
			for (int j = 0; j < (2 * i - 1); j++) {
				row = row + "*";
			}
			
			System.out.println(whitespace + row);
		}
	}
}
