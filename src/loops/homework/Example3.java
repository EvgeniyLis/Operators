package loops.homework;

import java.util.Scanner;

public class Example3 {

	//��������� ����� ���� ��������� �����
	
	public static void main(String[] args) {
		int number, numberCopy, digit, result=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		number=input.nextInt();
		numberCopy=number;
		while (number!=0) {
			digit=number%10; //�������� ������� ����� �����
			result=result+digit; //��������� ��� ����� � ���������� �������� (0) � ����� � ������������
			number/=10; // ������ � ����� ������� �����
		}
		System.out.println("Summa of digits of number "+numberCopy+" is "+result);
		input.close();

	}

}
