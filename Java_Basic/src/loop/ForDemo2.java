package loop;

import java.util.Arrays;
import java.util.Random;

public class ForDemo2 {

	public static void main(String[] args) {
		int[] numbers = new int[100];
		
		Random rand = new Random();
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100);
		}
		
		//System.out.println(Arrays.toString(numbers));
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
			
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
	}

}
