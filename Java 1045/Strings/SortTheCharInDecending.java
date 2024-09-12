public class SortTheCharInDecending {
    public static void main(String[] args){
        String s="venkatesh";
        char[] c=s.toCharArray();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(c[i] < c[j]){
                    char temp=c[j];
                    c[j]=c[i];
                    c[i]=temp;
                }
            }
        }
        String str=new String(c);
        System.out.println(str);
    }
}
