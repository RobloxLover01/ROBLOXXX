
/**
 * Write a description of class Roblox here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Roblox
{
    // instance variables - replace the example below with your own
    private int x;
    private int robux;
    private boolean hat;
    private boolean shirt;
    private boolean shoes;
    private String hat2;
    private String shirt2;
    private String shoes2;
    private int total;

    /**
     * Constructor for objects of class Roblox
     */
    public Roblox()
    {
        hat = false;
        shirt = false;
        shoes = false;
        hat2 = "You have no hat";
        shirt2 = "You have no shirt";
        shoes2 = "You have no shoes";
        total = 0;
    }

        /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printRoblox()
    {
        System.out.println("Life is Roblox.");
    }
    
    public void giveRobux(int amountRobux)
    {    
        robux = amountRobux;
    }
    
    public void viewRobux()
    {
        System.out.println("You have " + robux + " robux.");
    }
    
    public void buyHat()
    {
        if(robux > 100)
        {
            hat = true;
            robux -= 100;
            System.out.println("Purchase complete!");
            hat2 = "You have a hat";
            total += 100;
        }
        else
        {
            System.out.println("Not enough robux");
            hat = false;
        }
    }
    
    public void buyShirt()
    {
        if(robux > 50)
        {
            shirt = true;
            robux -= 50;
            System.out.println("Purchase complete!");
            shirt2 = "You have a shirt";
            total += 50;
        }
        else
        {
            System.out.println("Not enough robux");
            shirt = false;
        }
    }
    
    public void buyShoes()
    {
        if(robux > 250)
        {
            shoes = true;
            robux -= 250;
            System.out.println("Purchase complete!");
            shoes2 = "You have shoes";
            total +=250;
        }
        else
        {
            System.out.println("Not enough robux");
            shoes = false;
        }
    }
    
    public boolean hat()
    {
        return hat;
    }
    
    public void showOutfit()
    {
        System.out.println("########################");
        System.out.println("    " + hat2 + "    ");
        System.out.println("    " + shirt2 + "    ");
        System.out.println("    " + shoes2 + "    ");
        System.out.println("########################");
    }
    
    public void refundClothes()
    {
        robux += total;
        hat2 = "You have no hat";
        shirt2 = "You have no shirt";
        shoes2 = "You have no shoes";
        shoes = false;
        shirt = false;
        shoes = false;
        System.out.println(total + " robux refunded.");
        total = 0;
    }
}
