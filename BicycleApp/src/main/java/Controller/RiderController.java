package Controller;
import Model.Rider;

public class RiderController {
    public Rider addRider(String Name, String Country, double Weight,double Height) {
        Rider rider = new Rider(Name,Country,Weight,Height);
        return  rider;
    }
    public Rider.Records addRecords(Rider rider, int No_Of_Records, float TopSpeed, int No_Of_Olympic_Medals, int No_National_level_Records) {
        Rider.Records records = rider.new Records(No_National_level_Records, TopSpeed, No_Of_Olympic_Medals);
        return records;
    }

}

