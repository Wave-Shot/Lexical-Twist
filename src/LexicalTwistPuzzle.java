import java.util.Scanner;

public class LexicalTwistPuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        String combined = (word1 + word2).toUpperCase();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < combined.length(); i++) {
            char c = combined.charAt(i);

            if ("AEIOU".indexOf(c) != -1) {
                vowels++;
            } else if (Character.isLetter(c)) {
                consonants++;
            }
        }

        String result = "";

        if (vowels > consonants) {
            for (int i = 0; i < combined.length(); i++) {
                char c = combined.charAt(i);
                if ("AEIOU".indexOf(c) != -1 && result.indexOf(c) == -1) {
                    result += c;
                }
                if (result.length() == 2) break;
            }
            System.out.println(result);
        } else if (consonants > vowels) {
            for (int i = 0; i < combined.length(); i++) {
                char c = combined.charAt(i);
                if ("AEIOU".indexOf(c) == -1 && Character.isLetter(c) && result.indexOf(c) == -1) {
                    result += c;
                }
                if (result.length() == 2) break;
            }
            System.out.println(result);
        } else {
            System.out.println("Vowels and consonants are equal");
        }
    }
}