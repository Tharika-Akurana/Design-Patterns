
import java.util.ArrayList;
import java.util.List;

// Adapter (convert as display data which the data coming from the database)
public class DisplayDataAdapter implements DatabaseDataConverter{
    @Override

    public List<DisplayData3rdParty>convertData(List<DatabaseData>databaseData){
        
        List<DisplayData3rdParty>list = new ArrayList<>();
        
        for(DatabaseData point:databaseData
        ){
            float index = point.position; // convert 'integer' 'position' to the 'float' as 'index.'
            String data = Integer.toString(point.amount); // convert 'amount' 'integer' to the 'String' as 'data'

            DisplayData3rdParty d = new DisplayData3rdParty(index,data);
            list.add(d);
        }
        return list;
    }
}