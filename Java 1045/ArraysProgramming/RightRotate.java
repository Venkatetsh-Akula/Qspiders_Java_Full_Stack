import java.util.Arrays;
public class RightRotate {
    public static void RightShift(int[] arr){
        int temp=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
           arr[i+1]=arr[i];
        }
        arr[0]=temp;
    }
    public static void NShift(int[] arr,int n){
        while(n>0){
            for(int i=arr.length-2;i>=0;i--){
                int temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
            }
            n--;
        }
    }
    public static void main(String[] args){
        int[] arr={4,1,10,13,24,27,5};
        // RightShift(arr);
        NShift(arr,3);
        System.out.println(Arrays.toString(arr));
    }
}
