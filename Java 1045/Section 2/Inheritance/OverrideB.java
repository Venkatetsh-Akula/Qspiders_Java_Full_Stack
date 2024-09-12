public class OverrideB extends OverrideA {
    @Override
    public void print(){
        System.out.println("Bye");
    }
    @Override
    public void demo(){
        System.out.println("Good Night");
    }
    public static void main(String[] args){
        OverrideB b=new OverrideB();
        b.print();
        b.demo();
    }
}
