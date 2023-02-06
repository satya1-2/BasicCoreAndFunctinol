package basicCoreAndFunctional;
import java.util.Scanner;

public class AlphabetVowelConstant {
    public static void main(String[] args) {
        System.out.println("enter a Alphabet : ");
        Scanner scanner=new Scanner(System.in);
        char character =scanner.next().charAt(0);
        if (character == 'a' || character == 'e' || character == 'i' || character == 'O' || character == 'u') {
            System.out.println("its vowel");
        } else {
            System.out.println("its constant");
        }
    }
}