public class CarMusic {
    String cmusic;
    String cspeaker;
    double cost;
    int nos;
    public CarMusic(String cmusic,String cspeaker,double cost,int nos){
        this.cmusic=cmusic;
        this.cspeaker=cspeaker;
        this.cost=cost;
        this.nos=nos;
    }
    public void MusicDisplay(){
        System.out.println("Music System in the car");
        System.out.println("Tape Recorder company: "+ cmusic);
        System.out.println("Spearker Company: " +cspeaker);
        System.out.println("Total Cost: "+cost);
        System.out.println("Number of spakers: "+nos);
    }
}
