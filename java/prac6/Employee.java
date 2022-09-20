//name, age,salary
//obj->person
//set and display

import java.util.Scanner;

class Employee{
	String name;
	int age;
	int salary;

	public void set(){
		Scanner input=new Scanner(System.in);
		this.name=input.next();
		this.age=input.nextInt();
		this.salary=input.nextInt();
	}

	public void display(){
		System.out.println("The name of the person, age and salary is "+this.name+","+this.age+" and "+this.salary+" respectively");	
	}

	public static void main(String args[]){
		Employee person=new Employee();
		person.set();
		person.display();
	}
}