public class StringPolindrome {
    public static boolean reverse(String s){
        String res="";
        for(int i=0;i<s.length();i++){
            res=s.charAt(i)+res;
        }
        return s.equalsIgnoreCase(res);
    }
    public static void main(String[] args){
        String name="madam";
        boolean state=reverse(name);
        if(state){
            System.out.println("Is a polindrome");
        }
        else{
            System.out.println("Is not a polindrome");
        }
    }
}
