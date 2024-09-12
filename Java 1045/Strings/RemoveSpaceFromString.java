public class RemoveSpaceFromString {
    public static void main(String[] args){
        String str1="I am a student of jsp";
        String n="";
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i) != ' '){
                n=n+str1.charAt(i);
            }
        }
       System.out.println(n);
    }
}
