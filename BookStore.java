import java.util.Scanner;
public class BookStore {
    public static void main(String[] args) {
        String[] title = {"War and Peace", "Great Expectations", "The Three Musketeers", "Faust"};
        int[] quantity = {10, 10, 6, 6};
        double[] price = {24, 19.5, 20, 21};

        Display(title, quantity, price);
        Check(title);

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the code of the book: ");
        int input = myObj.nextInt();
        System.out.println("Transfer " + price[input] + "$");
        System.out.println("How much is your balance?");
        double money = myObj.nextDouble();


        if (price[input] <= money) {
            System.out.println("Here is your copy of " + title[input] + " and your change: ");
            quantity[input] -= 1;
            money -= price[input];
            System.out.println(money);
        } else {
            System.out.println("Card declined.");
        }
        System.exit(0);
    }

    public static void Display(String[] name, int[] quantity, double[] price) {
        for (int i = 0; i < name.length; i++) {
            System.out.println(i + " " + name[i] + " - Available: " + quantity[i] + " - Price: " + price[i]);

        }

    }

    public static void Check(String[] name) {
        System.out.println("What book are you looking for?");
        Scanner myObj = new Scanner(System.in);
        String title = myObj.nextLine();
        boolean found = false;
        for (String i : name) {
            if (title.equalsIgnoreCase(i)) {
                System.out.println("Book is available.");
                found = true;
                break;
            }
        }
            if(found != true) {
                System.out.println("Book is not available.");
            }
    }
}
