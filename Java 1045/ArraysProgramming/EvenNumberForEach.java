//print even number using for each loop
public class EvenNumberForEach {
    public static void main(String[] args){
        int[] arr={1,4,23,54,76,23,4,5};
        for(int x : arr){
            if(x % 2== 0){
                System.out.println(x);
            }
        }
    }    
}
