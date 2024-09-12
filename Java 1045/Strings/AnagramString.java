public class AnagramString {
    public static void main(String[] args){
        String s1="care";
        String  s2="race";
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        sort(c1);
        sort(c2);
        boolean state=check(c1,c2);
        if(state){
            System.out.println("given staring is a Anagram");
        }
        else{
            System.out.println("given staring is not Anagram");
        }

    }
    public static void sort(char[] c1){
        for(int i=0;i<c1.length;i++){
            for(int j=0;j<c1.length;j++){
                if(c1[i] > c1[j]){
                    char temp=c1[i];
                    c1[i]=c1[j];
                    c1[j]=temp;
                }
            }
        }
    }
    public static boolean check(char[] c1,char[] c2){
        for(int i=0;i<c1.length;i++){
            if(c1[i] != c2[i]){
                return false;
            }
        }
        return true;
    } 
}
