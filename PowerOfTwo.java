package basicCoreAndFunctional;

public class PowerOfTwo {
    public static void main(String[] args) {


        // INITIALIZATION
        int number, multiple = 1;

        // DATA INPUT THROUGH COMMAND LINE
        number = Integer.parseInt(args[0]);

        // CONDITION CHECK
        if (number > 31) {
            System.out.println("value of number should be less than 31");
            return;
        }

        // COMPUTATION
        else {
            System.out.println(multiple);
        }
        for (int j = 1; j <= number; j++) {
            multiple = multiple * 2;
            System.out.println(multiple);
        }
    }

}




