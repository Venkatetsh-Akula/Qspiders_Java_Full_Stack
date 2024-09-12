public class FunctionArguments{
    public static void addWithoutArguments(){
        int a=6;
        int b=9;
        System.out.println(a+b);
    }
    public static void addWithArguments(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args){
        addWithoutArguments();
        addWithoutArguments();
        addWithArguments(10,30);
        addWithArguments(44,55);
    }
}