public class compositionTask {
    public static void main(String[] args) {
        Engine engine = new Engine("V8");
        Car car = new Car("Ford", engine, 18);

        car.displayInfo();


    }
}

class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class Wheel {
    private int size;

    public Wheel(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}

class Car {
    private String brand;
    private Engine engine;
    private Wheel frontLeftWheel;
    private Wheel frontRightWheel;
    private Wheel backLeftWheel;
    private Wheel backRightWheel;


    public Car(String brand, Engine engine, int wheelSize) {
        this.brand = brand;
        this.engine = engine;

        // Task 2: Initialize all the Wheel objects inside the constructor.
        this.frontLeftWheel = new Wheel(wheelSize);
        this.frontRightWheel = new Wheel(wheelSize);
        this.backLeftWheel = new Wheel(wheelSize);
        this.backRightWheel = new Wheel(wheelSize);
    }

    public void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Engine Type: " + engine.getType());
        System.out.println("Front Left Wheel Size: " + frontLeftWheel.getSize() + " inch");
        System.out.println("Front Right Wheel Size: " + frontRightWheel.getSize() + " inch");
        System.out.println("Back Left Wheel Size: " + backLeftWheel.getSize() + " inch");
        System.out.println("Back Right Wheel Size: " + backRightWheel.getSize() + " inch");

    }

    public String getBrand(){
        return brand;
    }

}
