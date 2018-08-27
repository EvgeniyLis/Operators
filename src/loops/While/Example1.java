package loops.While;

import java.util.Scanner;

public class Example1 {

	// ¬вести целое число и посчитать цифр в нем
	
	public static void main(String[] args) {
		int number, numberCopy, count=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		number=input.nextInt();
		numberCopy=number;
		while (number!=0) {
			number/=10; //”брать в числе малую цифру
			count++;
		}
		System.out.println(numberCopy+" consist of "+count+" characters");
	}

}
