
/**
 * This ApartmentBuilding class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
public class ApartmentBuilding extends Building
{
    private double[] wattHours;
    public ApartmentBuilding(String address, int num)
    {
        super(address);
        wattHours = new double[num];
    }
    public double amountOwed()
    {
        double sum = 0;
        for(int i = 0; i < wattHours.length; i++)
        {
            sum += (wattHours[i] * RATE);
        }
        return sum;
    }

}
