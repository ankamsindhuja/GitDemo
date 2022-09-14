package chandu;

import java.util.Scanner;

public class ReverseNumber_2 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter value");
		
		int num = Sc.nextInt();
		StringBuffer sb= new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		
		System.out.println(rev);
		
	}

}
