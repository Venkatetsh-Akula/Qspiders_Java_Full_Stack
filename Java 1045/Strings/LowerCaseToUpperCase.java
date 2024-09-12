import java.util.Arrays;
public class LowerCaseToUpperCase {
    public static void main(String[] args){
        String s="jspiders";
        // System.out.println(s.toUpperCase());        .toUpperCase() in built method 
        String res="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c >= 'a' && c <= 'z'){
                int x=(int) c;
                x-=32;
                c=(char) x;
            }
            res+=c;
        }
        System.out.println(res);
    }
}
