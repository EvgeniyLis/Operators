package loops.brake;

import java.util.Scanner;

public class Example1 {

	// Внутри интервала а и б найти первое число, которое нацело делится на 5
	public static void main(String[] args) {
		int numberOne, numberTwo;
		Scanner input=new Scanner(System.in);
		numberOne=input.nextInt();
		numberTwo=input.nextInt();
		for (int i = numberOne; i <= numberTwo; i++) {
			if (i%5==0) {
				System.out.println(i+" is dividing on 5");
				break;
			}
		}

	}

}
