public class test {
    public static String titleCaseString(String name) {
        String[] nameArray = name.split("\\s+"); // Chuyen chuoi thanh tung word dua vao array
        StringBuilder titleCase = new StringBuilder();
        
        for (String word : nameArray) {
            if (!word.isBlank()) {
                titleCase
                .append(Character.toUpperCase(word.charAt(0))) // Viet hoa chu dau
                .append(word.substring(1).toLowerCase()) // Viet thuong chuoi con lai
                .append(" ");
            }
        }
        
        return titleCase.toString().trim(); // Xoa khoang trang con du
    }
    public static void main(String[] args) {
        String name = "phung luu Hoang LONG";
        System.out.println(titleCaseString(name));
    }
    
}
