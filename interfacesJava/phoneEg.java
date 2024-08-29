
class Phone 
{
    public void call() { System.out.println("Phone call"); }
    public void sms() { System.out.println("Phone sending SMS"); }
}

interface ICamera
{
    //abstract
    void click();
    void record();
}

interface IMusicPlayer
{
    //abstract
    void play();
    void stop();
}

class SmartPhone extends Phone implements ICamera,IMusicPlayer
{
    public void videoCall() { System.out.println("Smart Phone video calling"); }
    //overriding
    public void click() { System.out.println("Smart Phone Clicking Photo"); }
    public void record() { System.out.println("Smart Phone recording video"); }
    public void play() { System.out.println("Smart Phone playing music"); }
    public void stop() { System.out.println("Smart Phone stopped playing music"); }
}

public class phoneEg {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.call();
        sp.click();
        sp.play();

        Phone p = new SmartPhone(); //only 2 methods allowed
        p.call();
        p.sms();

        ICamera c= new SmartPhone(); //only camera methods
        c.click();
        c.record();
    }
    
}
