public class UpperCaseStringToLowerCase {
    public static void main(String[] args){
        String s="JSPIDERS";
        // System.out.println(s.toLowerCase());  toLowerCase() In built method
        String res="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c >= 65 && c <= 90){
                int x= (int) c;
                x=x+32;
                c=(char) x;
            }
            res+=c;
        }
        System.out.println(res);
    }
}
