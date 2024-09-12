public class EmpolyeeStaticVariable {
    String ename;
    int id;
    double sal;
    static String company="IBM";
    public EmpolyeeStaticVariable(String ename,int id,double sal){
        this.ename=ename;
        this.id=id;
        this.sal=sal;
    }
    public void display(){
        System.out.println("employee details");
        System.out.println("employee name: "+ename);
        System.out.println("id: "+id);
        System.out.println("salary: "+sal);
        System.out.println("company name: "+company);
    }
    public static void main(String[] args){
        EmpolyeeStaticVariable e1=new EmpolyeeStaticVariable("Venkatesh",101,30000);
        e1.display();
        EmpolyeeStaticVariable e2=new EmpolyeeStaticVariable("Nitheesh",102,40000);
        e2.display();
        EmpolyeeStaticVariable e3=new EmpolyeeStaticVariable("sudheer",103,50000);
        e3.display();
    }

}
