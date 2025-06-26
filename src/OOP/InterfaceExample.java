package OOP;

class Phone{
    public void call(){
        System.out.println("phone call");
    }
    public void sms(){
        System.out.println("phone sends sms");
    }
}
//--------------------------------//INTERAFCE METHODS ARE BY DEFAULT PUBLIC AND ABSTRACT, CANNOT HAVE BODY(unless marked as default or static), MUST DEFINE BODY AFTER IMPLEMENTING
//                                  INTERFACE CAN EXTEND FROM ANOTHER INTERFACE, CAN ADD NEW METHODS
interface Camera{
    void click();
    void record();
}

interface MusicPlayer{
    void play();
    void pause();
}

class SmartPhone extends Phone implements  Camera, MusicPlayer{

    @Override
    public void call() {
        System.out.println("smart phone call");
    }

    @Override
    public void sms() {
        System.out.println("smart phone sms");
    }

    @Override
    public void click() {
        System.out.println("smart phone click photo");
    }

    @Override
    public void record() {
        System.out.println("smartphone take video");
    }

    @Override
    public void play() {
        System.out.println("smartphone play music");
    }

    @Override
    public void pause() {
        System.out.println("smartphone pauses music");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {

        SmartPhone sp = new SmartPhone();
        sp.call();
        sp.sms();
        sp.click();
        sp.record();
        sp.play();
        sp.record();

        Phone p = new SmartPhone();
        p.call();
        p.sms();

        MusicPlayer mp = new SmartPhone();
        mp.pause();
        mp.play();

        Camera c = new SmartPhone();
        c.click();
        c.record();

    }
}
