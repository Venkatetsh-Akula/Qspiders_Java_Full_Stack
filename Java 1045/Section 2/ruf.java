import java.util.ArrayList;
public class ruf{
    public static ArrayList ListPermutation(String process,String s){
        if(s.isEmpty()){
            ArrayList<String> li=new ArrayList<>();
            li.add(process);
            return li;
        }
        char c=s.charAt(0);
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<=process.length();i++){
            String start=process.substring(0,i);
            String end=process.substring(i,process.length());
            ans.addAll(ListPermutation(start+c+end,s.substring(1)));
        }
        return ans;
    }
    public static void main(String[] args){
        String str="abc";
        ArrayList<String> result=new ArrayList<>();
        result=ListPermutation("",str);
        System.out.println(result);
    }
}