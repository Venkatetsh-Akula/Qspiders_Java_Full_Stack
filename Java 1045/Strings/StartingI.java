import java.util.Arrays;
public class StartingI {
    public static void main(String[] args){
        int count=0;
        String name="my name is Akula Venkatesh  ";
        char[] c=name.toCharArray();
        for(int i=0;i<c.length;i++){
            if((i == 0 && name.charAt(i) != ' ') || (name.charAt(i) != ' ' && name.charAt(i-1) == ' ')){
                c[i]='I';
                count++;
            }
        }
        String ws=new String(c);
        System.out.println(ws);
        int k=0;
        char[] res=new char[c.length - count];
        for(int i=0;i<c.length;i++){
            if(c[i] != ' ')
                res[k++]=c[i];
        }
        String val=new String(res);
        System.out.println(val);
    }
}
