class AlternativeCharacter{
    public static void main(String[] args){
        char ch='A';
        while(ch <= 'Z'){
            System.out.println(ch);
            //ch+=2;
            //ch=ch+2 here we will get error implictly want to convert from integer to character
            ch=(char)(ch+2);  
        }
    }
}