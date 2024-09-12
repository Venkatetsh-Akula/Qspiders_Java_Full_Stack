public class AssingmentSuperSubDriver {
    public static AssignmentClassSample factory(int r){
        if(r == 1){
            return new AssignmentClassA();
        }
        else if(r == 2){
            return new AssignmentClassB();
        }
        else{
                return new AssignmentClassSample();
        }
    }
    public static void print(AssignmentClassSample s){
        if(s instanceof AssignmentClassA){
            System.out.println("i am in class A block");
            AssignmentClassA m=(AssignmentClassA)s;
            m.web();
        }
        else if(s instanceof AssignmentClassB){
            System.out.println("i am in class B block");
            AssignmentClassB n=(AssignmentClassB)s;
            n.sql();
        }
        else if(s instanceof AssignmentClassSample){
            System.out.println("i am in sample class");
            s.java();
        }
    }
    public static void print(AssignmentClassA x){
        System.out.println("i am overloading class of AssignmentClassA");
    }
    public static void main(String[] args){
        AssignmentClassSample ref=factory(1);
        ref=factory(1);
        ref=factory(2);
        if(ref instanceof AssignmentClassA){
            AssignmentClassA y=(AssignmentClassA)ref;
            y.web();
            y.java();
            print(y);
        }
        else if(ref instanceof AssignmentClassB){
            AssignmentClassB z=(AssignmentClassB)ref;
            print(z);
        }
        else if(ref instanceof AssignmentClassSample){
            AssignmentClassSample x=(AssignmentClassSample) ref;
            print(x);
        }
    }
}
