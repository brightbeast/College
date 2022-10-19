// package prac13;
import java.util.Scanner;
public class OneDividedZero {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        double c=0;
        try{
            c=a/b;
        }
        // // Exception is super calss and exception is object
        catch(Exception exception){
            System.out.println("Please enter appropriate value");
        }
        System.out.println("The value is "+ c);
    }
}
