import java.util.Scanner;

public class BadInputRecieverAnother {
    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);
        System.out.print("数字を入力してください: ");

        String strNumber = stdin.nextLine();

        try {
            int intNumber = Integer.parseInt(strNumber);
            System.out.printf("入力された数字は %d です.", intNumber);

        } catch (NumberFormatException e) {
            System.out.println("数字以外の文字が入力されました.");
        }

        stdin.close();
    }
}
