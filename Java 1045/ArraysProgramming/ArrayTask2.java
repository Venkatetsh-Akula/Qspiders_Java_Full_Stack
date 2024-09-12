public class ArrayTask2 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,7,9,10};
        int miss=0,k=1;
        for(int i=0;i<arr.length;i++){
            if(k != arr[i]){
                miss=k;
                break;
            }
            k++;
        }
        System.out.println(miss);
    }
}
