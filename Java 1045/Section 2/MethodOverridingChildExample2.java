public class MethodOverridingChildExample2 extends MethodOverridingParentExample2 {
    @Override
    public void print(){
        System.out.println("Bye");
    }
    @Override
    public void demo(){
        System.out.println("Good night");
    }
    public static void main(String[] args){
        MethodOverridingChildExample2 g=new MethodOverridingChildExample2();
        g.print();
        g.demo();
    }
}
