import java.util.Scanner;

public class startWithAndEndsWith {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();


        System.out.println("Starts with a: " + word.startsWith("a"));
        System.out.println("Ends with e: " + word.endsWith("e"));
    }
}
