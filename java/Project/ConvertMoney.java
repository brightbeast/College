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
        //Giving info about currency
        System.out. println("Afghani \t Armenian Dirham \t Azerbaijani Manai \t Bangladeshi Taka \t Cambodian Riel");

		System.out. println("Chinese Yuan \t Georgian Lari \t Hong Kong Dollar \t Indonesian Rupiah \t Japanese Yen");

		System.out. println("Kazakhstani Tenge \t Lao Kip \t Malaysian Ringgit \t South Korean Won \t Sri Lankan Rupee");

		System.out. println("Maldivian Rufiyaa \t Pakistani Rupee \t Philippine Peso \t Thai Baht \t Taiwanese Dollar");

		System.out. println("Vietnamese Dong \t Bahraini Dinar \t Arab Emirates Diram \t Saudi Arabia Riyal \t Omani Rial");

		System.out. println("Israeli Shekel \t Iraqi Dinar \t Iranial Rial \t Jordanian Dinar \t Kuwaiti Dinar");

		System.out. println("Lebanese Pound \t Qatari Riyal \t Libyan Dinar \t Bosnian \t Euro");

		System.out. println("Bulgarian Lev \t Czech Koruna \t Croatian Kuna \t Danish Krone \t Hungarian Forint");

		System.out. println("Icelandic Krona \t Moldovan Leu \t Macedonian Denar \t Norwegian Krone \t Polish Zloty");

		System.out. println("Romanian Leu \t Serbain Denar \t Russian Ruble \t Swedish Krona \t Swiss Franc");	
	
	System.out. println("Turkish Lira \t Ukrainian Hryvnia \t British Pound \t United States Dollar \t Canadian Dollar");

		System.out. println("Aruban \t Bajan Dollar \t Bahamian Dollar \t Dominican Peso \t Jamaican Dollar");

		System.out. println("Mexican Peso \t Argentine Peso \t Bolivian \t Brazilian Real \t Chilean Peso");

		System.out. println("Columbian Peso \t Peruvian Sol \t Paraguayan Guarani \t Uruguayan Peso \t Venezuelan Bolivar");

		System.out. println("South African Rand \t Egyptian Pound \t Ghani Cedi \t Gambian Dalasi \t Kenyan Shilling");

		System.out. println("Morrocan Dirham \t Mauritian Ruppee \t Nambian Dollar \t Nigerian Naira \t Seychellios Rupee");	

		System.out. println("Tunisia Dinar \t Ugadan Shilling \t CFA Franc \t Australian Dollar \t New Zealand Dollar");
		System.out. println("Fijian Dollar \t CPF Franc \t Indian Rupee");

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