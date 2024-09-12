import java.util.Scanner;
public class ScannerClass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter byte data type");
        byte a=sc.nextByte();
        System.out.println(a);
        System.out.println("enter short data type");
        short b=sc.nextShort();
        System.out.println(b);
        System.out.println("enter integer data type");
        int c=sc.nextInt();
        System.out.println(c);
        System.out.println("enter Long data type");
        long d=sc.nextLong();
        System.out.println(d);
        System.out.println("enter float data type");
        float e=sc.nextFloat();
        System.out.println(e);
        System.out.println("enter double data type");
        double f=sc.nextDouble();
        System.out.println(f);
        System.out.println("enter character data type");
        char g=sc.next().charAt(0);
        System.out.println(g);
        System.out.println("enter String line data type");
        String h=sc.nextLine();
        System.out.println(h);
        System.out.println("enter boolean data type");
        boolean i=sc.nextBoolean();
        System.out.println(i);
    }
}