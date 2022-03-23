import java.util.ArrayList;

public class ParseXML {

    // tag
    private static final String TAG = "ParseXML";

    private ArrayList<XMLEntry> entries;

    public ParseXML() {
        //initialize entries:
        this.entries = new ArrayList<XMLEntry>();

    }
    public ArrayList<XMLEntry> getEntries() {
        return entries;
    }
    public void setEntries(ArrayList<XMLEntry> entries) {
        this.entries = entries;
    }

}
