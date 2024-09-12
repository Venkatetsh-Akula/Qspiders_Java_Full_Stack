import java.util.Arrays;
import java.util.ArrayList;
public class IntersectionAndUnionArray {
    public static void main(String[] args){
        int[]  arr1={5,7,3,6,4};
        int[] arr2={1,3,5,2};
        int[] res=new int[arr1.length+arr2.length];
        ArrayList<Integer> union=new ArrayList<>();
        ArrayList<Integer> Intersection=new ArrayList<>();
        int i=0,j=0,k=0;
        while(i < arr1.length && j <arr2.length){
            if(arr1[i] < arr2[j]){
                res[k++]=arr1[i++];
            }
            else{
                res[k++]=arr2[j++];
            }
        }
        while(i < arr1.length){
            res[k++]=arr1[i++];
        }
        while(j < arr2.length){
            res[k++]=arr2[j++];
        }
        Arrays.sort(res);
        for(int m=0;m<res.length;m++){
            for(int n=m+1;n<res.length;n++){
                if(res[m] != -1 && res[n] != -1 && res[m] == res[n]){
                   union.add(res[m]);
                    res[n]=-1;
                }
            }

            if(res[m] != -1){
               Intersection.add(res[m]);
            }
        }
        System.out.println(union);
        System.out.println(Intersection);
        // System.out.println(Arrays.toString(res));
    }
}
