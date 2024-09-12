import java.util.Arrays;
public class SortTheChar {
    public static void main(String[] args){
        String s="venkatesh";
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                if(c[i] > c[j]){
                    char temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
        }
        // System.out.println(Arrays.toString(c));
        String res=new String(c); //where the string is an class that can convert to object and there is a in built  constructor thet convert charcter array to string
        System.out.println(res);

    }
}
