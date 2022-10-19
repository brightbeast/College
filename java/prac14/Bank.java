// import java.util.Scanner;
class Bank{
    static int curr=2000;
    static void withdrawl(int wd){
        try{
            if(curr<wd)
            wd/=0;
            else{
                curr-=wd;
                System.out.println("Balance "+curr);
            }
        }
        catch(Exception e){
            System.out.println("Not sufficient balance");
        }
    }

    public static void main(String args[]){
        // Scanner input=new Scanner(System.in);
        // int a=input.nextInt();
        // int wd=1400;
        withdrawl(1400);
        withdrawl(300);
        withdrawl(500);
    }
}