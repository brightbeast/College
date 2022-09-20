import java.util.Scanner;
class Factorial{
	public static int fact(int a)
	{
		if(a<=1)
		return 1;

		int ans=a*fact(a-1);
		return ans;
	}
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		//input from user
		int a=input.nextInt();
		int ans=fact(a);
		
		System.out.println("Factorial of the number is "+ans);
	}
}