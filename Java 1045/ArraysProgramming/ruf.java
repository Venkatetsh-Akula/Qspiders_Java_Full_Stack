public class ruf{
    public static void main(String[] args){
        try{
            System.out.println(2/0);
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("hiiiiiii");
        }
    }
}