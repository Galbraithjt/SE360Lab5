/**
 * Created by Joshua on 10/12/2016.
 */
public class DClock
{
    //Dummy class
    private Clock _subject;
    public DClock(Clock timer)
    {

    }

    //update
    public void Update(Subject test)
    {
        if (test == _subject )
        {
            Draw();
        }
    }
    public void Draw()
    {

    }
}
