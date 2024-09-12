public class AmazonSpecializedAdmin extends AmazonGenerilized{
    @Override
    public void login(){
        System.out.println("Admin login Successfully");
    }
    @Override
    public void logout(){
        System.out.println("Admin logout Successfully");
    }
    public void addProduct(){
        System.out.println("Product added successfully");
    }
    public void removeProduct(){
        System.out.println("removed product Sucessfully");
    }
}
