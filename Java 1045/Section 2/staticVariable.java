public class staticVariable {
    static int a;
    static int b=10;
    public void demo(){
        System.out.println(a);
        System.out.println(b);               //0
    } 
    public static void main(String[] args){
        System.out.println(a);                  //0
        staticVariable v=new staticVariable();
        v.demo();
        System.out.println(v.a);      
        System.out.println(b);        //0
    }
}
