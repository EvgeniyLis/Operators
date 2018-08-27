package loops.homework;

import java.util.Scanner;

public class Example5 {
	
	//The first odd digit of the number, начиная с младшего разряда

	public static void main(String[] args) {
		int number, digit;
		boolean isOdd=true; //предполагаем что в числе отсутствует нечетная цифра
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		number=input.nextInt();
		while (number>=10) {
			digit=number%10;
			if (digit%2!=0) {
				System.out.println("First odd digit is "+digit);
				isOdd=false;
				break;
			}
			number/=10;
		}
		if (isOdd) {
			System.out.println("Number don't have odd digits");
		}
		input.close();
	}

}
