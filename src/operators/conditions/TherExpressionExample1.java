package operators.conditions;

import java.util.Scanner;

public class TherExpressionExample1 {

	public static void main(String[] args) {
		double numberOne, numberTwo;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter two number");
		numberOne=input.nextDouble();
		numberTwo=input.nextDouble();
		System.out.println("Minimum is "+(numberOne<numberTwo?numberOne:numberTwo));
	}

}
