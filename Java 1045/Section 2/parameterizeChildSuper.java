public class parameterizeChildSuper extends parameterizeParentSuper{
    int b=345;
    public parameterizeChildSuper(String a){
        super(a);
        System.out.println("i am in parameterized super call child class");
    }
    public void web(){
        System.out.println("I am in web technology");
    }
    public static void main(String[] args){
        parameterizeChildSuper r=new parameterizeChildSuper("parametrize super call parent");
        System.out.println(r.a);
        System.out.println(r.b);
        r.java();
        r.web();
        r.demo();
    }
}
