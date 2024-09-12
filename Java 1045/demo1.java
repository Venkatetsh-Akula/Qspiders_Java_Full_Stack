class Assignment{

    public static void main(String[] args){
      int a=25,count=0,sum=0,sqrsum=0;
      int temp=a;
      while(a>0){
         int rem=a%10;
         count++;
         sum=sum+rem;
         a=a/10;
      }
      int sqr=temp*temp;
      for(int i=1;i<=count;i++){
         int rem2=sqr%10;
         sqrsum=sqrsum+rem2;
         sqr=sqr/10;
      }
      if(sum == sqrsum){
         System.out.println(temp +" is a automrpic number");
      }
      else{
         System.out.println(temp+ " is not a automorpic number");
      }
    }
}