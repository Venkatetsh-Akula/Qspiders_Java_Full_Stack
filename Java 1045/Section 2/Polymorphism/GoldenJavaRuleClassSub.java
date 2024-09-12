public class GoldenJavaRuleClassSub extends GoldenJavaRuleClassSuper{
    public void print(){
        System.out.println("Java");
    }
    public void demo(){
        System.out.println("i am in override demo() class of sub class");
    }
    public static void main(String[] args){
        GoldenJavaRuleClassSub sub=new GoldenJavaRuleClassSub();
        GoldenJavaRuleClassSuper cast=sub;
        cast.demo();                   //In java a upcasted reference we can access the overridden method
        GoldenJavaRuleClassSuper s=new GoldenJavaRuleClassSuper();
        s.demo();


    }
}
