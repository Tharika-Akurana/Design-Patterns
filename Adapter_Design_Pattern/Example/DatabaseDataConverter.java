
import java.util.List;

// interface
public interface DatabaseDataConverter {
    // method use to convert data coming from the database
    public List<DisplayData3rdParty> convertData(List<DatabaseData>data);
}