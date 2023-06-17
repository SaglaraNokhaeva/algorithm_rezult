import java.util.Random;

public class Main {
    private static final Random random = new Random();
    public static void main(String[] args) {

        final  Rb tree = new Rb();
        for (int i = 0; i < 5; i++) {
            tree.add(i);
        }
        tree.print();

    }
}