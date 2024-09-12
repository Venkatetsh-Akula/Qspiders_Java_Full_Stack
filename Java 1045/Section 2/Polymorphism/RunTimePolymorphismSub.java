public class RunTimePolymorphismSub extends RunTimePolymorphismClassA {
    @Override
    public void demo(){
        System.out.println("I am in Overridden demo() method");
    }
    @Override
    public void test(){
        System.out.println("I am in Overridden test() method");
    }
    public static void main(String[] args){
        RunTimePolymorphismSub sub=new RunTimePolymorphismSub();
        RunTimePolymorphismClassA o=sub;
        o.demo();
        o.test();
    }
    
}
