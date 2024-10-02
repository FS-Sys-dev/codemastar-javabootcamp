import java.util.Random;

public class PassChecker {
    public static void main(String[] args) {

        Random rand = new Random();
        String myName = "山本一郎";
        boolean isPass = rand.nextBoolean();

        if (isPass) {
            System.out.printf("%s は合格したよ.", myName);
        } else {
            System.out.printf("%s は不合格だったよ.", myName);
        }
    }
}
