public class StudentNonstaticVarible {
    String name;
    String group;
    int age;
    public static void main(String[] args){
        StudentNonstaticVarible s1=new StudentNonstaticVarible();
        s1.name="Akula Venkatesh";
        s1.group="ECE";
        s1.age=22;
        System.out.println("============Student 1 details===========");
        System.out.println(s1.name);
        System.out.println(s1.group);
        System.out.println(s1.age);



        StudentNonstaticVarible s2=new StudentNonstaticVarible();
        s2.name="Nitish Kumar";
        s2.group="ECE";
        s2.age=23;
        System.out.println("============Student 2 details===========");
        System.out.println(s2.name);
        System.out.println(s2.group);
        System.out.println(s2.age);

        StudentNonstaticVarible s3=new StudentNonstaticVarible();
        s3.name="Naveen Kumar";
        s3.group="CSE";
        s3.age=21;
        System.out.println("============Student 3 details===========");
        System.out.println(s3.name);
        System.out.println(s3.group);
        System.out.println(s3.age);



        StudentNonstaticVarible s4=new  StudentNonstaticVarible();
        s4.name="Sudheer Kaviti";
        s4.group="Mech";
        s4.age=23;
        System.out.println("============Student 4 details===========");
        System.out.println(s4.name);
        System.out.println(s4.group);
        System.out.println(s4.age);
    }
}
