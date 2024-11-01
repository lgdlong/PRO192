package interfaces;

import java.util.Map;

public interface I_FormatString {
    public String titleCase(String value);
    
    public void longestSubstring(String inputString);

    public String removeDuplicatedWords(String value);
    
    public String removeDuplicateChar(String str);

    public String reverseString(String value);

    public String toSnakeCase(String value);
    
    public int countOccurrences(String value, String substring); // Đếm số lần subtring xuất hiện

    public boolean isPasswordComplex(String input);
    
    // BacXuan100CoHa688 -> 100 688
    public String[] toNumberArray(String input);
    
    /**
     * Input: "hello world"
     * Output: Character: l
     *         Occurrences: 3
     * 
     * Using getKey(), getValue()
     * @param input
     * @return 
     */
    public Map.Entry<Character, Integer> findMostFrequentChar(String input);
    
    public String removeSubstring(String s, int l, int r);
}
