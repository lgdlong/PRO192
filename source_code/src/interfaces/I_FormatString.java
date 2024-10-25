package interfaces;

public interface I_FormatString {
    public String titleCase(String value);

    public String removeDuplicatedWords(String value);

    public String reverseString(String value);

    public String toSnakeCase(String value);
    
    public int countOccurrences(String value, String substring); // Đếm số lần subtring xuất hiện

}

