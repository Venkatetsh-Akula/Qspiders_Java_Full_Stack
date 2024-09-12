public class CarDriver {
    public static void main(String[] args){
        Car C=new Car("TATA","Heavier",1000000);
        C.CarDisplay();
        System.out.println(C.model);
        System.out.println(C.T[2].brand+" "+C.T[2].price);
    }
}
