import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String regex = "([:*])\\1(?<word>[A-Z][a-z]{2,})\\1\\1";
        String thresholdRegex = "\\d+";

        Pattern emojisPattern = Pattern.compile(regex);
        Matcher emojisMatcher = emojisPattern.matcher(str);

        Pattern thresholdPattern = Pattern.compile(thresholdRegex);
        Matcher thresholdMatcher = thresholdPattern.matcher(str);

        int emojisCount = 0;
        int coolThreshold = 1;
        List<String> matchedEmojis = new LinkedList<>();
        List<String> coolEmojis = new LinkedList<>();

        while (emojisMatcher.find()) {
            emojisCount++;
            matchedEmojis.add(emojisMatcher.group());
        }

        while (thresholdMatcher.find()) {
            String currentGroup = thresholdMatcher.group();
            for (int i = 0; i < currentGroup.length(); i++) {
                coolThreshold *= Integer.parseInt(String.valueOf(currentGroup.charAt(i)));
            }
        }

        for (int i = 0; i < matchedEmojis.toArray().length; i++) {
            String currentEmoji = matchedEmojis.get(i);
            int currentThreshold = 0;

            for (int j = 2; j < currentEmoji.length() - 2; j++) {
                currentThreshold += (int) currentEmoji.charAt(j);
            }

            if (currentThreshold > coolThreshold) {
                coolEmojis.add(currentEmoji);
            }
        }

        System.out.println("Cool threshold: " + coolThreshold);
        System.out.println(emojisCount + " emojis found in the text. The cool ones are:");

        for (String emoji: coolEmojis) {
            System.out.println(emoji);
        }
    }
}
