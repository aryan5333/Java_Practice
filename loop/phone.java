import java.lang.*;

class phone
{
    public void call()
    {
        System.out.println("phone call");
    }
    public void sms()
    {
        System.out.println("phone sending sms");
    }
}
interface Icamera
{
    void click();
    void record();

}
interface IMusicplayer
{
    void start();
    void stop();
    void pause();
}
class smartphone extends phone implements Icamera,IMusicplayer
{
    public void videocall()
    {
        System.out.println("videocall is done");
    }
    public void click()
    {
        System.out.println("click the camera");
    }
    public void record()
    {
        System.out.println("record on the camera");
    }
    public void start()
    {
        System.out.println("start the music player");
    }
    public void stop()
    {
        System.out.println("stop the music player");
    }
    public void pause()
    {
        System.out.println("pause the music player");
    }

}
class phone2
{
    public static void main(String[] args) {
        smartphone sp=new smartphone();
        sp.call();
        sp.click();
        sp.start();
    }
}