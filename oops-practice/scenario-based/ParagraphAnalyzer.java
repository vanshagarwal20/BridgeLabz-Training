package scenario_based;

class ParagraphAnalyzer {

    public static void analyzeText(String paragraph, String oldWord, String newWord) {

        if (paragraph == null || paragraph.trim().isEmpty()) {
            System.out.println("Paragraph is empty or contains only spaces.");
            return;
        }

        String cleaned = paragraph.trim().replaceAll("\\s+", " ");
        String[] words = cleaned.split(" ");

//         Word Count
        System.out.println("Total Words: " + words.length);

//         Longest Word
        String longestWord = "";
        for (String word : words) {
            String pureWord = word.replaceAll("[^a-zA-Z]", "");
            if (pureWord.length() > longestWord.length()) {
                longestWord = pureWord;
            }
        }
        System.out.println("Longest Word: " + longestWord);

//         Replace word (case-insensitive)
        String replacedText = cleaned.replaceAll("(?i)\\b" + oldWord + "\\b", newWord);
        System.out.println("Updated Paragraph:");
        System.out.println(replacedText);
    }

    public static void main(String[] args) {
        String paragraph = "Java is great. java makes development easier and JAVA is powerful.";
        analyzeText(paragraph, "java", "Python");
    }

}
