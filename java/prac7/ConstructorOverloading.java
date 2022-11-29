//zero argument cons overloading
//student name, roll number and total marks
//3 parameter and use of ths keywords

import java.util.Scanner;

class Student{
	Scanner input=new Scanner(System.in);
	String name;
	int roll_num;
	int marks;

	Student(){
		name=input.next();
		roll_num=input.nextInt();
		marks=input.nextInt();
		System.out.println("Constructor overloadin without argument");
		// System.out.println("Name of the student, roll number and marks is "+this.name+","+this.roll_num+" and "+this.marks+" respectively");
		System.out.println("Name of the student, roll number and marks is "+name+","+roll_num+" and "+marks+" respectively");
	}

	Student(String name, int roll, int marks){
		this.name=name;
		this.roll_num=roll;
		this.marks=marks;
		System.out.println("Constructor overloadin with three argument");
		// System.out.println("Name of the student, roll number and marks is "+this.name+","+this.roll_num+" and "+this.marks+" respectively");
		System.out.println("Name of the student, roll number and marks is "+name+","+roll_num+" and "+marks+" respectively");
	}
}

class ConstructorOverloading{
	public static void main(String args[])
	{
		Student s1=new Student();
		Student s2=new Student("James", 007, 99);
	}
}