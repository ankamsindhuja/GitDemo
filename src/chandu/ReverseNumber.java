package chandu;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int reverse=0;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter value");
		int number = sc.nextInt();
	while(number!=0) {
		reverse=reverse*10;
		
		
		reverse=reverse+number%10;
		number=number/10;
		
				
	}
	System.out.println(reverse);
		
	}


}