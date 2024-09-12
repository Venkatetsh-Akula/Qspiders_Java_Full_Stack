public class NonStaticMethod {
    int a=10;
    int b=30;
    public void display(){
        System.out.println(a+b);
    }
    public static void main(String[] args){
        NonStaticMethod d=new NonStaticMethod();
        d.display();
    }
}
