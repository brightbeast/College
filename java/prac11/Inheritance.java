class Vehicle{
    String vehicle_type;
    public void display(){
        System.out.println("Vehicle class (Overloading)");
    }
}

class Car extends Vehicle{
    String model_type;
    String company_name;
    Car(String vehicle_type,String model_type, String company_name){
        super();
        this.vehicle_type=vehicle_type;
        this.model_type=model_type;
        this.company_name=company_name;
    }
    public void display(){
        System.out.println("vehicle type: "+vehicle_type);
        System.out.println("Model type: "+model_type);
        System.out.println("Company name: "+company_name);
    }

}

class Inheritance{
    public static void main(String args[]){
        Car c1=new Car("Hatchback", "German","BMW");
        c1.display();
    }
}