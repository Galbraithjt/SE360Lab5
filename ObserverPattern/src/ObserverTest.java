/**
 * Created by Joshua on 10/12/2016.
 */
public class ObserverTest
{
    public static void main(String[] args)
    {
        //new clock
        Clock timer = new Clock();
        //new digital clock
        DClock dClock = new DClock(timer);
        //new analog clock
        AClock aClock = new AClock(timer);
    }
}
