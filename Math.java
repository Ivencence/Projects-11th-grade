import java.io.*;
import java.util.*;

public class Math {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = myObj.nextLine();
        int i = 0;
        while(i<5) {
            String[] question = {"1+2", "3+3", "7+8", "14-5", "16-4"};
            String[] answers = {"3", "6", "15", "11", "12"};
            boolean[] ans = new boolean[5];
            System.out.println(question[i]);
            System.out.println("Enter the answer:");
            String[] item = new String[5];
            item[i]= myObj.nextLine();
            if(answers[i].equals(item[i])){
                ans[i] = true;
            }
            else{ans[i]=false;
            }
            try (FileWriter fw = new FileWriter(name + "-answers", true)) {
                fw.write("Question: " + question[i] + " " + item[i] + ": " + ans[i]);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            i++;
        }
    }
}
