package loop.doWhile;

import java.util.Scanner;

public class Example1 {

	
	public static void main(String[] args) {
		int number,numberCopy,count=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		number=input.nextInt();
		numberCopy=number;
		do {
			number/=10;
			count++;
		} while (number!=0);
		System.out.println(numberCopy+" consist of "+count+" characters");
	}

}
