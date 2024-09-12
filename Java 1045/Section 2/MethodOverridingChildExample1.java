public class MethodOverridingChildExample1 extends MethodOverridingParentExample1 {
    public MethodOverridingChildExample1(){
        super("super call statement");
    }
    @Override
    public void demo(){
        for(int i=10;i>6;i--){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        MethodOverridingChildExample1 m=new MethodOverridingChildExample1();
        System.out.println(m.a);
        m.demo();
    }
}
