import java.util.List;  // Importing the List class

public class Client {
    public static void main(String[] args) {
        DatabaseDataGenerator gen = new DatabaseDataGenerator();
        DisplayDataAdapter adapter = new DisplayDataAdapter();

        List<DisplayData3rdParty> legacyData = adapter.convertData(gen.generateData());

        // Client uses adapter to convert database data and display it
        for (DisplayData3rdParty data : legacyData) {
            data.displayData();
        }
    }
}
