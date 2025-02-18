import java.util.Scanner;
public class EnhancedLoops {
    public static void main(String[] args) {
        String[] name = {"water", "juice", "chips", "snickers"};
        int[] quantity = {10, 10, 6, 6};
        double[] price = {1, 1.3, 1.5, 2};

        Display(name, quantity, price);

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the code of the item: ");
        int input = myObj.nextInt();
        System.out.println("Input " + price[input] + "$");
        System.out.println("How much are you inputting?");
        double money = myObj.nextDouble();


        if (price[input] == money) {
            System.out.println("Here is your " + name[input]);
        } else {
            while (price[input] > money) {
                double rest = price[input] - money;
                System.out.println("You need to put " + rest + " more. Put here: ");
                double userInput = myObj.nextDouble();
                money += userInput;
            }
            System.out.println("Here is your " + name[input]);
        }
System.exit(0);
    }

    public static void Display(String[] name, int[] quantity, double[] price) {
        for (int i = 0; i < name.length; i++) {
            System.out.println(i + " " + name[i] + " - Available: " + quantity[i] + " - Price: " + price[i]);

        }

    }
}
