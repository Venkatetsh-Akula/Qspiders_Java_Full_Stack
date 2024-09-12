import java.util.Arrays;
public class FindDuplicate {
    public static void main(String[] args){
        int[] arr={3,6,1,6,7,1,6,4};
        int[] frq=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            frq[i]=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j] && arr[i] != -1 && arr[j] !=-1){
                    frq[i]++;
                    arr[j]=-1;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(frq));
        for(int i=0;i<arr.length;i++){
            if(frq[i] > 1){
                System.out.println(arr[i]);
            }
        }
    }
}
