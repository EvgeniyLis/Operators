package loops.While;

import java.util.Scanner;

public class Example2 {

	// Посчитать число четных цифр
	
	public static void main(String[] args) {
		int number, numberCopy, digit, countEven=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		number=input.nextInt();
		numberCopy=number;
		while (number!=0) {
			digit=number%10;//получение последней (младшей) цифры числа
			if (digit%2==0) {
				countEven++;
			}
			number/=10;
		}
		System.out.println(numberCopy+" conteins "+countEven+" even digits");
	}

}
