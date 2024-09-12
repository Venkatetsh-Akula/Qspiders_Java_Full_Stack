public class ComplieTimePolymorphism{
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(double a,int b){
        System.out.println(a+b);
    }
    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public void add(double a,int b,double c,int d){
        System.out.println(a+b+c+d);
    }
    public static void main(String[] args){
        ComplieTimePolymorphism o=new ComplieTimePolymorphism();
        o.add(2,5);
        o.add(2.2,5);
        o.add(54,12,9);
        o.add(34.23,77,23,7);
        o.add('a','b');
    }
}