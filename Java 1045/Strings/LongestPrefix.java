public class LongestPrefix{
    public static void main(String[] args){
        String[] str={"apple","appe","app","apti"};
        String res="";
        int ind=0;
        for(int i=0;i<str.length;i++){
            boolean state=true;
            for(int j=0;j<str.length;j++){
                if(ind<str[j].length() && str[i].charAt(ind)==str[j].charAt(ind)){
                    state=true;
                }
                else{
                    state=false;
                    break;
                }
            }
            if(state){
                res=res+str[i].charAt(ind);
                ind++;
            }
            else{
                break;
            }
        }
        System.out.println(res);
    }
}