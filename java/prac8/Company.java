//class employee
//var name,age,salary and empno
//set using constructor
//array of obj of 10 employee

import java.util.Scanner;

class Employee{
    Scanner input=new Scanner(System.in);
    String name;
    int age;
    int salary;
    //int empno
    Employee(){
        this.name=input.next();
        this.age=input.nextInt();
        this.salary=input.nextInt();
    }

    public void set(){
        System.out.println("Name: "+this.name+" Age: "+this.age+" Salary: "+this.salary);
    }

}
class Company{
    public static void main(String args[]){
        System.out.println("H");

        Employee[] e=new Employee[10];
        for(int i=0; i<10; i++)
        {
            e[i].set();
        }
    }
}