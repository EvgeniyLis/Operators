package loops.homework;

import java.util.Scanner;

public class Example3 {

	//Посчитать сумму цифр вводимого числа
	
	public static void main(String[] args) {
		int number, numberCopy, digit, result=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		number=input.nextInt();
		numberCopy=number;
		while (number!=0) {
			digit=number%10; //получили младшую цифру цисла
			result=result+digit; //прибавили эту цифру к насальному значению (0) и далее к последующему
			number/=10; // Убрали в числе младшую цифру
		}
		System.out.println("Summa of digits of number "+numberCopy+" is "+result);
		input.close();

	}

}
