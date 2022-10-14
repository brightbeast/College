class Vehicle{
    int NoOfWheels;
}

class TwoWheeler extends Vehicle{
    TwoWheeler(){
        NoOfWheels=2;
    }
}

class FourWheeler extends Vehicle{
    FourWheeler(){
        NoOfWheels=4;
    }
}

class Ducati extends TwoWheeler{
    Ducati(){
        super();
        System.out.println("The number of wheels in Ducati is "+NoOfWheels);
    }
}

class Kawasaki extends TwoWheeler{
    Kawasaki(){
        super();
        System.out.println("The number of Wheels in Kawasaki Ninja is "+NoOfWheels);
    }
}

class Pagani extends FourWheeler{
    Pagani(){
        super();
        System.out.println("The number of wheels in Pagani is "+this.NoOfWheels);
    }

}

class Porsche extends FourWheeler{
    Porsche(){
        super();
        System.out.println("The number of wheels in Porsche is "+this.NoOfWheels);
    }

}

class Vehicles{
    public static void main(String args[]){
        Pagani p1=new Pagani();
        Kawasaki k1=new Kawasaki();
        Porsche p2=new Porsche();
        Ducati d1=new Ducati();
    }
}