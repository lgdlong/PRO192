public class MyUtilities implements IUtilities{

    @Override
    public int sumNumber(int number) {
        int n = number / 2;
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        
        return sum;
    }

    @Override
    public String replaceString(String sentence, String s1, String s2) {
        String[] newSentence = sentence.split("\\s+");
        StringBuilder str = new StringBuilder();
        
        for (String word : newSentence) {
            if (word.equalsIgnoreCase(s1)) {
                word = s1;
            }
            str.append(word).append(" ");
        }
        
        String res = str.toString().trim();
        
        return res.replace(s1, s2);
    }
    
}
