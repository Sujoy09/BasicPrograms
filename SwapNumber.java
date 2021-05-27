
public class SwapNumber {

	public static void main(String[] args) {
		// Swapping two numbers using 3rd variable
		int a = 30;
		int b = 20;
		int temp;
		System.out.println("Before Swapping:" + a + "" + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping:" + a + "" + b);
		// Swapping two numbers without using 3rd variable

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping without using Temp variable:" + a + " " + b);
	}

}
