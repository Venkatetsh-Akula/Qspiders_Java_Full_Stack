//Write a program frequency of the element in an arr

import java.util.HashMap;
import java.util.Arrays;
public class Frequency {
    public static void main(String[] args){
        int[] arr={3,6,1,6,7,1,6,4};
        int[] free=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            free[i]=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] != -1 && arr[j] != -1 && arr[i] == arr[j]){
                    free[i]++;
                    arr[j]=-1;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] != -1){
                System.out.println(arr[i]+" "+free[i]);
            }
        }
    //    HashMap<Integer,Integer> map=new HashMap<>();
    //    for(int i : arr){
    //     map.put(i, map.getOrDefault(i, 0)+1);
    //    }
    //    for(int i: map.keySet()){
    //     System.out.println(i+" "+map.values());
    //    }
        
    }
}
