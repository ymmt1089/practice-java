// public class Main{
//     public static void main(String[] args){
//         System.out.println("メソッドを呼び出します");
//         hello();
//         System.out.println("メソッドの呼び出しが終わりました");
//     }
//     public static void hello(){
//         System.out.println("hello");
//     }
// }

// public class Main{
//     public static void methodA(){
//         System.out.println("methodA");
//         methodB();
//     }
//     public static void methodB(){
//         System.out.println("methodB");
//     }
//     public static void main(String[] args){
//         methodA();
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         System.out.println("メソッドをよびだします");
//         hello("Aさん");
//         hello("Bさん");
//         hello("Cさん");
//         System.out.println("メソッドの呼び出し終了");
//     }
//     public static void hello(String name){
//         System.out.println(name + "さん、こんちわ");
//     }
// }


// public class Main{
//     public static void main(String[] args){
//         add(100,20);
//         add(200,50);
//     }
//     public static void add(int x,int y){
//         int ans =x + y;
//         System.out.println(x+"+"+y+"="+ans);
//     }
// }


// public class Main{
//     public static int add(int x,int y){
//         int ans = x + y;
//         return ans;
//     }
//     public static void main(String[] args){
//         int ans = add(10,100);//addメソッドに和の機能を持たせているのでここだけで何をしているかわかる
//         System.out.println("100 + 10 = " + ans);
//     }
// }


// public class Main{
//     public static int add(int x,int y){
//         int ans = x + y;
//         return ans;
//     }
//     public static void main(String[] args){
//         System.out.println(add(add(10,20),add(30,40)));//add(30,70)と同意。戻り値をそのまま使いこともできる
//     }
// }




// ここからオーバーロード（メソッド名の多重定義）
// 仮引数（以下のaddの前につくintやdouble）が異なればOK
// public class Main{
//     // １つめadd
//     public static int add(int x,int y){
//         return x + y;
//     }
//     // ２つめadd
//     public static double add(double x,double y){
//         return x + y;
//     }
//     // ３つめadd
//     public static String add(String x, String y){
//         return x + y;
//     }
//     public static void main(String[] args){
//         System.out.println(add(10,20));
//         System.out.println(add(3.5,2.7));
//         System.out.println(add("Helo","World"));
//     }
// }



public class Main{
    public static int add(int x,int y){
        return x + y;
    }
    public static int add(int x,int y,int z){
        return x + y + z;
    }
    public static void main(String[] args){
        System.out.println(add(10,20));
    }
}
// こういう風に引数の数でも判断できる