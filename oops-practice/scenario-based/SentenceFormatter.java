package scenario_based;

class SentenceFormatter {

    public static String formatParagraph(String input) {
        if (input == null || input.trim().isEmpty()) {
            return "";
        }

        String cleaned = input.trim().replaceAll("\\s+", " ");
        StringBuilder result = new StringBuilder();

        boolean capitalizeNext = true;

        for (int i = 0; i < cleaned.length(); i++) {
            char ch = cleaned.charAt(i);

            if (capitalizeNext && Character.isLetter(ch)) {
                result.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                result.append(ch);
            }

            if (ch == '.' || ch == '?' || ch == '!') {
                capitalizeNext = true;
                if (i + 1 < cleaned.length() && cleaned.charAt(i + 1) != ' ') {
                    result.append(' ');
                }
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "hello   world.this is   java!how are you?   i am fine.";
        System.out.println(formatParagraph(input));
    }


}
