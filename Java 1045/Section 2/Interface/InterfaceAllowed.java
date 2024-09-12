
public interface InterfaceAllowed {
    //1
    int a=20; //In here my variable will consider the i as public final static variable

    //2
    //int b; CTE:Because a final variable must be intilized at time of declaration 

    //3
    // public void demo(){
    //     System.out.println("Hello");    CTE:where non static concrete method was not allowed in inteface
    // }

    //4
    public abstract void demo(); //  public abstract non static method are allowed in interface

    //5
    public static void check(){
        System.out.println("I am in check() method");  //public static concete method are allowed in interface
    }

    //6
    // {
                               //CTE non-static blocks are not allowed in interface
    // }

    //7
    // static {
                            //CTE static blocks are not allowed in interface
    // }
    
    //8
    // InterfaceAllowed();    //CTE constractor are not allowed in interface
}
