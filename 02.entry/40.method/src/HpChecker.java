import java.util.Random;

public class HpChecker {
    public static void main(String[] args) {

        Random rand = new Random();
        
        int hp = 0;
        boolean isDead = false;

        while (!isDead) {
            hp = rand.nextInt(10);

            isDead = isDead(hp);
            if (!isDead) {
                System.out.printf("HP => %d: 動いています. %n", hp);
            }
        }
        System.out.printf("HP => %d: 止まっています. %n", hp);
    }

    public static boolean isDead(int hp) {
        return hp == 0;
    }
}
