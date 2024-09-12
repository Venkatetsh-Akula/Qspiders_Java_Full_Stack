import java.util.Arrays;
public class cloneArray {
    public static void main(String[] args){
        int[] a={12,3,5623,12,43,334};
        int[] b=a.clone();
        a[1]=30;
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(a));
    }
}
