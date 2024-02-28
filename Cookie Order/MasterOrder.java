import java.util.*;
public class MasterOrder
{
    /** The list of all cookie orders */
    private List<CookieOrder> orders;
    
    /** Constructs a new MasterOrder object */
    public MasterOrder()
    {
        orders = new ArrayList<CookieOrder>();
    }
    
    /** Add theOrder to the Master order.
      * @param theOrder the cookie order to add to the master order
      */
     public void addOrder(CookieOrder theOrder)
     {
         orders.add(theOrder);
     }
     
     public CookieOrder getOrder(int index)
     {
         return orders.get(index);
     }
     
     public String toString()
     {
         String result = "\nCookie orders on file\n";
         for(CookieOrder order : orders)
            result += order + "\n";
         return result;
     }
     
     /** @return the sum of the number of boxes of all the cookie orders */
     public int getTotalBoxes()
     {
         int total = 0;
         for(CookieOrder order : orders){
             total += order.getNumBoxes();
         }
         return total;
    }
     
     
     /** Removes all cookie orders from the master order that have the same
      * variety of cookie as cookieVar and returns the total number of boxes
      * that were removed.
      * @param cookieVar the variety of cookies to remove from the master order
      * @return the total number of boxes of cookieVar in the cookie orders removed
      */
    public int removeVariety(String cookieVar){
         int returned = 0;
         int index = 0;
         while(index < orders.size()){
             if(orders.get(index).getVariety().equals(cookieVar)){
                returned +=  orders.get(index).getNumBoxes();
                orders.remove(index);
                 
                
             }
             else{
                index++;
             }
         }
         return returned;
    }
}
