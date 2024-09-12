import java.util.Arrays;
public class ArrayTask4 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int sel=2;
        for(int i=sel-1;i>=0;i--){
            int temp1=arr[i+1];
            arr[i+1]=arr[i];
            arr[i]=temp1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
