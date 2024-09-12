public class WhatsappDriver {
    public static void main(String[] args){
        Whatsapp3 w3=new Whatsapp3();
        System.out.println("Whatsapp version 3");
        w3.Recived();
        w3.Send();
        w3.Call();
        w3.VideoCall();
        Whatsapp2 w2=new Whatsapp2();
        System.out.println("Whatsapp version 2");
        w2.Send();
        w2.Recived();
        w2.Call();
        //w2.VideoCall() CTE because version 2 dont has video call feauture
        Whatsapp1 w1=new Whatsapp1();
        System.out.println("Whatsapp version 1");
        w1.Send();
        w1.Recived();
        // w1.Call();   CTE because version 1 has only Send and recive msg propertys
    }
}
