public class StaticBlock {
    static {
        System.out.println("i am in static block 1");
    }
    static{
        int a=67;
        System.out.println(a);
    }
    int a;
    public StaticBlock(){
        System.out.println("i am in no parameterize constructor");
        System.out.println(a);
    }
    public static void main(String[] args){
        System.out.println("I am in main block");   
        StaticBlock sb=new StaticBlock();          

    }
    static {
        System.out.println("I am in static block 2");
    }
}

 //Before the excation of main method static block will excute first after main method