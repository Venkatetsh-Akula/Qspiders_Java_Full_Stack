import java.util.HashMap;
import java.util.Arrays;
public class ruf{
    public static void main(String[] args){
        String s="big black bug sitting big black nose on big black dog",ans="";
        char[] ch=s.toCharArray();
        // for(int i=0;i<ch.length;i++){
        //     for(int j=1;j<ch.length;j++){
        //         if(ch[j-1]>ch[j]){
        //             char temp=ch[j-1];
        //             ch[j-1]=ch[j];
        //             ch[j]=temp;
        //         }
        //     }
        // }
        System.out.println(Arrays.equals(ch,ch));
        System.out.println(Arrays.toString(ch));
        ans=new String(ch);
        System.out.println(ans);
    }
}