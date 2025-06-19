package OOP;

class TV{
    public void turnOn(){
        System.out.println("old tv is on");
    }
    public void changeChannel(){
        System.out.println("old tv changed channels");
    }
}

class SmartTV extends TV{
    public void turnOn(){
        System.out.println("Smart tv is on");
    }
    public void changeChannel(){
        System.out.println("Smart tv changed channels");
    }
    public void VoiceControl(){
        System.out.println("Smart tv can use voice control");
    }
}

public class EgOverriding {
    public static void main(String[] args) {
        TV o1 = new TV();
        o1.turnOn();
        o1.changeChannel();

        System.out.println("-----------------");

    SmartTV s1= new SmartTV();
    s1.turnOn();
    s1.VoiceControl();
    s1.changeChannel();

    TV t = new SmartTV();
    t.turnOn();
    t.changeChannel();
    //as it is referencing class TV, it doesnt have t.VoiceControl. output will be according to SmartTV as it is object

    }
}
