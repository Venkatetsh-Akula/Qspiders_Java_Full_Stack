import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args){
        int[] arr={7,1,8,10,2};
        // int i=0,j=arr.length-1;
        // while(i <= j){
        //     int temp=arr[i];
        //     arr[i]=arr[j];                two point approch
        //     arr[j]=temp;
        //     i++;
        //     j--;
        // }
            int[] b=new int[arr.length];
            for(int i=b.length-1;i>=0;i--){
                b[arr.length-i-1]=arr[i];
            }
        System.out.println(Arrays.toString(b));
    }
}
