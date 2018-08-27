package loops.For;

import java.util.Scanner;

public class Example2 {

	//Посчитать факториал числа n
	
	public static void main(String[] args) {
		int number, factor=1;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		number=input.nextInt();
		for (int i = 1; i <= number; i++) {
			factor*=i;
		}
		System.out.println("Factorial of number "+number+" is "+factor);
	}

}
