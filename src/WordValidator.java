public class WordValidator {
    public static boolean isValid(String word) {
        if (word.contains(" ")) {
            System.out.println(word + " is an invalid word");
            return false;
        }
        return true;
    }
}