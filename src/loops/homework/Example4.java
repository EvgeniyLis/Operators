package loops.homework;

import java.util.Scanner;

public class Example4 {
	
	// Multiplicity of odd digits of number

	public static void main(String[] args) {
		int number, numberCopy, digit, result=1;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		number=input.nextInt();
		numberCopy=number;
		while (number!=0) {
			digit=number%10;
			if (digit%2!=0) {
				result=result*digit;
			}
			number/=10;
		}
		System.out.println("The multiplisity of odd digits of number "+numberCopy+" is "+result);
		input.close();
	}

}
