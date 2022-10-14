import java.util.Scanner;

public class prac3 {
    public static void main(String args[]) {
        // System.out.println("Hello");
        Scanner input = new Scanner(System.in);
        String sentence = "";
        int count = 0;
        while (!sentence.equals("quit")) {
            sentence = input.next();
            int size = sentence.length();

            if (sentence.equals("quit")) {
                for (int i = 0; i < size; i++) {
                    char ch = sentence.charAt(i);

                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                        count++;
                }
            }

        }

        System.out.println("The number of volwels in the sentence is " + count);
    }
}
