package basicCoreAndFunctional;
import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
       int row,coloum,i,j;
int [][]arr=new int[5][5];

        Scanner scanner = new Scanner(System.in);

        // enter row and column for array.
        System.out.print("Enter row for the array (max 5) : ");
        row = scanner.nextInt();
        System.out.print("Enter column for the array (max 5) : ");
        coloum = scanner.nextInt();

        // enter array elements.
        System.out.println("Enter " + (row * coloum) + " Array Elements : ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < coloum; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        // the 2D array is here.
        System.out.print("The Array is :\n");
        for (i = 0; i < row; i++) {
            for (j = 0; j < coloum; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

