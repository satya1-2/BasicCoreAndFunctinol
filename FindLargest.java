package basicCoreAndFunctional;

public class FindLargest {
    public static void main(String[] args) {
        int array[] = {12, 13, 15};
        int Largest = 0;

        for (int element : array) {
            if (element > Largest) {
                Largest = element;
            }
        }
        System.out.println(Largest);
    }
}
