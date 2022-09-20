import java.util.Scanner;

class Prime{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		boolean flag=true;
		for(int i=a; i>1; i--)
		{
			for(int j=2; j<i; j++)
			{
				if(i%j==0){
					flag=false;
					break;
				}

			}
			if(flag==true)
				System.out.print(i+" ");
			flag=true;
		}
	}
}