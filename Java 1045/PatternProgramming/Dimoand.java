public class Dimoand{
    public static void main(String[] args){
        int n=3;
        for(int r=0;r<n*2-1;r++){
            for(int c=0;c<n*2-1;c++){
                if(r+c>=n+1 && c-r<=n-1 && r-c<=n-1 && r+c<=n*3-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}