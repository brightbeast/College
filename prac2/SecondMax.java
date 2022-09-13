import java.util.Scanner;

class SecondMax{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
			
		//input size
		int size=input.nextInt();
		//System.out.println(size);
		
		int[] arr=new int[size];
		//input array
		for(int i=0; i<size; i++){
			arr[i]=input.nextInt();
		}
		//System.out.println(arr[0]);
		int ans=0;
/*
		int first=0;
			int second=0;
			int third=0;
		for(int i=0; i<size-2; i++)
		{
			
			if(arr[i]>arr[i+1] && arr[i]>arr[i+2]){
				third=arr[i];
			}
			else if(arr[i]>arr[i+1] && arr[i]<arr[i+2]){
				second=arr[i];
			}
			else{
				first=arr[i];
			}
			
		}
*/
		
		int max=arr[0];
		for(int i=1; i<size; i++){
			if(max<arr[i])
			max=arr[i];
		}
		//System.out.println(max);
		int min=max-arr[0];
		for(int i=1; i<size; i++){
			if(arr[i]!=max){
				int min1=max-arr[i];
				if(min1<=min && min1!=0){
					min=min1;
					ans=arr[i];
				}
				
			}
			
		}
		System.out.println(ans);
	}
}