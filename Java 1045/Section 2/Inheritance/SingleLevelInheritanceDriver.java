public class SingleLevelInheritanceDriver{
    public static void main(String[] args){
        SingleLevelInheritanceCardiologist c=new SingleLevelInheritanceCardiologist();
        System.out.println(c.name);
        System.out.println(c.ID);
        System.out.println(c.course);
        c.CheckBP();
        c.SugerCheck();
        System.out.println(c.degree);
        System.out.println(c.special);
        c.ECG();
        c.openheartsurgery();
        SingleLevelInheritanceDoctor m=new SingleLevelInheritanceDoctor();
        System.out.println(m.name);
        m.CheckBP();
        // m.ECG();  CTE it only contains Propertys of SingleLevel Inheritance Doctor proprtys can Accessmanother propertys
    }
}