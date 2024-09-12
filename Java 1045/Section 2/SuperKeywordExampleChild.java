public class SuperKeywordExampleChild extends SuperKeywordExampleParent {
    int b=56;
    public SuperKeywordExampleChild(){
        System.out.println("i am in SuperKeywordExampleChild constructor room");
    }
    public void demo(){
        super.demo();
        System.out.println(super.a);
        System.out.println(b);
        System.out.println("Web");
    }
    public static void main(String[] args){
        SuperKeywordExampleChild c=new SuperKeywordExampleChild();
        c.demo();
    }
}
