// package pranjal_tiwari.javafile;
class Vehicle {
    public void drive() {
        System.out.println("Driving a vehicle");
    }
}

class Car extends Vehicle {
   
    public void drive() {
        System.out.println("Driving a car");
    }
}

class Bus extends Vehicle {

    public void drive() {
        System.out.println("Driving a bus");
    }
}

class Truck extends Vehicle {
    
    public void drive() {
        System.out.println("Driving a truck");
    }
}

public class ques_11 {
    public static void main(String[] args) {
        Vehicle obj = new Vehicle();
        Vehicle obj1 = new Car();
        Vehicle obj2 = new Bus();
        Vehicle obj3 = new Truck();

        obj.drive();
        obj1.drive(); 
        obj2.drive(); 
        obj3.drive();
    }
}

