import java.util.Scanner;
public class UniqueSumMain {
public static void main(String[] args) {
	Scanner user_input = new Scanner(System.in);
	System.out.println("Enter first number");
	int firstNumber = user_input.nextInt();
	System.out.println("Enter second number");
	int secondNumber = user_input.nextInt();
	System.out.println("Enter third number");
	int thirdNumber = user_input.nextInt();
	
	int finalresult = UniqueSum.uniqueSumCal(firstNumber, secondNumber, thirdNumber);
	System.out.println("The unique sum of the values entered is: " + finalresult);
}
}
