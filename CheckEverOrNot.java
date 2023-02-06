package basicCoreAndFunctional;
import java.util.Scanner;


public class CheckEverOrNot {
    public static void main(String[] args) {
        System.out.println("enter a number : ");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();

        System.out.println("");
        if(number%2==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }

    }
}
