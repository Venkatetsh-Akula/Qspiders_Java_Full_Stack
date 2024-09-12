public class ArrayTask5 {
    public static void main(String[] args){
        int[] arr={23,56,2,1,7,9,23,45,90};
        int first=0,second=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > first){
                second=first;
                first=arr[i];
            }
            else if(first > arr[i] && second < arr[i] ){
                second=arr[i];
            }
        }
        System.out.println(first+" "+second);
    }
}
