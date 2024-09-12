//Remove duplicates in array
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;
public class Duplicate {
    public static void main(String[] args){
        int count=0;
        int[] arr={3,6,1,6,7,1,6,4};
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i] != -1 && arr[j] != -1 && arr[i] == arr[j]){
        //             arr[j]=-1;
        //             count++;
        //         }
        //     }
        // }
        // int[] nums=new int[arr.length-count];
        // int k=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i] != -1){
        //         nums[k++]=arr[i];
        //     }
        // }
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(nums));
        //HashSet
        HashSet<Integer> s=new HashSet<>();
        for(int i : arr){
            s.add(i);
        }
        System.out.println(s);
    }
}
