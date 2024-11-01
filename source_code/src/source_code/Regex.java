package source_code;

public class Regex {
    /**
     * 
     * str.split("[a-zA-Z0-9]+"); // splits by any alphanumeric word
     * 
     * str.split("\\D+"); // splits by any non-digit sequence
     * 
     * str.split("\\W+"); // splits by any sequence of non-word characters
     * 
     * str.split("[,\\s;]+"); // splits by comma, white space, or semicolon
     * 
     * // splits before each uppercase letter:
     * "PhungLuuHoangLong" -> {"Phung", "Luu", "Hoang", "Long"}
     * str.split("(?=[A-Z])"); 
     * 
     * str.split("[^\\d.-]+"); // Split by any non-numeric characters (Take real number)
     * 
     * 
     * "abc123xyz456" -> ["abc", "123", "xyz", "456"]
     * str.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
     *
     * Validate a Strong Password : using matches()
     * String regex = "(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}";
     * 
     * Find floating point numbers : using matches
     * Example: Find numbers in "The values are 3.14, -2.71, and 1.23e4"
     * String regex = "[-+]?\\d*\\.?\\d+(?:[eE][-+]?\\d+)?"; 
     * 
     * // Phone numbers with formats like: 123-456-7890, (123) 456-7890, or 123.456.7890
     * String regex = "\\(?\\d{3}\\)?[-\\s.]?\\d{3}[-\\s.]?\\d{4}";
     * 
     * 
     * // Currency amounts with symbols, like: $100.00, €200, or ¥3000
     * String regex = "[$€¥£]\\d+(\\.\\d{2})?";
     */
}
