import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println(rand.nextInt(9000) + 1000);  
        }
    }
}
