//Example wow that  madam is a malayalam
public class LargestPolindrome {
    public static boolean polindrome(String r){
        String reverse="";
        for(int i=0;i<r.length();i++){
            reverse=r.charAt(i)+reverse;
        }
        return (r.equals(reverse));
    }
    public static String findLargest(String s){
        int max=Integer.MIN_VALUE;
        String word="";
        String[] str=s.split(" ");
        for(int i=0;i<str.length;i++){
            if(polindrome(str[i]) && str[i].length() > max ){
                max=str[i].length();
                word=str[i];
            }
        }
        System.out.println(max);
        return word;
    }
    public static void main(String[] args){
        String s=" wow that  madam is a malayalam";
        String res=findLargest(s);
        System.out.println(res);
    }
}
