import java.util.Arrays;
import java.util.Scanner;
public class FindingDuplicateAllinOne {
    public static void main(String[] args) {
        int[] arr={5,10,5,6,10,7,10,5};
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=i+1;j<arr.length;j++){  //condition j==i gives remove duplicate, condition j==0 to get unique
                if(arr[i]==arr[j]){                 // condition j==i+1 gives remove duplicate
                    count++;
                }
            }
            if(count==1){
                System.out.println(arr[i]);
            }
        }
	}
}
