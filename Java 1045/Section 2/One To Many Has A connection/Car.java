public class Car {
    String cname;
    String model;
    double price;
    public Car(String cname,String model,double price){
        this.cname=cname;
        this.model=model;
        this.price=price;
    }
    CarTyre[] T={new CarTyre("MRF", 500),new CarTyre("CEAT",700),
                    new CarTyre("Apollo", 600),new CarTyre("JK",800 )};
    public void CarDisplay(){
        System.out.println("The car details are");
        System.out.println("Car Name: "+cname);
        System.out.println("Car Model: "+model);
        System.out.println("Car Price: "+price);
        int c=1;
        for(int i=0;i<T.length;i++){
            System.out.println("Tyre"+c+" brand:"+T[i].brand+"  "+"Price: "+T[i].price);
        }
    }
}
