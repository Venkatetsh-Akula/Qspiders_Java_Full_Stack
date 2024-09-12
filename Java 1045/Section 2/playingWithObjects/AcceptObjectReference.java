public class AcceptObjectReference {
    String title;
    String author;
    double price;
    public AcceptObjectReference(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public static void display(AcceptObjectReference o){
        System.out.println(o);
        System.out.println(o.title);
        System.out.println(o.author);
        System.out.println(o.price);
    }
    public static AcceptObjectReference factory(String title,String author,double price){
        AcceptObjectReference ref=new AcceptObjectReference(title,author,price);
        return ref;
    }
    public static void main(String[] args){
        AcceptObjectReference o=factory("HP","JKR",500);
        display(o);
    }

}
