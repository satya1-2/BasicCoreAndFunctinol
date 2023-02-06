package basicCoreAndFunctional;

public class FlipCoin {
    public static void main(String[] args) {
        System.out.println("flip the coin");

        double random = Math.random();
        String coin = "";
        if (random < 0.5) {
            coin = "head";
        } else {
            coin = "tail";
        }
        System.out.println(coin);
    }
}
