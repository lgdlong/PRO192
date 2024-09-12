import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence, str, temp;
        System.out.print("Enter sentence: ");
        sentence = sc.nextLine();
        temp = sentence.toLowerCase();  // Create a lower case copy form sentence
        System.out.print("Enter string need to find: ");
        str = sc.nextLine();

        String[] words = temp.split("\\s+");

        int count = 0;
        for (String word : words) {
            if (word.contains(str)) {
                count++;
            }
        }

        System.out.print(count);

    }
}

/*
* Enter a sentence
* Enter a string
*
* Find how many strings in that sentence
*
* */
