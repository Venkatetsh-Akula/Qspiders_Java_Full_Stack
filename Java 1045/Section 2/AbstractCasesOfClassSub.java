public class AbstractCasesOfClassSub extends AbstractCasesOfClassB {
    @Override
    public void check(){
        System.out.println("I am in check Method()");
    }
    public static void main(String[] args){
        AbstractCasesOfClassSub s=new AbstractCasesOfClassSub();
        s.test();
        s.check();
        s.java();
    }
}
