package loops.For;

import java.util.Scanner;

public class Example3 {

		//¬ывести четные числа в интервале от 0 до n
	
	public static void main(String[] args) {
		int number;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		number=input.nextInt();
		System.out.println("Even numbers are:");
		/*for (int i = 0; i < number; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}*/
		for (int i = 0; i < number; i+=2) {
			System.out.println(i);
		}
		input.close();
	}

}
