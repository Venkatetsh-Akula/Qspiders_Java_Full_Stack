public class ConstructorOverloading {
    public ConstructorOverloading(){
        System.out.println("Zero Parametrized constructor");
    }
    public ConstructorOverloading(int a){
        System.out.println("Peramitrized constructor ConstructorOverloading(int a)");
    }
    public ConstructorOverloading(int a,int b){
        System.out.println("Peramitrized constructor ConstructorOverloading(int a,int b)");
    }
    public static void main(String[] args){
        ConstructorOverloading d1=new ConstructorOverloading();
        ConstructorOverloading d2=new ConstructorOverloading(10);
        ConstructorOverloading d3=new ConstructorOverloading(5,7);
    }
}
