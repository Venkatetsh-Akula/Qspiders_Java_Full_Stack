import java.util.Arrays;
public class RemoveDuplicateString {
    public static void  RemoveDupString(String s){
        int count=0;
        String[] str=s.split(" ");
        for(int i=0;i<str.length;i++){
            for(int j=i+1;j<str.length;j++){
                if(!str[i].equals("@") && !str[j].equals("@") && str[i].equals(str[j])){
                    str[j]="@";
                    count++;
                }
            }
        }
        int k=0;
        String[] res=new String[str.length-count];
        for(int i=0;i<str.length;i++){
            if(!str[i].equals("@")){
                res[k++]=str[i];
            }
        }
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(res));   
    }
    public static void main(String[] args){
        String s="big black bug sitting big black nose on big black dog";
        RemoveDupString(s);
    }
}
