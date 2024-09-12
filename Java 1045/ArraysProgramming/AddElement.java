import java.util.Arrays;
public class AddElement {
    public static void main(String[] args){
        int[] arr={5,7,2,9};
        int[] arr1=new int[arr.length+1];
        int index=1,value=10;
       
        for(int i=0;i< arr1.length;i++){
           if(i < index){
            arr1[i]=arr[i];
           }
           else if(i == index){
            arr1[i]=value;
           }
           else if(i>index && i != index){
                arr1[i]=arr[i-1];
           }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
