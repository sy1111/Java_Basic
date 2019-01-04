package method;

public class FinalDemo {

	public static void main(String[] args) {
		int var1 = sum(10, 12);
		int sum = 0;
		var1 = var1 + 1;

		String message = "Hello World1";
		String m2 = new String("대한민국");
		
		double[] rates = {1.1, 2.54, 9.11};
		double[] points = new double[100];
		double result = rates[1] / 2.0;
		
		// 조건문 / 반복문 / 메소드
		if (points[9] > 1.0) {
			
		} else if (points[10] > 2.0) {
			
		} else {
			
		}
		int i = 0;
		while (i < 100) {
			// 할일1
			//...
			i++;
		}
		
		// 무한루프
		for (i = 0; i < 100; i++) {
			
		}
	}
	
	static int sum(int i, int j) {
		return i + j;
	}

}
