public class interfaceImplementsChild1 implements interfaceImplementsParent1 {
    @Override
    public void demo(){
        System.out.println("I am in demo() method");
    }
    @Override
    public void check(){
        System.out.println("I am in check() method");
    }
    public static void main(String[] args){
        interfaceImplementsChild1 c=new interfaceImplementsChild1();
        c.demo();
        c.check();
    }
}
