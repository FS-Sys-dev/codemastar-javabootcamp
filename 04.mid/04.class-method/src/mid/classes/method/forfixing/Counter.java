package mid.classes.method.forfixing;

public class Counter {
    private static int count;

    static {
        count = 0;
    }

    public Counter() {

        // インスタンス生成時に count をインクリメント
        ++count;

        System.out.printf(
                "Counter インスタンスが生成されました: count=%d %n",
                count
            );
    }

    public static void showCounter() {
        // static 変数は this を使わずにアクセス
        System.out.printf("counter=%d %n", count);
    }
}
