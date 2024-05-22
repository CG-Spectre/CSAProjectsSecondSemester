import java.util.ArrayList;

public class ServiceArea
{
    private ArrayList<Building> allBuildings;   // a list of all buildings

    public ServiceArea()
    {
        allBuildings = new ArrayList();
    }

    public double totalSales()
    {
        double sum = 0.0;
        for(int i = 0; i < allBuildings.size(); i++)
        {
            sum += allBuildings.get(i).amountOwed();
        }
        return sum;
    }
}