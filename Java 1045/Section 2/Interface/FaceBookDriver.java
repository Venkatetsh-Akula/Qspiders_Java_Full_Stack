public class FaceBookDriver {
    public static void main(String[] args){
        FaceBookSpecilizedApp a=new FaceBookSpecilizedApp();
        FaceBookSpecilizedWeb w=new FaceBookSpecilizedWeb();
        System.out.println("=================== App login & logout ===============");
        a.login();
        a.Applogin();
        a.logout();
        System.out.println("====================Web login & logout===========");
        w.login();
        w.Weblogin();
        w.logout();
    }
}
