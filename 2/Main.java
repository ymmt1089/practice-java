public class Main{
    public static void main(final String[] args) {
        int a;
        int b;
        a = 20;
        b = a + 5;

        System.out.println(a);
        System.out.println(b);

        float f = 3;
        double d = f;
        System.out.println(f);
        System.out.println(d);
        // データ型自動変換で小さい型から大きい型に代入できる

        double dd = 8.5 / 2;
        long l = 5 + 2L;
        System.out.println(dd);
        System.out.println(l);
        // 異なる型でも自動変換で計算してくれる

        String name = "菅原";
        String message;
        message = name + "さん、今日わ。";
        System.out.println(message);
        System.out.println(name + "ちわ");

        int aa = 5;
        int bb = 3;
        int m = Math.max(aa,bb);
        System.out.println(m);
        // Math.maxで大きい方を選択

        String age = "31";
        int n = Integer.parseInt(age);
        System.out.println(n+1);
        // Integerで数値（整数）に変換

        int r = new java.util.Random().nextInt(90);
        System.out.println(r);
        // ランダムな数値の生成。90は上限値（０以上９０未満）。

        System.out.println("あなたの名前を入力してください");
        String name1 = new java.util.Scanner(System.in).nextLine(); //キーボードから１行の文字列入力
        System.out.println("あなたの年齢を入力してください");
        int age1 = new java.util.Scanner(System.in).nextInt(); //キーボードから１つの整数を受け取る
        System.out.println("ようこそ" + age1 + "さいの" + name1 + "さん");
        // キーボードから入力を受ける命令


    }
}