public class SingleLevelInheritanceCardiologist extends SingleLevelInheritanceDoctor {
    String special="cardiologist";
    String degree="P.H.D";
    public void ECG(){
        System.out.println("ECG checking------------");
    }
    public void openheartsurgery(){
        System.out.println("open heart surgery------------");
    }
}
