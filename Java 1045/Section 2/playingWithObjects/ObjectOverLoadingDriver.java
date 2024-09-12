public class ObjectOverLoadingDriver {
    public static void print(ObjectOverLoadingSample o){
        System.out.println(o.x);
        o.java();
    }
    public static void print(ObjectOverLoadingClassA o){
        System.out.println(o.y);
        o.sql();
    }
  public static void main(String[] args){
    ObjectOverLoadingSample o=new ObjectOverLoadingSample();
    ObjectOverLoadingClassA a=new ObjectOverLoadingClassA();
    ObjectOverLoadingClassB b=new ObjectOverLoadingClassB();
    print(o);
    print(a);// Because it prefer low preferecenc amoung which had43
    print(b);
  }  
}
