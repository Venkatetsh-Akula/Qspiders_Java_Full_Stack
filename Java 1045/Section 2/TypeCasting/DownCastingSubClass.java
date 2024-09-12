public class DownCastingSubClass extends DownCastingClassAParent{
    public void sub(){
        System.out.println("i am in the sub() method");
    }
    public static void main(String[] args){
        DownCastingSubClass x=new DownCastingSubClass();
        System.out.println("Object creation propertys");
        System.out.println(x.n);
        x.check();
        x.sub();
        System.out.println("UpCasting propertys");
        DownCastingClassAParent y=x;
        System.out.println(y.n);
        y.check();
        // y.sub();  CTE can't access super class Propertys
        System.out.println("DownCasting propertys");
        DownCastingSubClass x1=(DownCastingSubClass)y;
        System.out.println(x1.n);
        x1.check();
        x1.sub();
    }
}
