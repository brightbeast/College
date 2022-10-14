//class employee
//var name,age,salary and empno
//set using constructor
//array of obj of 10 employee

import java.util.Scanner;
import java.util.Random;

class Employee{
    Scanner input=new Scanner(System.in);
    String name;
    int age;
    int salary;
    Random empo=new Random();
    Employee(){
        this.name=input.nextLine();
        this.age=input.nextInt();
        this.salary=input.nextInt();
    }

    public void set(){
        // this.empo=Math.Random()
        int empid=empo.nextInt(100000);
        System.out.println("Name: "+this.name+" Age: "+this.age+" Salary: "+this.salary+" and the employee id is "+empid);
    }

}
class Company{
    public static void main(String args[]){
        //creating objects of array
        Employee[] e=new Employee[3];
        for(int i=0; i<3; i++)
        {
            e[i]=new Employee();
        }
        for(int i=0; i<3; i++){
            e[i].set();
        }
    }
}