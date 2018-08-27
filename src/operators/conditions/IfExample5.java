package operators.conditions;

import java.util.Scanner;

public class IfExample5 {

	public static void main(String[] args) {
		int numberOne, numberTwo, numberThre;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter three number");
		numberOne=input.nextInt();
		numberTwo=input.nextInt();
		numberThre=input.nextInt();
		if (numberOne%2==0) {
			numberOne=numberOne*2;
		}
		if (numberTwo%2==0) {
			numberTwo=numberTwo*2;
		}
		if (numberThre%2==0) {
			numberThre*=2;
		}
		System.out.println("Result values of numbers are "+numberOne+ " "+numberTwo+" "+numberThre);
	}

}
