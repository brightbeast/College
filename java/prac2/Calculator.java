import java.util.Scanner;
class Calculator{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);

		System.out.println("Enter first number");
		int input1=input.nextInt();

		System.out.println("Enter second number");
		int input2=input.nextInt();

		System.out.println("Enter operation");
		char ch=input.next().charAt(0);
		System.out.print(ch);

		switch(ch){
			case '+':
			System.out.println("Addition of two number is "+(input1+input2));
			break;

			case '-':
			System.out.println("Subtraction of two number is "+(input1-input2));
			break;

			case '*':
			System.out.println("Multiplicatino of two number is "+(input1*input2));
			break;

			case '/':
			System.out.println("Division of two number is "+(input1/input2));
			break;

			default:
			System.out.println("Enter only these operations: +,-,*,/");
		}

		


	}
}