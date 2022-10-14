interface Shape2D{
    double pi=3.14;
    void area(int r);
}
interface Shape3D{
    double pi=3.14;
    void volume(int r);
}


abstract class Shape {
    abstract void display();
}

class Circle extends Shape implements Shape2D{
    double ans;
    public void area(int r){
        ans=pi*r*r;
    }

    public void display(){
        System.out.println("Area of circle is "+this.ans);
    }
}

class Sphere extends Shape implements Shape3D{
    double ans;
    public void volume(int r){
        ans=(4*pi*r*r*r)/3;
    }

    public void display(){
        System.out.println("Volume of sphere is "+this.ans);
    }
}

class InterfaceInheritance{
    public static void main(String args[]){
        Circle c1=new Circle();
        c1.area(5);
        c1.display();

        Sphere s1=new Sphere();
        s1.volume(5);
        s1.display();
    }
}