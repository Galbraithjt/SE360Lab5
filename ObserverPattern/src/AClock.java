/**
 * Created by Joshua on 10/12/2016.
 */
public class AClock
{
    private Clock _subject;
    public AClock(Clock timer)
    {

    }
    public void Update(Subject test)
    {
        if (test == _subject )
        {
            Draw();
        }//End if
    }//End Update()
    public void Draw()
    {

    }//End Draw()
}
