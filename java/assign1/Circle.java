import java.util.Scanner;

class Circle{

    Circle(){
        System.out.println("Enter the radius");
        Scanner input=new Scanner(System.in);
        int r=input.nextInt();
        System.out.println("Constructor with zero argument");

        double area=3.14*r*r;
        System.out.println("Area of the circle is "+area);
    }

    Circle(int r){
        System.out.println("Constructor with 1 argument");
        double area=3.14*r*r;
        System.out.println("Area of the circle is "+area);
    }
    public static void main(String args[]){
        Circle c1=new Circle();
        Circle c2=new Circle(5);
        
    }
}