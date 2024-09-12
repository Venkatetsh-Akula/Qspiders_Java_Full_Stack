public class Institute{
    String cname;
    String Address;
    long helpline;
    public Institute(String cname,String Address,long helpline){
        this.cname=cname;
        this.Address=Address;
        this.helpline=helpline;
    }
    //InstituteCourse object creation
    InstituteCourse[] course={new InstituteCourse("JAVA", 6, "Jspiders"),new InstituteCourse("Python", 5, "Pyspiders"),
                                new InstituteCourse("Testing", 4, "Qspiders"),new InstituteCourse("Front End", 5, "MERN stack")};
    public void InstituteDisplay(){
        System.out.println("Details of Institute");
        System.out.println("Institute name: "+cname);
        System.out.println("Institute Address: "+Address);
        System.out.println("HelpLine Number: "+helpline);
        for(int i=0;i<course.length;i++){
            System.out.println("Avaliable Course: "+course[i].cou+" Total complete period: "+course[i].monthDuration+" branch name: "+course[i].branch);
        }
    }
    //Student Object Creation
    InstituteStudent[] STD={new InstituteStudent("Venkatesh","ECE",79,2023,"Jspiders"),
                            new InstituteStudent("Nitheesh", "ECE", 75, 2023, "Jspider"),
                            new InstituteStudent("Nithin", "CSE", 78, 2023, "Pyspiders"),
                            new InstituteStudent("Sudheer", "MEC", 72, 2023, "MERNStack"),
                            new InstituteStudent("Naveen", "ECE", 83, 2023, "Qspiders")
                        };

    public void StudentDiaplay(){
        System.out.println("Student Details are: ");
        for(int j=0;j<STD.length;j++){
            System.out.println("Student name: "+STD[j].name+" branch of "+STD[j].branch+" Secure percentage "+
                                STD[j].percentage+" Passed out year: "+STD[j].pso+" course of:"+STD[j].sub);
        }
    }
}