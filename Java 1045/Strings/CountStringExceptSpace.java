public class CountStringExceptSpace {
    public static void main(String[] args){
        String s="I am a student of jsp";
        System.out.println(s.length());
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
