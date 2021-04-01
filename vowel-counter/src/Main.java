import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Type the word:");
        String word = scan.nextLine();

        String[] letters = word.split("");
        int count = 0;

        for (String l : letters) {
            if (l.matches("[aeiouAEIOU]")) {
                count += 1;
            }
        }

        System.out.println("The number of vowels is: " + count);
    }
}
