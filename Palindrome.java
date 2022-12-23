import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
    int number,temp,rem,palindrome=0;
    try (Scanner num = new Scanner(System.in)) {
		number=num.nextInt();
	}
    temp=number;
    while(number>0) {
    	rem=number%10;
    	palindrome=palindrome*10+rem;
    	number/=10;
    }
    if (temp==palindrome) {
    	System.out.print("palindrome");
		
	} else {
    	System.out.print("Not a palindrome");

	}

	}

}
