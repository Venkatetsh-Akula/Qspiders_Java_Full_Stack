public class DoctorDriver {
    public static void main(String[] args){
        DoctorCardiologist d=new DoctorCardiologist();
        System.out.println(d.dl);
        System.out.println(d.name);
        System.out.println(d.specilization);
        d.OpenHeartSurgery();
        d.checkBP();
    }
}
