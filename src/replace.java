import java.util.Scanner;

public class replace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();


        word=word.replace("dump","cool");
        System.out.println(word);

    }
}
