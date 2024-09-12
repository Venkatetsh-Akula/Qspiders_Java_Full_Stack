public class ThisKeyword {
    String username;
    String password;
    public ThisKeyword(String username,String password){      //Here username,password are the local variables (username,password pointing the local variable)
        this.username=username;
        this.password=password;                               //using this keyword we point the difference between local and global varaible 
        System.out.println(username);                         //(this.username),(this.password) are pointing the global variables
        System.out.println(password);
    }
    public static void main(String[] args){
        ThisKeyword tk=new ThisKeyword("venky@gmail.com","12345");
    }
}
