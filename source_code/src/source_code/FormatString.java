package source_code;

import interfaces.I_FormatString;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

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
    
    public void longestSubstring(String inputString) {
        char[] arr1 = inputString.toCharArray();
        String long_str = null;
        int str_length = 0;
        // character at index i
        // LinkedHashMap for sure index follow to order
        LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            char ch = arr1[i];
            if (!charPosMap.containsKey(ch)) {
                charPosMap.put(ch, i);
            } else {
                i = charPosMap.get(ch);
                charPosMap.clear();
            }
            if (charPosMap.size() > str_length) {
                str_length = charPosMap.size();
                long_str = charPosMap.keySet().toString();
            }
        }
        System.out.println("Input String : " + inputString);
        System.out.println("The longest substring : " + long_str);
        System.out.println("The longest Substring Length : " + str_length);
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
    
    public String removeDuplicateChar(String str) {
        HashSet<Character> charsPresent = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            if (!charsPresent.contains(str.charAt(i))) {
                stringBuilder.append(str.charAt(i));
                charsPresent.add(str.charAt(i));
            }
        }

        return stringBuilder.toString();
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
    
    public boolean isPasswordComplex(String input) {
        if (input == null) return false;

        // Regex pattern for complexity: at least one uppercase, one lowercase, one digit, and 8+ characters
        String pattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).{8,}$";
        return input.matches(pattern);
    }

    public String[] toNumberArray(String input) {
        // Split by non-digit characters and filter out empty strings
        return Arrays.stream(input.split("\\D+"))
                .filter(str -> !str.isEmpty()) // Remove empty strings
                .toArray(String[]::new);       // Collect into a String array
    }
    
    /**
    * Finds the most frequent character in the input string and its occurrence count.
    *
    * @param input the input string to analyze
    * @return a Map.Entry with the most frequent character as the key and its count as the value;
    *         returns null if the input is empty
    * @throws NullPointerException if input is null
    */
    public Map.Entry<Character, Integer> findMostFrequentChar(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Populate the frequency map
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Find the character with the highest frequency
        Map.Entry<Character, Integer> mostFrequent = null;
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (mostFrequent == null || entry.getValue() > mostFrequent.getValue()) {
                mostFrequent = entry;
            }
        }

        return mostFrequent;
    }
    
    /**
     * Removes characters from position l to r in the string s.
     *
     * @param s The input string
     * @param l The starting index (1-based)
     * @param r The ending index (1-based)
     * @return The resulting string after removing characters from l to r
     */
    public String removeSubstring(String s, int l, int r) {
        // Validate indices
        if (l < 1 || r > s.length() || l > r) {
            throw new IllegalArgumentException("Invalid indices.");
        }
        
        // Create the result by removing the section from l to r
        return s.substring(0, l - 1) + s.substring(r);
    }
}