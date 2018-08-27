package loops.For;

import java.util.Scanner;

public class Example1 {
	
	//Вывести кавадраты целых чисел от 1 до n
	
	public static void main(String[] args) {
		int number;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		number=input.nextInt();
		for (int i = 1; i <= number; i++) {
			System.out.println(i+" = "+i*i);
		}

	}

}
