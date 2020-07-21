package lab3;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		String str;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scnr.nextLine();
		do {
			System.out.println("Enter the number between 1 and 100");
			number = scnr.nextInt();
			if(number>=1) {
			if (number % 2 == 1) {
				if(number>60) {
					System.out.println("Entered number is " + number + ", odd and greater than 60");
				} else {
					System.out.println("Entered number is " + number + " Odd");
				}
			} else if (number >= 2 && number <= 25) {
				System.out.println("Entered number is " + number + ", Even and less than 25");
			} else if (number >= 26 && number <= 60) {
				System.out.println("Entered number is " + number + " Even");
			} else {
				System.out.println("Entered number is " + number + ", Even and greater than 60");
			}
			
			} else {
				System.out.println("Try Again!");
			}System.out.println("Do you want to continue?(y/n)");
			str = scnr.next();
					
		} while (str.equalsIgnoreCase("y"));
		System.out.println("Thanks for using the application "+name);
		scnr.close();
	}
}
