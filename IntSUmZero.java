package basicCoreAndFunctional;

public class IntSUmZero {
    static void findTriplets(int[] arr, int number) {
        boolean found = false;
        for (int i = 0; i < number - 2; i++) {
            for (int j = i + 1; j < number - 1; j++) {
                for (int k = j + 1; k < number; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println(arr[i] + " "
                                + arr[j] + " "
                                + arr[k]);
                        found = true;
                    }
                }
            }
        }

        // If no triplet with 0 sum found in array
        if (found == false)
            System.out.println(" not exist ");
    }

    public static void main(String[] args) {
        int arr[] = {0, -1, 2, -3, 1};
        int number = arr.length;
        findTriplets(arr, number);
    }
}
