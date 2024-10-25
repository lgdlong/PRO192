
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author PhungLuuHoangLong
 */
public class MyUtilities implements IUtilities {

    @Override
    public int checkIntegerNumber(String value, int min, int max) {
        int number = Integer.parseInt(value);
        
        // The number of digits between 2 -> 10
        boolean hasLimitedDigits = (2 <= value.length() && value.length() <= 10);
        
        // Value between min and max
        boolean isBetweenMinAndMax = min <= number && number <= max;
        
        
        if (hasLimitedDigits && isBetweenMinAndMax) {
           return number;
        }
        
        return value.length();
    }

    /**
     * Removes duplicate words from a string and converts them to title case.
     *
     * This method processes the input string as follows:
     * 1. Converts the string to lowercase to ensure case-insensitivity.
     * 2. Splits the string into words using white space as the delimiter.
     * 3. Uses a LinkedHashSet to remove duplicate words while preserving their original order.
     * 4. Converts each unique word to title case (first letter capitalized, remaining letters in lowercase).
     * 5. Concatenates the title-cased words into a single string.
     *
     * @param value The input string from which to remove duplicate words.
     * @return A string with unique words in title case, or an empty string if the input is empty.
     */
    @Override
    public String removeDuplicatedWords(String value) {

        // Make string to an ArrayList
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(value.toLowerCase().split("\\s+")));
        

        // Remove duplicated words by adding to a Set
        Set<String> set = new LinkedHashSet<>(wordsList);
        wordsList.clear();
        wordsList.addAll(set);
        
        StringBuilder newStr = new StringBuilder();

        // Title case each word and add a space at the end
        for (String word : wordsList) {
            newStr.append(Character.toUpperCase(word.charAt(0)))
                  .append(word.substring(1).toLowerCase())
                  .append(" ");
        }

        String result = newStr.toString().trim();
        
        return result;
    }

    @Override
    public int checkFormatString(String value) {
        boolean isValueValid = value.matches("^[A-Z]{3}\\.\\d{6}\\.[@#$]$");
        
        int number = value.length();
        
        if (isValueValid) {
            String[] words = value.split("\\.");
            number = Integer.parseInt(words[1]);
        }
        
        return number;
    }

    /**
    * Sums all the numeric values in the given string, including decimals.
    *
    * @param value the string containing numbers to sum
    * @return the sum of the numbers in the string
    * @throws IllegalArgumentException if the input is null
    */
   @Override
   public double sumNumbers(String value) {
       if (value == null) {
           throw new IllegalArgumentException("Input cannot be null");
       }

       double sum = 0;
       
       String regexOfRealNumber = "[^\\d.]+";

       // Split the string by non-digit characters, allowing for decimal points
       String[] numbers = value.split(regexOfRealNumber);

       for (String number : numbers) {
           if (!number.isEmpty()) { // Check if the string is not empty
               sum += Double.parseDouble(number); 
           }
       }

       return sum;
   }

    
}
