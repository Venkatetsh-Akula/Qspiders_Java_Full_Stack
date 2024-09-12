public class MinimumElement {
    public static void main(String[] args){
        int min=Integer.MAX_VALUE;
        int[] arr={1,5,6,8,2};
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
