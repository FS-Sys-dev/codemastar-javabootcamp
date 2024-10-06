import java.util.Random;

public class QuickFixTester {
    public static void main(String[] args) {

        Random rand = new Random();
        String myName = "山本一郎";
        boolean isPass = rand.nextBoolean();

        showMessage(myName, isPass);
    }

    private static void showMessage(String name, boolean isPass) {
        if (isPass) {
            System.out.printf("%s は合格.", name);
        } else {
            System.out.printf("%s は不合格.", name);
        }
    }
}
