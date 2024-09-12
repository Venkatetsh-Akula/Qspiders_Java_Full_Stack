public class childSuper extends parentSuper {
    int b=55;
    public childSuper(){
        super();
        System.out.println("childSuper constructor");
    }
    public void test(){
        System.out.println("i am test in test() method");
    }
    public static void main(String[] args){
        childSuper ch=new childSuper();
        System.out.println(ch.a);
        System.out.println(ch.b);
        ch.demo();
        ch.test();
    }
}
