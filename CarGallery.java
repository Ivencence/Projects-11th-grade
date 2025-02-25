import java.util.Scanner;

public class CarGallery {
    public static void main(String[] args) {
        Car[] carArr = {
                new Car("Toyota", "Prius", 2010, 25000, false),
                new Car("Ferrari", "812", 2024, 500000, false),
                new Car("Peugeot", "308", 2007, 30000, false),
                new Car("Mazda", "2", 2010, 20000, false)
        };

        // Display all cars
        for (Car element : carArr) {
            element.Display();
        }

        Scanner myObj = new Scanner(System.in);

        // Search for a car model
        System.out.println("What model are you looking for?");
        String input = myObj.next();
        for (Car element : carArr) {
            if (input.equals(element.getMake())) {
                System.out.println("Car leased: " + element.getIsLeased());
            }
        }

        // Find the most expensive car
        int index = 0;
        double expensive = 0;
        for (int i = 0; i < carArr.length; i++) {
            if (carArr[i].getPrice() > expensive) {
                expensive = carArr[i].getPrice();
                index = i;
            }
        }
        System.out.println("Most expensive is: " + carArr[index].getMake());

        // Calculate average price
        double sum = 0;
        for (Car element : carArr) {
            sum += element.getPrice();
        }
        double average = sum / carArr.length;
        System.out.println("Average is " + average);

        // Lease a car
        System.out.println("What car do you want to lease?");
        input = myObj.next();
        for (Car element : carArr) {
            if (element.getMake().equals(input)) { // Fixed missing parenthesis
                System.out.println("Here is your " + element.getMake());
                element.setIsLeased(true);
            }
        }

        myObj.close(); // Close scanner
    }
}

class Car {
    private String make;
    private String model;
    private int year;
    private double price;
    private boolean isLeased;

    public Car(String make, String model, int year, double price, boolean isLeased) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.isLeased = isLeased;
    }

    public String getMake() {
        return make;
    }

    public boolean getIsLeased() {
        return isLeased;
    }

    public double getPrice() {
        return price;
    }

    public void setIsLeased(boolean isLeased) {
        this.isLeased = isLeased;
    }

    public void Display() {
        System.out.println(make + " " + model + " " + year + " " + price + "; Leased:" + isLeased);
    }
}
