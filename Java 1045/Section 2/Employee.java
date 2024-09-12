public class Employee {
    String name;
    int idno;
    double sal;
    public void update(String n,int i,double s){
        name=n;
        idno=i;
        sal=s;
    }
    public void display(){
        System.out.println("Employee name: "+name);
        System.out.println("Employe ID: "+idno);
        System.out.println("Employee sal: "+sal);
    }
    public static void main(String[] args){
        Employee e1=new Employee();
        e1.update("Venkatesh",107,30000);
        e1.display();
    }
}
