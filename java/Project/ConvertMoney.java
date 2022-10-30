// Line 89 I am not able to write nextLine I am only able write next 
import java.util.*;
import Project1.*;

class ConvertMoney{

    public static double convert(String mt, String me, double val){
        if(val==0)
        return 0;
        
        //Converting the entered money data in indian rupees
        Import i1=new Import();
        double constant=i1.importing(mt, val);
        //Converting the constant into the desirable currency type
        Export e1=new Export();
        double ans=e1.exporting(me,mt,constant);
        return ans;
    }
    public static void main(String args[]){
        //for value
        Scanner input=new Scanner(System.in);
        //for moneyExpected
        Scanner input1=new Scanner(System.in);
        //for moneyType
        Scanner input2=new Scanner(System.in);
        System.out.println("If you want to exit from the system then press exit");
        String moneyType="";
        String moneyExpect="";
        // while(!moneyType.equals("exit")){
        while(true){
            //Asking the user what currency he is going to enter
            System.out.println("Which currency you are entering?");
            moneyType=input2.nextLine();

            // If user wants to terminate the code
            if(moneyType.equals("exit"))
            break;

            //Asking the value of the currency 
            System.out.println("Please enter the value");
            double moneyValue=input.nextDouble();

            //Asking the user in which currency he is interested to know
            System.out.println("In which currency you want to know?");
            moneyExpect=input1.nextLine();
            // System.out.println(moneyType);

            double ans=convert(moneyType,moneyExpect, moneyValue);
            if(ans>=0.0)
            System.out.println("The value of "+moneyValue+" "+moneyType+" is "+ans+" "+moneyExpect);
        }
    }
}   