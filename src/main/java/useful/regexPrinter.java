package useful;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class regexPrinter {

    public static void main(String[] args) {
        String formatThis = "";
        System.out.println(switchQoutations(formattedCREs(formatThis)));

    }

    private static String formattedCREs(String formatThis) {
        String[] formatThisArray = formatThis.split("(?<=\\G.....)"); // I need to study regex

        // Translating to set removes duplicates.
        Set<String> uniqueSet = new HashSet<>(Arrays.asList(formatThisArray));
        String formatted = Arrays.toString(
                uniqueSet.stream().
                        map(e -> e.replace(e, "\"" + e + "\"")).toArray()
        );

        return formatted.substring(1, formatted.length() - 1);
    }

    private static String toQoutedArray(String formatThis) {
        // ARCHAIC - do not use!

        StringBuilder sb = new StringBuilder(formatThis);
        String added_characters = "\", \"";

        double stringLengthAfterFormating = formatThis.length() * (5.0 + added_characters.length())/5.0;
        int spacingAfterFormatting = (5 + added_characters.length());

        for (int position = 5; position <= stringLengthAfterFormating; position += spacingAfterFormatting) {
            sb.insert(position, added_characters);
        }
        sb.insert(0, '\"');
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    private static String switchQoutations(String input) {
        String output = "No Quotations Found!";

        if (input.contains("'")) {
            output = input.replace('\'', '"');
        }
        else if (input.contains("\"")) {
            output = input.replace('"', '\'');
        }
        return output;
    }


}
