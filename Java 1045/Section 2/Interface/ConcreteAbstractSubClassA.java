public class ConcreteAbstractSubClassA extends ConcreteAbstractClassA {
    @Override
    public void demo(){
        System.out.println("I am in demo() method");
    }
    @Override
    public void check(){
        System.out.println("I am in check() method");
    }
    public static void main(String[] args){
        ConcreteAbstractSubClassA c=new ConcreteAbstractSubClassA();
        c.demo();
        c.check();
    }
}
