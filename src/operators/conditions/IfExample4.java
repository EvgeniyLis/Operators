package operators.conditions;

import java.util.Scanner;

public class IfExample4 {

	public static void main(String[] args) {
		int numberOne, numberTwo, numberThre;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter three number");
		numberOne=input.nextInt();
		numberTwo=input.nextInt();
		numberThre=input.nextInt();
		if (numberOne<numberTwo && numberOne<numberTwo) {
			System.out.println("Minimum is "+numberOne);
		}else if (numberTwo<numberOne && numberTwo<numberThre) {
			System.out.println("Minimum is "+numberTwo);
		}else {
			System.out.println("Minimum is "+numberThre);
		}
		input.close();	
	}

}
