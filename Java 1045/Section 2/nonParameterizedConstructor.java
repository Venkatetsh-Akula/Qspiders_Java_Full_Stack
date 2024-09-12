public class nonParameterizedConstructor {
    String name;
    public nonParameterizedConstructor(){
        System.out.println("I am in Non-Parameterized Constructuor");
        System.out.println(name);
    }
    public static void main(String[] args){
        nonParameterizedConstructor np=new nonParameterizedConstructor();
    }
}
