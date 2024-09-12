//Write a program left rotate in an array
import java.util.Arrays;
public class LeftRotateArray {
    public static void leftROtate(int[] arr){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
    }
    public static void NShift(int[] arr,int n){
        while(n>0){
            for(int i=1;i<arr.length;i++){
                int temp=arr[i-1];
                arr[i-1]=arr[i];
                arr[i]=temp;
            }
            n--;
        }
    }
    public static void main(String[] args){
        int[] arr={4,1,10,13,24,27,5};
        // leftROtate(arr);
        // System.out.println(Arrays.toString(arr));
        NShift(arr,3);
        System.out.println(Arrays.toString(arr));
    }
}
