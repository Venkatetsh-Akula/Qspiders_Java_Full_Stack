public class ConstructorChainingExample {
    String name;
    int age;
    String email;
    public ConstructorChainingExample(String name){
        this.name=name;
    }
    public ConstructorChainingExample(String name,int age){
        this(name);
        this.age=age;
    }
    public ConstructorChainingExample(String name,int age,String email){
        this(name,age);
        this.email=email;
    }
    public static void main(String[] args){
        ConstructorChainingExample c=new ConstructorChainingExample("venkatesh",22,"venkateshakula159@gmail.com");
        System.out.println(c.name);
        System.out.println(c.age);
        System.out.println(c.email);
    }
}
