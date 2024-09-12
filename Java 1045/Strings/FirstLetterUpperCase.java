public class FirstLetterUpperCase {
    public static void Upper(String s){
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(i == 0 && i !=' '){
                c[i]=Character.toUpperCase(c[i]);
            }
            else{
                if(c[i] != ' ' && c[i-1] == ' '){
                    c[i]=Character.toUpperCase(c[i]);
                }
            }
        }
        String res=new String(c);
        System.out.println(res);
    }
    public static void main(String[] args){
        String n="my name is akula venkatesh";
        Upper(n);
    }
}
