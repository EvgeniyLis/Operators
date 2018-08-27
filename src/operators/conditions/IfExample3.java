package operators.conditions;

import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {
		int numberOne, numberTwo, numberThre;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter three number");
		numberOne=input.nextInt();
		numberTwo=input.nextInt();
		numberThre=input.nextInt();
		if (numberOne<numberTwo) {
			if (numberOne<numberThre) {
				System.out.println("Minimum is "+numberOne);
			} else {
				System.out.println("Minimum is "+numberThre);
			}
		} else {
			if (numberTwo<numberThre) {
				System.out.println("Minimum is "+numberTwo);
			} else {
				System.out.println("Minimum is "+numberThre);
			}
		}
		input.close();
	}

}
