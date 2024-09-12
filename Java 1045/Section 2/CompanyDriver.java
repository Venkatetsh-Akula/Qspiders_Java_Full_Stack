public class CompanyDriver{
    public static void main(String[] args){
        ClassCompany C=new ClassCompany("IBM","Manyatha Tech park",3000,400000000);
        System.out.println(C.cname);
        System.out.println(C.E.ename);
        C.CompanyDisplay();
        C.E.EmployeeDisplay();
    }
}