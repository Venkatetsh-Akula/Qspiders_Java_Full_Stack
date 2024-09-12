public class UpCastingClassAChild extends UpCastingClassAParent {
    int b=87;
    public void web(){
        System.out.println("i am in web() method");
    }
    public static void main(String[] args){
        UpCastingClassAChild c=new UpCastingClassAChild();
        System.out.println("Propertys of super class and sub class");
        System.out.println(c.a);
        System.out.println(c.b);
        c.java();
        c.web();
        UpCastingClassAParent n=c;
        System.out.println(n.a);
        n.java();
        // System.out.println(n.b);  CTE
        // With UpCasting we cant access the propertys of sub class we can only access super class Propertys
        // n.web();     CTE                     
        
    }
}