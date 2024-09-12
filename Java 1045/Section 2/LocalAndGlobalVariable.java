public class LocalAndGlobalVariable {
    static int b=20;      //global Variable
    public static void main(String[] args){
        int a=12;
        System.out.println(a);    //12     (Local Variable)
        System.out.println(b);    //20
        int res=a+b; 
        System.out.println(res);   //32
        add();
    }
    public static void add(){
        int c=10;                 // (local Variable)          
        int res=c+b;
        System.out.println(res);    //30
    }
}
