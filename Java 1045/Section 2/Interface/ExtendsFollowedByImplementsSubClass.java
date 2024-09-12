// public class ExtendsFollowedByImplementsSubClass implements ExtendsFollowedByImplementsClassA extends ExtendsFollowedByImplementsClassB{
       
             //CTE because after the extends of class then only we can implement
    
// }


public class ExtendsFollowedByImplementsSubClass extends ExtendsFollowedByImplementsClassB implements ExtendsFollowedByImplementsClassA{
   @Override
   public void demo(){
    System.out.println("I am in demo() method");
   }
   public static void main(String[] args){
    ExtendsFollowedByImplementsSubClass c=new ExtendsFollowedByImplementsSubClass();
    c.demo();
    c.check();
   }
}
