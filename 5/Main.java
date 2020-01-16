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

public class Main{
    public static void main(String[] args){
        System.out.println("メソッドをよびだします");
        hello("Aさん");
        hello("Bさん");
        hello("Cさん");
        System.out.println("メソッドの呼び出し終了");
    }
    public static void hello(String name){
        System.out.println(name + "さん、こんちわ");
    }
}