public class B extends A {
    int c=98;
    public static void main(String[] args){
        B bref=new B();
        System.out.println(a);
        System.out.println(bref.b);                   //Only static variable,non-static variable,static method,non-static method are allowed in inheritance 
        StaticMethod();                               //Constructor,static block,non-static block are not allowed in inhertaince
        bref.NonStaticMethod();
        System.out.println(bref.c);
        A aref=new A();
        System.out.println(aref.a);
        //System.out.println(aref.c);  CTE because it aref belong to super class so aref can't able to access c
    }
}
