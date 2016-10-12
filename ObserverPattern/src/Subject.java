import java.util.List;

/**
 * Created by Joshua on 10/12/2016.
 */
public abstract class Subject
{
    //Dummy abstract class
    protected Subject(){}

    private List<Observer> _observers;

    //add observers
    private void Attach(Observer o)
    {
        _observers.add(o);
    }

    //remove observers
    private void Detach(Observer o)
    {
        _observers.remove(o);
    }

    protected void Notify()
    {

    }

}
