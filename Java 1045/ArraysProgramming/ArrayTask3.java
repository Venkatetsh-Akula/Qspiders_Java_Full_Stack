//write a program to print even index elements in arr using for each loop
public class ArrayTask3 {
    public static void main(String[] args){
        int k=0;
        int[] arr={12,4365,23,2354,67,3,2,4};
        for(int i : arr){
            if(k%2 == 0){
                System.out.println(i);
            }
                k++;
        }
    }
}
