package loops.For;

import java.util.Scanner;

public class Example4 {

		//–асчитать кубы и квадраты чисел в интервале между a, b
	
	public static void main(String[] args) {
		int numberOne, numberTwo;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter two numbers");
		numberOne=input.nextInt();
		numberTwo=input.nextInt();
		for (int i = numberOne; i <=numberTwo ; i++) {
			System.out.println(i+" = "+i*i+" = "+i*i*i);
		}
	}

}
