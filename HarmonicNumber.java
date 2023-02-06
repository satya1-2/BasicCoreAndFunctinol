package basicCoreAndFunctional;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//taking user input
        System.out.print("Enter Number: ");
        int number = scanner.nextInt();// // storing input value in num
        double result = 0.0;
        System.out.println("The harmonic series is: ");
        /* printing the harmonic series till num value
          using for loop*/
        for (int i = number; i > 0; i--) {

            // calculating harmonic values
            result = result + (double) 1 / i;

            System.out.print(result + ", ");
        }
    }
}

