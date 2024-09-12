public class AmazonSpecializedGenerilizedDriver {
    public static void main(String[] args){
        AmazonSpecializedCustomer c=new AmazonSpecializedCustomer();
        AmazonSpecializedAdmin a=new AmazonSpecializedAdmin();
        System.out.println("============customer details=================");
        c.login();
        c.buyProduct();
        c.cancelProduct();
        c.logout();
        System.out.println("===========Admin details===============");
        a.login();
        a.addProduct();
        a.removeProduct();
        a.logout();
    }
}
