package operators.conditions;

import java.util.Scanner;

public class IfExample1 {

	public static void main(String[] args) {
		int number;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter source number ");
		number=input.nextInt();
		if (number%2==0) {
			System.out.println(number+" is odd");
		} 
		else {
		    System.out.println(number+" is even");
		}
		input.close();
	}

}
