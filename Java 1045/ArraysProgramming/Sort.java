import java.util.Arrays;
public class Sort{
    public static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void Bubble(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1] > arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void Inserction(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int lastindex=arr.length-i-1;
            int maxindex=maximum(arr,lastindex);
            swap(arr,lastindex,maxindex);
        }
    }
    public static int maximum(int[] arr,int lastindex){
        int maxi=0;
        for(int i=0;i<=lastindex;i++){
            if(arr[maxi] < arr[i]){
                maxi=i;
            }
        }
        return maxi;
    }
    public static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void Cycle(int[] nums){
        for(int i=0;i<nums.length;i++){
            
        }
    }
    public static void main(String[] args){
        int[] arr={23,56,2,1,7,9,23,45};
        // sort(arr);
        // System.out.println(Arrays.toString(arr));
        // Bubble(arr);
        // System.out.println(Arrays.toString(arr));
        // selection(arr);
        // System.out.println(Arrays.toString(arr));
        // Inserction(arr);
        // System.out.println(Arrays.toString(arr));
        int[] nums={1,6,5,3,2,4};
        Cycle(nums);
        System.out.println(Arrays.toString(nums));
        
    }
}