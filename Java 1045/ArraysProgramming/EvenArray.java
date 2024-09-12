public class EvenArray {
    public static void main(String[] args){
        int[] arr={10,22,34,5,3,66,43};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                System.out.println(arr[i]+" is an even number");
            }
        }
    }
}
