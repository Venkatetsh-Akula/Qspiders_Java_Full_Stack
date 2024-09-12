import java.util.Arrays;
public class ArrayMethod {
    public static void m1(int[] a){
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args){
        int[] a={12,34,4,2134,45,2,32};
        m1(a);
    }
}
