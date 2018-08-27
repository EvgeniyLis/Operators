package loops.homework;

import java.util.Scanner;

public class Example1 {

	//n-ая степень числа а
	
	public static void main(String[] args) {
		int number, degree, result=1;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number and the degree");
		number=input.nextInt();
		degree=input.nextInt();
		for (int i =0 ; i < degree; i++) {
			result=result*number;
		}
		System.out.println(result);
		input.close();
	}

}
