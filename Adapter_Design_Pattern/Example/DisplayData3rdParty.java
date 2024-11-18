// data should be displayed

public class DisplayData3rdParty {
    public float index;  // index as float
    public String data;  // data as String

    //constructor
    public DisplayData3rdParty(float index,String data){
        this.index = index;
        this.data = data;
    }

    public void displayData() {
        System.out.println("Data is displayed" + index + "-" + data); 
    }
}
