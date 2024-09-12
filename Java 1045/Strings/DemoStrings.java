import java.util.Arrays;
public class DemoStrings{
    public static void main(String[] args){
        String str="JAVA is a programming language";
        //length Method()
        System.out.println("Length of string "+str.length());
        //charAt() to access perticular string
        System.out.println("Character Index of String "+str.charAt(2));
        //String.tocharArrays()
        char[] CharArray=str.toCharArray();
        System.out.println("Array character "+Arrays.toString(CharArray));
        //split(regex)
        String[] res=str.split(" ");
        System.out.println("split method "+Arrays.toString(res));
    }
}