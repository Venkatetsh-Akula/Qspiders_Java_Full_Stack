public class ClassCompany {
    String cname;
    String Address;
    int noe;
    long valuation;
    ClassEmployee E=new ClassEmployee("Venkatesh", 101, 450000, "Development");
    public ClassCompany(String cname,String Address ,int noe,long valuation){
        this.cname=cname;
        this.Address=Address;
        this.noe=noe;
        this.valuation=valuation;
    }
    public void CompanyDisplay(){
        System.out.println("The company Details are");
        System.out.println("The Company name: "+cname);
        System.out.println("The Company Address: "+Address);
        System.out.println("Number of Employees: "+noe);
        System.out.println("Company valuation: "+valuation);
    }
}
