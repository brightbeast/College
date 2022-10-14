abstract class A{
    abstract void display();
}

class A1 extends A{
    public void display(){
        System.out.println("A1 is invoked");
    }
}

class A2 extends A{
    public void display(){
        System.out.println("A2 is invoked");
    }
}

class Abstraction{
    public static void main(String args[]){
        A1 a1=new A1();
        A2 a2=new A2();

        a1.display();
        a2.display();
    }
}