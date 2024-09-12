public class classCastException2ClassB extends classCastException2ClassA {
    public void college(){
        System.out.println("i am in college() method");
    }
    public static void main(String[] args){
        classCastException2ClassB y=new classCastException2ClassB();
        // classCastException2ClassA a=y;
        // classCastException2ClassB y1=(classCastException2ClassB)a;  CTE:without doing UpCasting we cant achive DownCasting 
        // y1.college();
    }
}
