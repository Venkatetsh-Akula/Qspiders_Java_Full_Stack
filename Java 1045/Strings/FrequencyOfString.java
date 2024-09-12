import java.util.Arrays;
public class FrequencyOfString {
    public static void FreqString(String s){
        char[] c=s.toCharArray();
        int[] freq=new int[c.length];
        for(int i=0;i<c.length;i++){
            freq[i]=1;
            for(int j=i+1;j<c.length;j++){
                if(c[i] != '@' && c[j] != '@' && c[i] == c[j]){
                    freq[i]++;
                    c[j]='@';
                }
            }
        }
        for(int i=0;i<c.length;i++){
            if(c[i] != '@'){
                System.out.println(c[i]+"----------->"+freq[i]);
            }
        }
        // System.out.println(Arrays.toString(c));
        // System.out.println(Arrays.toString(freq));
    }
    public static void main(String[] args){
        String s="sdjfjdfhshfusd";
        FreqString(s);
    }
}
