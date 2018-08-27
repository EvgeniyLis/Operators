package operators.conditions;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		int number;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter source number ");
		number=input.nextInt();
		if (number>0) {
			System.out.println(number+" is positive");
		} else {
			System.out.println(number+" is negative");
		}
		input.close();
		

	}

}
