package operators.conditions;

import java.util.Scanner;

public class SwitchExample1 {

	public static void main(String[] args) {
		int dayOfWeek;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of week ");
		dayOfWeek=input.nextInt();
		switch (dayOfWeek) {
		case 1:
			System.out.println("Dayof week is Monday");
			break;
		case 2:
			System.out.println("Dayof week is Tuesday");
			break;
		case 3:
			System.out.println("Dayof week is Wednesday");
			break;
		case 4:
			System.out.println("Dayof week is Thursday");
			break;
		case 5:
			System.out.println("Dayof week is Friday");
			break;
		case 6:
			System.out.println("Dayof week is Saturday");
			break;
		case 7:
			System.out.println("Dayof week is Sunday");
			break;
		default:
			System.out.println("Number is incorrect");
			break;
		}
		input.close();
	}

}
