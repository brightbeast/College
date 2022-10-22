// Line 89 I am not able to write nextLine I am only able write next
import java.util.Scanner;
class MoneyConvert{
    public static double convert1(String mt, int val){
        double ans=-1;
        switch(mt){
            case "Indian Rupees":
            ans=val;
            break;

            case "Dollar":
            ans=val*82.54;
            break;

            case "Euro":
            ans=val*81.37;
            break;

            case "Dinar":
            ans=val*266;
            break;

            default:
            System.out.println("Enter appropriate value");
        }
        return ans;
    }

    public static double convert2(String me,String mt, double val){
        double ans=-1;
        // System.out.println(me);
        if(mt.equals(me))
        ans=val;
        else{
            switch(me){
            case "Indian Rupees":
            ans=val;
            break;

            case "Dollar":
            ans=val/82.54;
            break;

            case "Euro":
            ans=val/81.37;
            break;

            default:
            System.out.println("Enter appropriate value");
            break;
            }
        }
        // System.out.println(ans);
        return ans;
    }

    public static double convert(String mt, String me, int val){
        if(val==0)
        return 0;
        
        //Converting the entered money data in indian rupees
        double constant= convert1(mt, val);
        
        //Converting the constant into the desirable currency type
        double ans=convert2(me,mt,constant);
        // System.out.println("In convert function "+ans);
        
        return ans;
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("If you want to exit from the system then press exit");
        String moneyType="";
        String moneyExpect="";
        while(!moneyType.equals("exit")){
            //Asking the user what currency he is going to enter
            System.out.println("Which currency you are entering?");
            moneyType=input.nextLine();

            //If user wants to terminate the code
            if(moneyType.equals("exit"))
            break;

            //Asking the value of the currency 
            System.out.println("Please enter the value");
            int moneyValue=input.nextInt();

            //Asking the user in which currency he is interested to know
            System.out.println("In which currency you want to know?");
            moneyExpect=input.next();
            // System.out.println(moneyType);

            double ans=convert(moneyType,moneyExpect, moneyValue);
            System.out.println("The value of "+moneyValue+" "+moneyType+" is "+ans+" "+moneyExpect);
        }
    }
}