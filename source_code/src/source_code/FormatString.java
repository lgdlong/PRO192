package source_code;

import interfaces.I_FormatString;
import java.util.LinkedHashSet;

public class FormatString implements I_FormatString {
    /**
     * Converts a string to "Title Case".
     *
     * @param value The input string to be converted.
     * @return The string converted to "Title Case". Returns an empty string if input is null or empty.
     */
    public String titleCase(String value) {
        if (value == null || value.isEmpty()) {
            return ""; // Return an empty string if null or empty
        }

        StringBuilder titleCased = new StringBuilder();
        String[] words = value.split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                titleCased.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        return titleCased.toString().trim(); // Remove trailing whitespace
    }

    /**
     * Removes duplicate words from a string and maintains their original order.
     *
     * @param value The input string to process.
     * @return The string with duplicate words removed. Returns an empty string if input is null or empty.
     */
    public String removeDuplicatedWords(String value) {
        if (value == null || value.isEmpty()) {
            return ""; // Return an empty string if null or empty
        }

        String[] wordsArray = value.toLowerCase().split("\\s+");
        LinkedHashSet<String> set = new LinkedHashSet<>();

        for (String word : wordsArray) {
            if (!word.isEmpty()) {
                set.add(word); // Adding to a Set automatically handles duplicates
            }
        }

        return String.join(" ", set); // Join the words back into a string
    }

    /**
     * Reverses the given string.
     *
     * @param value The input string to be reversed.
     * @return The reversed string. Returns an empty string if input is null or empty.
     */
    public String reverseString(String value) {
        if (value == null || value.isEmpty()) {
            return ""; // Return an empty string if null or empty
        }

        return new StringBuilder(value).reverse().toString(); // Reverse the string using StringBuilder
    }

    /**
     * Converts a string to snake_case format.
     *
     * @param value The input string to be converted.
     * @return The string converted to snake_case. Returns an empty string if input is null or empty.
     */
    public String toSnakeCase(String value) {
        if (value == null || value.isEmpty()) {
            return ""; // Return an empty string if null or empty
        }

        return value
                .replaceAll("\\s+", "_") // Replace spaces with underscores
                .toLowerCase(); // Convert to lowercase
    }

    /**
     * Counts the number of occurrences of a specified substring within the given string.
     *
     * @param value The input string to be searched.
     * @param substring The substring to count occurrences of.
     * @return The number of occurrences of the substring. Returns 0 if input is null or empty.
     */
    public int countOccurrences(String value, String substring) {
        if (value == null || value.isEmpty() || substring == null || substring.isEmpty()) {
            return 0; // Return 0 if input is null or empty
        }

        int count = 0;
        int index = 0;

        // Use indexOf to find occurrences
        while ((index = value.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length(); // Move index forward to continue searching
        }

        return count; // Return the count of occurrences
    }

}