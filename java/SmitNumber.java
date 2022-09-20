import java.util.Scanner;

public class SmitNumber {

    public static int digits(int num){
        int sum=0;
        for(int i=num; i>0; i--)
        {
            int rem=i%10;
            sum+=rem;

            i=(i/10)+1;
        }

        return sum;
    }

    public static boolean checkFactor(int num)
    {
        int m=1;
        for(int i=2; i<num; i++)
        {
            if(num%i==0)
            m=0;
            
        }

        if(m==0)
        return false;
        else 
        return true;
    }

    // public static int primeFactors(int num)
    // {
    //     int sum=0;
    //     //factors
    //     for(int i=2; i<num; i++)
    //     {
    //         int factor=num%i;
    //         //if it is true that means i is one of the factor
    //         if(factor==0)
    //         {
    //             //checking wheter the factor is prime or not
    //             boolean flag=checkFactor(i);
    //             //yes, it is prime factor
    //             if(flag== true)
    //             {
    //                 //System.out.println(i);
    //                 int fact1= digits(i);
    //                 sum+=fact1;
    //             }
    //         }
    //     }
        
    //     return sum;
    // }

    public static int factorisation(int num){
        /*
         * ek while loop use karunga and then uske baad mein ek iterator 
         * lunga jisko initially 2 se initialiation karunga. uske baad
         * if condition se check karunga ki vo uska factor hai ki nahi
         * agar hua to number ko usse divide karke vapas loop ke starting mein bhej dunga
         * else condition mein iterator ki value increase kar dunga
         */
        int sum=0;
        int factor=2;
        while(num>0){
            int check=num%factor;
            if(check==0)
        }

        return sum;
    }

    public static void main(String args[]){

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the number");
        int num=input.nextInt();
        //sum of digits
        int sum1=digits(num);
        //System.out.println(sum1);

        //sum of prime factors
        int sum2=factorisation(num);
        //System.out.println(sum2);

        //checking whether the sum is true or not
        if(sum1==sum2)
        System.out.println("It is Smit number");
        else
        System.out.println("It is not Smit number");
    }
    
}
