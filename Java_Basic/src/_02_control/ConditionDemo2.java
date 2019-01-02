package _02_control;

public class ConditionDemo2 {

	public static void main(String[] args) {
		String name = "Robert";
		
		// Variable scope;
		
		if (name.charAt(0) >= 'A' && name.charAt(0) <= 'Z') {
			System.out.println(name.charAt(1));
			int sum = 0;
			
			System.out.println(sum);
		}
		else {
			System.out.println("Wrong!");
			
		}

	}

}
