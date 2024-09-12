import java.util.Arrays;
public class ArrayTask1 {
    
    public static void main(String[] args){
        int[] arr1={1,2,3,4,5};
        int[] arr2={6,7,8,9,10,23,221};
        int[] arr=new int[arr1.length+arr2.length];
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(i<arr1.length){
                arr[i]=arr1[i];
            }
            else{
                arr[i]=arr2[k++];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
