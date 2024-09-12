public class ReturnObjectReferenceBook{
    String title;
    String author;
    double price;
    public ReturnObjectReferenceBook(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public static ReturnObjectReferenceBook factory(String title,String author,double price){
        ReturnObjectReferenceBook b=new ReturnObjectReferenceBook(title,author,price); 
        return b;
    }
    public static void main(String[] args){
        ReturnObjectReferenceBook o=factory("HP","JKR",500);
        System.out.println(o);
        System.out.println("title: "+o.title);
        System.out.println("author: "+o.author);
        System.out.println("price: "+o.price);
    }
} 