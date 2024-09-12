import java.util.Arrays;
public class CountNumberOfWords {
    public static void main(String[] args){
        String name="      my  name  is   Venkatesh       ";
        int count=0;
        // for(int i=1;i<name.length();i++){
        //     char first=name.charAt(i);
        //     char last=name.charAt(i-1);
        //     if(last == ' ' &&  ((first >= 'a' && first <= 'z') || (first >= 'A' && first <= 'Z'))){
        //         count++;
        //     }
        // }
        // if(name.charAt(0) == ' '){
        //     System.out.println(count);
        // }
        // else{
        //     System.out.println(count+1);
        // }

        //Sir logic
        for(int i=0;i<name.length();i++){
            if((i == 0 && name.charAt(i) != ' ') || ((name.charAt(i) != ' ') && (name.charAt(i-1) == ' '))){
                count++;
            }
        }
        System.out.println(count);
    }

}
