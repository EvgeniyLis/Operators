package operators.conditions;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		double numberOne, numberTwo, multiplu, dividing;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter two number");
		numberOne=input.nextDouble();
		numberTwo=input.nextDouble();
		multiplu=numberOne*numberTwo;
		dividing=numberOne/numberTwo;
		if (multiplu>dividing) {
			System.out.println("Summa of numbers "+numberOne+" and "+numberTwo+" is "+(numberOne+numberTwo));
		}else 
			System.out.println("Difference is "+(numberOne-numberTwo));

	}

}
