public class nonStaticVariable {
    String title;
    String author;
    double price;
    public static void main(String[] args){
        nonStaticVariable b1=new nonStaticVariable();
        System.out.println("================Before b1 Intilization====================");
        System.out.println(b1.title);
        System.out.println(b1.author);
        System.out.println(b1.price);
        b1.title="Harry Potter";
        b1.author="J K Rowling";
        b1.price=800;
        System.out.println("==================After b1 Intilization=================");
        System.out.println(b1.title);
        System.out.println(b1.author);
        System.out.println(b1.price);


        // Second BooK
        nonStaticVariable b2=new nonStaticVariable();
        System.out.println("================Before b2 Intilization====================");
        System.out.println(b2.title);
        System.out.println(b2.author);
        System.out.println(b2.price);
        b2.title="Wings of Fire";
        b2.author="DR.B.R.Abdual Kalam";
        b2.price=350;
        System.out.println("==================After b2 Intilization=================");
        System.out.println(b2.title);
        System.out.println(b2.author);
        System.out.println(b2.price);

        //Thrid Book

        nonStaticVariable b3=new nonStaticVariable();
        System.out.println("================Before b3 Intilization====================");
        System.out.println(b3.title);
        System.out.println(b3.author);
        System.out.println(b3.price);
        b3.title="Java";
        b3.author="James Gosling";
        b3.price=150;
        System.out.println("==================After b3 Intilization=================");
        System.out.println(b3.title);
        System.out.println(b3.author);
        System.out.println(b3.price);


    }
}
