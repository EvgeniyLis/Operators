package loops.homework;

import java.util.Scanner;

public class Example2 {
	
	//Summa of numbers between a and b

	public static void main(String[] args) {
		int numberMin, numberMax, result=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter two numbers");
		numberMin=input.nextInt();
		numberMax=input.nextInt();
		for (int i = numberMin; i <= numberMax; i++) {
			result=result+i;
		}
		System.out.println(result);
		input.close();
	}

}
