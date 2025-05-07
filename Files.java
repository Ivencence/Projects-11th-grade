import java.io.*;
import java.util.*;

public class Files {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter desktop file");
        String desktop = myObj.nextLine();
        System.out.println("Enter shopping item");
        String item = myObj.nextLine();
        while(item.equals("done") == false){
            System.out.println("Enter shopping item");
        item = myObj.nextLine();
        fileWriter(item, desktop);
        }
    }

    public static void fileWriter(String message, String desktop){
        try(FileWriter fw = new FileWriter(desktop + ".text", true)){
            fw.write(message);
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
