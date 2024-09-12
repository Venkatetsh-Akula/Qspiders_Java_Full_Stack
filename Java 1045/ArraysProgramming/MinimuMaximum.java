import java.util.Arrays;
public class MinimuMaximum {

    public static void main(String[] args){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int[] arr={7,1,8,10,2};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int diff=Math.abs(arr[i]-arr[j]);
                if(diff < min){
                    min=diff;
                }
                else if(diff > max){
                    max=diff;
                }
            }
        }
        System.out.println(min);
        System.out.println(max);

    }
}