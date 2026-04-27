public class LexicalAnalyzer {

    public void process(String word1, String word2) {
        String reversed = new StringBuilder(word1).reverse().toString();

        if (reversed.equalsIgnoreCase(word2)) {
            transform(reversed);
        } else {
            analyze(word1, word2);
        }
    }

    private void transform(String word) {
        word = word.toLowerCase();
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if ("aeiou".indexOf(c) != -1) result += "@";
            else result += c;
        }

        System.out.println(result);
    }

    private void analyze(String w1, String w2) {
        String combined = (w1 + w2).toUpperCase();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < combined.length(); i++) {
            char c = combined.charAt(i);
            if ("AEIOU".indexOf(c) != -1) vowels++;
            else if (Character.isLetter(c)) consonants++;
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