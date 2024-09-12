class Another{
    int a=10;
}
class ReferenceVariable {
    public static void main(String[] args){
        ReferenceVariable r=new ReferenceVariable();
        System.out.println(r);          //ReferenceVariable@15db9742
        ReferenceVariable r1=r; 
        System.out.println(r1);         //ReferenceVariable@15db9742
        System.out.println(r == r1);  //true

        ReferenceVariable r2=new ReferenceVariable();
        System.out.println(r2);        //ReferenceVariable@6d06d69c

        System.out.println(r == r2);   //false

        Another A=new Another();
        System.out.println(A);
        System.out.println(A.a);

    }
}
