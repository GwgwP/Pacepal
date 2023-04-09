import java.io.Serializable;
import java.util.ArrayList;

public class Chunk implements Serializable{
    /* Chunk must implement Serializable in order to pass it in stream */
    private ArrayList<Waypoint> ls_wpt;    

    public Chunk()
    {
        ls_wpt = new ArrayList<Waypoint>();
    }

    public void add_wpt(Waypoint wpt)
    {
        this.ls_wpt.add(wpt);
    }
}
