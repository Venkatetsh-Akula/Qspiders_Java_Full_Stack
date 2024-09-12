public class CarClass {
    String ename;
    String model;
    String color;
    double price;
    EngineClass E=new EngineClass("A23",1500,6,23.6);
    public CarClass(String ename,String model,String color,double price){
        this.ename=ename;
        this.model=model;
        this.color=color;
        this.price=price;
    }
    public void CarDetails(){
        System.out.println("The Car Details are:");
        System.out.println("The car Company: "+ename);
        System.out.println("The car model: "+model);
        System.out.println("The car color: "+color);
        System.out.println("The car price: "+price);
    }
}

