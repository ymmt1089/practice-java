public class Main{
    public static void main (String[] args){
        System.out.println("あなたの運勢を占います");
        int fortune = new java.util.Random().nextInt(4) + 1;
        if (fortune == 1){
            System.out.println("大吉");
        } else if (fortune == 2){
            System.out.println("中吉");
        } else if (fortune == 3){
            System.out.println("吉");
        } else {
            System.out.println("凶");
        }
        // 冗長的なコードになっている

        System.out.println("ここからswitch");
        int fortune1 = 1;
        switch (fortune1) {
            case 1:
                System.out.println("大吉");
                break;
            case 2:
                System.out.println("中吉");
                break;
            case 3:
                System.out.println("吉");
                break;
            default:
                System.out.println("凶");
        }
        // こういう書き方もある。左辺と右辺が一致するか比較する式ならSwitchに置き換えられる

        for (int i = 0; i < 3; i++){
            System.out.print("現在" + (i + 1) + "周目→");
        }
        //for文例

        
    }
}
