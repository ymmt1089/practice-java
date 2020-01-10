public class Main {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[5];
        scores[1] = 30;
        System.out.println(scores.length);
        System.out.println(scores[0]);

        int[] scores1 = new int[] {1,2,3,4,5};
        System.out.println(scores1[3]);


        int[] scores2 = {20,30,40,50,80};
        for (int i = 0; i < scores.length; i++){
            System.out.println(scores2[i]);
        }
        //配列の中身を全部見る

        int[] scores3 = {20,30,40,50,80};
        int sum = 0;
        for (int i = 0; i < scores.length; i++){
            sum += scores3[i];
        }
        int avg = sum/scores3.length;
        System.out.println(sum);
        System.out.println(avg);



        int[] seq = new int[10];
        for (int i = 0; i < seq.length; i++){
            seq[i] = new java.util.Random().nextInt(4);
        }
        for (int i = 0; i < seq.length; i++){
            char[] base = {'A','T','G','C'};
            System.out.print(base[seq[i]]);
        }
        //ランダムでATGCを出力。base[seq[i]]の理解



        int[] scores4 = {11,22,33,44,55};
        for (int i = 0; i < scores4.length; i++){
            System.out.println(scores4[i]);
        }
        //従来のfor文の書き方
        for (int value : scores4){
            System.out.println(value);
        }
        //拡張for文ではこれだけでいい

        int[][] scores5 = {{40,50,60},{80,60,70}};
        System.out.println(scores5.length);
        System.out.println(scores5[0].length);
        //二次元配列
    }
}