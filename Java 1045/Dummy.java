import java.util.Arrays;
import java.util.Scanner;
public class Dummy{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),i,j;
        int[][] arr=new int[a][a];
        for(i=0;i<a;i++){
            for(j=0;j<a;j++){
                arr[i][j]=sc.nextInt();
            }
        } 
         for(i=0;i<a;i++){
            for(j=0;j<a;j++){
                // System.
            }
        } 
        System.out.println(Arrays.toString(arr));
    }
}