public class defaultConstructor {
    int a;                           //Here complier implicitly create a constructor and load all the none static content
    int b=20;
    public static void main(String[] args){
        defaultConstructor d=new defaultConstructor();
        System.out.println(d.a);
        System.out.println(d.b);
    }
}
