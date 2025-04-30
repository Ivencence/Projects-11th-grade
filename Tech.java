public class Tech {
    public static void main(String[] args) {
        Tech[] inventory = {
                new Computer(1000, "computer", "PC 2014", "Lenovo"),
                new Phone(700, "phone", "A55", "Samsung"),
                new Tablet(1500, "tablet", "IPad 10 Pro", "Apple")
        };

        System.out.println("Our store has:");
        for (Tech tech  : inventory) {
            System.out.println("The " + tech.getCompany() +" " + tech.getType() + " " + tech.getModel() + ", which uses: " + tech.getSystemOperator());
            tech.showUsage();
        }
    }
}

class Tech {
    int price;
    String type;
    String model;
    String company;

    public Tech(int price, String type, String model, String company) {
        this.price = price;
        this.type=type;
        this.model = model;
        this.company = company;
    }

    public String getCompany() {
        return company;
    }
    public String getModel(){
        return model;
    }
    public String getType(){
        return type;
    }

    public void showUsage() {
    }

    public String getSystemOperator() {
        return "";
    }
}

class Computer extends Tech {
    public Computer(int price, String type, String model, String company) {
        super(price, type, model, company);
    }

    @Override
    public void showUsage() {
        System.out.println("The " + type + " is used for work.");
    }

    @Override
    public String getSystemOperator() {
            return "system operator is Windows";
        }
    }

class Phone extends Tech {
    public Phone(int price, String type, String model, String company) {
        super(price, type, model, company);
    }

    @Override
    public void showUsage() {
        System.out.println("The " + type + " is used for calls.");
    }

    @Override
    public String getSystemOperator() {
            return "system operator is Android";
        }
    }

class Tablet extends Tech {
    public Tablet(int price, String type, String model, String company) {
        super(price, type, model, company);
    }
    public void showUsage(){
        System.out.println("The " + type + " is used for studying.");
    }

    public String getSystemOperator() {
        return "system operator is Android";
    }
}
