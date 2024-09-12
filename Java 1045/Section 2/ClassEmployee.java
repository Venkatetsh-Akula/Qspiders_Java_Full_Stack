public class ClassEmployee {
    String ename;
    int id;
    double sal;
    String dept;
    public ClassEmployee(String ename,int id,double sal,String dept){
        this.ename=ename;
        this.id=id;
        this.sal=sal;
        this.dept=dept;
    }
    public void EmployeeDisplay(){
        System.out.println("The Employee details are");
        System.out.println("Employee nmae: "+ename);
        System.out.println("Employee ID: "+id);
        System.out.println("Employee sal: "+sal);
        System.out.println("Employee Department: "+dept);
    } 
}
