public class AmazonDriver {
    public static void main(String[] args){
        AmazonFashionMen men=new AmazonFashionMen();
        AmazonFashionKids kid=new AmazonFashionKids();
        AmazonFashionWomen women=new AmazonFashionWomen();
        AmazonMobiles mobile=new AmazonMobiles();
        AmazonHomeApplications home=new AmazonHomeApplications();
        AmazonVegetable vegetable=new AmazonVegetable();
        AmazonFruits fruit =new AmazonFruits();
        AmazonSpieces spiece =new AmazonSpieces();
        //Mens shopping
        System.out.println(men.MWear);
        System.out.println(men.Mage);
        System.out.println(men.Mprice);
        System.out.println(men.address);
        men.fashion();
        men.Mens();
        //Kids
        System.out.println(kid.Kage);
        System.out.println(kid.ksize);
        System.out.println(kid.model);
        kid.Kids();
        //womens
        System.out.println(women.Wsize);
        System.out.println(women.Wprice);
        women.Womens();
        //electronics
        mobile.Electronics();
        //mobiles
        System.out.println(mobile.category);
        System.out.println(mobile.Mgadget);
        mobile.Mcall();
        mobile.Mobile();
        //home applications
        home.Electronics();
        System.out.println(home.Tcomapany);
        System.out.println(home.price);
        home.Tscreen();
        //vegetable
        vegetable.Grocerics();
        System.out.println(vegetable.Vname1);
        System.out.println(vegetable.Vname3);
        vegetable.Vegetable();
        //fruits
        fruit.Fruits();
        System.out.println(fruit.fname1);
        System.out.println(fruit.fname2);
        //spices
        spiece.Spieces();
        System.out.println(spiece.splice1);
        System.out.println(spiece.splice2);

    }   
}
