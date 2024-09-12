public class AmazonSpecializedCustomer extends AmazonGenerilized {
    @Override
    public void login(){
        System.out.println("Customer login successfull");
    }
    @Override
    public void logout(){
        System.out.println("Customer logout successfull");
    }
    public void buyProduct(){
        System.out.println("product ordered successfully");
    }
    public void cancelProduct(){
        System.out.println("product canclled successfully");
    }
}
