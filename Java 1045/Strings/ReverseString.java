public class ReverseString {
    public static void main(String[] args){
        String n="java";
        String res="";
        for(int i=0;i<n.length();i++){
            res=n.charAt(i)+res;
        }
        System.out.println(res);
    }
}
