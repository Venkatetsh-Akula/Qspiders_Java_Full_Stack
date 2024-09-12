public class MaximumElement {

    public static void main(String[] args){
        int max=Integer.MIN_VALUE;
        int[] arr={1,5,6,8,2};
        for(int i=0;i<arr.length;i++){
            if(max < arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}