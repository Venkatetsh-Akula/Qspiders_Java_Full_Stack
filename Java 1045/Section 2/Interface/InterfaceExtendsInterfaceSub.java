public class InterfaceExtendsInterfaceSub implements InterfaceExtendsInterfaceClassA,InterfaceExtendsInterfaceClassB {
    @Override
    public void task(){
        System.out.println("I am in task() Method");
    }
    public void demo(){
        System.out.println("I am in demo() Method");
    }
    public static void main(String[] args){
        InterfaceExtendsInterfaceSub c=new InterfaceExtendsInterfaceSub();
        c.task();
        c.demo();
    }
}
