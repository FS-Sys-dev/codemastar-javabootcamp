public class BreakNest {
    public static void main(String[] args) {

        final int LIMIT = 20;

        for (int i = 1; i < 10; i++) {

            for (int j = 1; j < 10; j++) {
                int result = i * j;

                if (result > LIMIT) break;

                System.out.printf("%2dX%2d=%2d ", i, j, result);
            }
            System.out.println();
        }
    }
}
