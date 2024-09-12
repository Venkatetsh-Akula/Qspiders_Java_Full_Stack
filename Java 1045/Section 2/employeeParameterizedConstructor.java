public class employeeParameterizedConstructor {
    String fname;
    String lname;
    String idno;
    int age;
    double sal;
    public employeeParameterizedConstructor(String fname,String lname,String idno,int age,double sal){
        this.fname=fname;
        this.lname=lname;
        this.idno=idno;
        this.age=age;
        this.sal=sal;
    }
    String title;
    int price;
     public void Book(String t,int p){
        title=t;
        price=p;
    }
 public static void main(String[] args){
    employeeParameterizedConstructor e1=new employeeParameterizedConstructor("Akula","Venkatesh","AA0724",22,40000);
    System.out.println(e1.fname);
    System.out.println(e1.lname);
    System.out.println(e1.idno);
    System.out.println(e1.age);
    System.out.println(e1.sal);
    System.out.println("===================Second employee details=================");
    employeeParameterizedConstructor e2=new employeeParameterizedConstructor("Niteesh","kumar","NK0124",23,40000);
    System.out.println(e2.fname);
    System.out.println(e2.lname);
    System.out.println(e2.idno);
    System.out.println(e2.age);
    System.out.println(e2.sal);

    e1.Book("harry Porter",800);

 }   
}
