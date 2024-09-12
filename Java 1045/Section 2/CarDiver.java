public class CarDiver {
    public static void main(String[] args){
        CarClass C=new CarClass("TATA","Havier", "Black", 1000000);
        System.out.println(C.ename);
        System.out.println(C.E.pow);
        C.CarDetails();
        C.E.EngineDetails();
        C.E.cool();
    }
}
