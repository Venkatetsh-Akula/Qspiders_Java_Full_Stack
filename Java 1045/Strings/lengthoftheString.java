public class lengthoftheString {
    public static void main(String[] args){
        String s="I am a student of jsp";
        int count=0;
        char[] c=s.toCharArray();
        for(char i : c){
            count++;
        }
        System.out.println(count);


        //Exception handling 
        // for(int i=0;  ;i++){
        //     try{
        //         s.charAt(i);
        //         count++;
        //     }
        //     catch(IndexOutOfBoundsException e){
        //         System.out.println("Length of string "+count);
        //         break;
        //     }
        // }
    }

}
