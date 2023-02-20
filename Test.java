package Inheritance;
class Vehicle {//parent class
    int maxSpeed = 120;
}
 
// child class Car extending vehicle
class Car extends Vehicle {
    int maxSpeedVehicle = 200;
 
    void display()
    {
        // print maxSpeed of base class (vehicle)
        System.out.println("Maximum SpeedVehicle: " + super.maxSpeed);
    }
}
class Test {
    public static void main(String[] args)
    {
        Car tiny = new Car();
        tiny.display();
    }
}

