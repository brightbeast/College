import java.util.Scanner;

class LargestNumber{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		
		int ans=a>b?(a>c?a:c):(b>c?b:c);

		System.out.println(ans+" is the largest number");
	}
}