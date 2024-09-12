public class MultiObjectSingleFormalArgsDriver {
    public static void display(MultiObjectSingleFormalArgsClassSample o){
        if(o instanceof MultiObjectSingleFormalArgsClassA){
            System.out.println("i am having class A object Reference");
        }
        else if(o instanceof MultiObjectSingleFormalArgsClassB){
            System.out.println("I am having class B object reference");
        }
        else if(o instanceof MultiObjectSingleFormalArgsClassSample){
            System.out.println("I am in smaple class bject Reference");
        }
    }
    public static void main(String[] args){
        MultiObjectSingleFormalArgsClassSample s=new MultiObjectSingleFormalArgsClassSample();
        display(s);
        MultiObjectSingleFormalArgsClassA a=new MultiObjectSingleFormalArgsClassA();
        display(a);
        MultiObjectSingleFormalArgsClassB b=new MultiObjectSingleFormalArgsClassB();
        display(b);
    }
}
