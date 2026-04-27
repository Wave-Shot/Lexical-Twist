import java.util.Scanner;

public class LexicalTwistPuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        String reversed = new StringBuilder(word1).reverse().toString();

        if (reversed.equalsIgnoreCase(word2)) {
            String lower = reversed.toLowerCase();
            String result = "";

            for (int i = 0; i < lower.length(); i++) {
                char c = lower.charAt(i);
                if ("aeiou".indexOf(c) != -1) {
                    result += "@";
                } else {
                    result += c;
                }
            }

            System.out.println(result);
        } else {
            System.out.println("Not reverse");
        }
    }
}