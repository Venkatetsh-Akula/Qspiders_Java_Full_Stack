public class NonstaticBlock {
    {
        System.out.println("Static Block 1");
    }
    public NonstaticBlock(int a){
        System.out.println("Parametermize constructor");
        System.out.println(a);
    }
    {
        System.out.println("Static block 3");                   // sttaic block will excute at intilize of object before excuation of object
    }
    public static void main(String[] args){
        NonstaticBlock s=new NonstaticBlock(2);
    }
    {
        System.out.println("Static block 2");
    }
}
