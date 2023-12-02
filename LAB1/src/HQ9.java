public class HQ9 {
    public static String removePunctuation(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch) || Character.isWhitespace(ch)) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Let's try, Mike!";

        String result = removePunctuation(s);

        System.out.println("String with punctuation removed: " + result);
    }
}
