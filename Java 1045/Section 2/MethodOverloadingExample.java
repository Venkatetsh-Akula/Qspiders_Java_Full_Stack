public class MethodOverloadingExample {
    public static void demo(int x){
        System.out.println(x);
    }
    public static void main(String[] args){
        demo('A');
        demo(1);
        byte b=25;
        demo(b);
    }
}
