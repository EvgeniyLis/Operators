package loops.homework;

import java.util.Scanner;

public class Example6 {

	// ввести число и вывести его инверсную запись
	
	public static void main(String[] args) {
		int number, numberCopy, invNumber=0, digit;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		number=input.nextInt();
		numberCopy=number;
		do {
			digit=number%10;
			invNumber+=digit;
			invNumber*=10;
			number/=10;
		} while (number!=0);
		invNumber/=10;
		System.out.println("Invers of "+numberCopy+" is "+invNumber);
		input.close();
	}

}
