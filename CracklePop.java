import java.util.Scanner;

public class CracklePop {
	static Scanner sc = new Scanner(System.in);
	static int num = 1;

	public static void main(String[] args) {
		System.out.println("Please enter a number from 1-100:");
		while (num < 1000) {
			testNumber();
			num++;
		}
		sc.close();
	}

	static void testNumber() {
		int i = sc.nextInt();

		if (i > 100 || i < 0) {
			System.out.println("This number is not within the correct range. Please enter a number from 1-100:");
		} else if (i % 5 == 0 && i % 3 == 0) {
			System.out.println("CracklePop");
		} else if (i % 5 == 0) {
			System.out.println("Pop");
		} else if (i % 3 == 0) {
			System.out.println("Crackle");
		} else {
			System.out.println("This number is not divisible by 3 or 5.");
		}
	}
}
