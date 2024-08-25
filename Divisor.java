//package program;
public class Divisor {
	public static void main(String[] args) {
		int number = 1000, i = 1, count = 1;
		for (; i <= number / 2; i++) {
			if (number % i == 0) {
				System.out.print(i + " ");
				count++;

			}
		}
		System.out.println(number);
		System.out.println();
		System.out.println("No of Divisors are : " + count);

	}

}
