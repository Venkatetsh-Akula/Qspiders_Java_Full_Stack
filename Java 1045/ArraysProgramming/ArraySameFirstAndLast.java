public class ArraySameFirstAndLast {
    public static boolean FirstLast(int[] x){
        return (x[0] == x[x.length-1]);
    }
    public static void main(String[] args){
        int[] arr={3,7,1,4,3};
        System.out.println(FirstLast(arr));
    }
}
