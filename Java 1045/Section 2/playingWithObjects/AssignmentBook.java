public class AssignmentBook {
    String title;
        String author;
        double price;
        public AssignmentBook(String title,String author,double price){
            this.title=title;
            this.author=author;
            this.price=price;
        }
        public static AssignmentBook factory(String title,String author,double price){
            AssignmentBook b=new AssignmentBook(title,author,price); 
            return b;
        }
        public static void display(AssignmentBook o){
            System.out.println("============this are from print method=============");
            System.out.println(o);
            System.out.println("title: "+o.title);
            System.out.println("author: "+o.author);
            System.out.println("price: "+o.price);
        }
        public static void main(String[] args){
            AssignmentBook o=factory("HP","JKR",500);
            System.out.println(o);
            System.out.println("title: "+o.title);
            System.out.println("author: "+o.author);
            System.out.println("price: "+o.price);
            display(o);
        }
}
