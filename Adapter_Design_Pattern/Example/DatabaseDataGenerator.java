import java.util.ArrayList;
import java.util.List;

// Generates database data
public class DatabaseDataGenerator {

    // Method to generate sample data
    public List<DatabaseData> generateData() {
        List<DatabaseData> databaseDataList = new ArrayList<>();

        // Adding some sample data to the list
        databaseDataList.add(new DatabaseData(1, 100));
        databaseDataList.add(new DatabaseData(2, 200));
        databaseDataList.add(new DatabaseData(3, 300));
        databaseDataList.add(new DatabaseData(4, 400));
        databaseDataList.add(new DatabaseData(5, 500));

        return databaseDataList;
    }
}
