public class SubSuperDriver {
    public static SubSuperSample factory(int i){
        if(i == 0){
            SubSuperClassA a=new SubSuperClassA();
            return a;
        }
        else if(i == 1){
            SubSuperClassB b=new SubSuperClassB();
            return b;
        }
        else{
            SubSuperSample s=new SubSuperSample();
            return s;
        }
    }
    public static void main(String[] args){
        SubSuperSample o=factory(0);
        if(o instanceof SubSuperClassA){
            SubSuperClassA a=(SubSuperClassA)o;
            System.out.println(a.x);
            a.demo();
        }
        else if(o instanceof SubSuperClassB){
            SubSuperClassB b=(SubSuperClassB)o;
            System.out.println(b.y);
            b.test();
        }
        else{
            SubSuperSample s=o;
            System.out.println(o.z);
            o.check();
        }
    }
}
