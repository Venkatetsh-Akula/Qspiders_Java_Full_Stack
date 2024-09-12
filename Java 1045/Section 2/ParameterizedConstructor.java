public class ParameterizedConstructor {
    double salary;
    ParameterizedConstructor(String name,String gender,int age){
        System.out.println(name);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(salary);
    }
    public static void main(String[] args){
        ParameterizedConstructor pc=new ParameterizedConstructor("Venkatesh","male",22);
    }
}
