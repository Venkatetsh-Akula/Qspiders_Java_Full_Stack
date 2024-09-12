class Vowel{
    public static void main(String[] args){
        char letter='b';
        switch(letter){
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':System.out.println("Vowel");
            break;
            default:System.out.println("Not a Vowel");
        }
    }
}