package chandu;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value");
		
		String name = sc.nextLine();
		
		//char letter[] =name.toCharArray();
		
		for(int i=name.length()-1;i>=0;i--) {
			
			System.out.println(name.charAt(i));
			
			
			
		}
		
		
		
		
		
		
	}

}
