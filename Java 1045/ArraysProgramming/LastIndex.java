public class LastIndex {
    public static boolean check(int[] a,int[] b){
        return a[a.length-1]==b[b.length-1];
    }
    public static void main(String[] args){
        int[] arr1={234,323,3,423,43,1,5};
        int[] arr2={23,232,32,5};
       System.out.println(check(arr1,arr2));
    }

}
