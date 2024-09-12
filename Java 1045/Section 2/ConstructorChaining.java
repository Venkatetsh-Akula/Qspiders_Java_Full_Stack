public class ConstructorChaining {
    public ConstructorChaining(){
        System.out.println("zero permeterzied constructor");
    }
    public ConstructorChaining(int a){
        this();
        System.out.println("Permeterzied constructor ConstructorChaining(int a)");
    }
    public ConstructorChaining(int a,int b){
        this(2);
        System.out.println("Permeterzied Constructor ConstructorChaining(int a,int b)");
    }
    public static void main(String[] args){
        ConstructorChaining c=new ConstructorChaining(4,6);
    }
}
