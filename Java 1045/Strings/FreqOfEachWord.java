import java.util.Arrays;
public class FreqOfEachWord {
    public static void frequencyOfWord(String s){
        String[] str=s.split(" ");
        int[] freq=new int[str.length];
        System.out.println(Arrays.toString(str));
        for(int i=0;i<str.length;i++){
            freq[i]=1;
            for(int j=i+1;j<str.length;j++){
                if(!(str[i].equals("@")) && !(str[j].equals("@")) && str[i].equals(str[j])){
                    freq[i]++;
                    str[j]="@";
                }
            }
        }
        for(int i=0;i<str.length;i++){
            if(!str[i].equals("@")){
                System.out.println(str[i]+"------>"+freq[i] );
            }
        }
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(freq));
    }
    public static void main(String[] args){
        String s="big black bug sitting big black nose on big black dog";
        frequencyOfWord(s);
    }
}
