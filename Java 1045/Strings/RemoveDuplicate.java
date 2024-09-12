public class RemoveDuplicate {
    public static String removedup(String s){
        int count=0;
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                if(c[i] != '@' && c[j] != '@' && c[i] == c[j]){
                    c[j]='@';
                    count++;
                }
            }
        }
        char[] a=new char[s.length()-count];
        int k=0;
        for(int i=0;i<s.length();i++){
            if(c[i] != '@'){
                a[k++]=c[i];
            }
        }
        String res=new String(a);
        return res;
    }
    public static void main(String[] args){
        String name="sdfsajkdnfishfnuidsnfiusabdf";
        String org=removedup(name);
        System.out.println(org);
    } 
}
