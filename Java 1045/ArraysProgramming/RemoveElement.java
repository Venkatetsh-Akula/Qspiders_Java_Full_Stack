import java.util.Arrays;
public class RemoveElement {
    public static void main(String[] args){
        int[] arr={1,2,3,45,6};
        int[] arrR=new int[arr.length-1];
        int index=1;
        for(int i=0;i<arr.length;i++){
            if(index> i){
                arrR[i]=arr[i];
            }
            else if(index < i){
                arrR[i-1]=arr[i];
            }
        }
        System.out.println(Arrays.toString(arrR));
    }
}
