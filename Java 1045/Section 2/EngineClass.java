public class EngineClass {
    String eid;
    int evol;
    int noc;
    double pow;
    public static void cool(){
        System.out.println("cooling..................");
    }
    public void EngineDetails(){
        System.out.println("The car Engine Details are:");
        System.out.println("The Engine ID: "+eid);
        System.out.println("The Engine Volume: "+evol);
        System.out.println("The Engine No of Cylinders: "+noc);
        System.out.println("The Engine Power is: "+pow);
    }
    public EngineClass(String eid,int evol,int noc,double pow){
        this.eid=eid;
        this.evol=evol;
        this.noc=noc;
        this.pow=pow;
    }
}
