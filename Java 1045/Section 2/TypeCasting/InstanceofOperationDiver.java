public class InstanceofOperationDiver {
    public static void main(String[] args){
        InstanceofOperationClassA a=new InstanceofOperationClassA();
        System.out.println(a instanceof InstanceofOperationClassA);
        System.out.println(a instanceof InstanceofOperationSubClassB );
        System.out.println(a instanceof InstanceofOperationSubClassC);
        InstanceofOperationSubClassB b=new InstanceofOperationSubClassB();
        System.out.println(b instanceof InstanceofOperationClassA);
        System.out.println(b instanceof InstanceofOperationSubClassB );
        // System.out.println(b instanceof InstanceofOperationSubClassC);  CTE:because instanceof work only when we has relation between two objects
        InstanceofOperationSubClassC c=new InstanceofOperationSubClassC();
        System.out.println(c instanceof InstanceofOperationClassA);
        // System.out.println(c instanceof InstanceofOperationSubClassB );
        System.out.println(c instanceof InstanceofOperationSubClassC);
    }    
}
