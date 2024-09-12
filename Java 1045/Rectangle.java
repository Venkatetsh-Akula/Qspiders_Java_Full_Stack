class Rectangle{
    public static void area(int length,int breath){
       int area1= length*breath;
       System.out.println("The area of rectangle is: "+(area1));
       int perimeter=2*(length+breath);
       System.out.println("the perimeter of rectangle is: "+ perimeter);
    }
    public static void words(String fname, String lname){
        System.out.println("My name is: "+fname+" "+lname);
    }
    public static double AR(double len,double ber){
        return len*ber;
    }
    public static void main(String[] args){
        area(20,50);
        words("Akula","Venkatesh");
        System.out.println(AR(30,22.2));
    }
}