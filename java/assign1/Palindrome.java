import java.util.Scanner;

class Palindrome{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the input");
        String name=new String();
        name=input.next();
        int start=0;
        int end=name.length()-1;
        boolean flag=true;
        while(start<=end)
        {
            if(name.charAt(start)!=name.charAt(end)){
                flag=false;
                break;
            }
            start++;
            end--;
        }

        if(flag==false)
        System.out.println("It is not palindrome");
        else
        System.out.println("It is palindrome");
    }
}