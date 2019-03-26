
package robotics.Classes;

/**
 * @author ABB
 */
//------------------------------------------------------------------------------
//--------------------------------Imports---------------------------------------
//------------------------------------------------------------------------------



//------------------------------------------------------------------------------
//------------------------------End of imports----------------------------------
//------------------------------------------------------------------------------

public class Color 
{
    private Colors color;
    
    public Color(Colors c)
    {
        this.color = c;
    }
    public Color()
    {
        this.color = null;
    }
    public boolean hasColor()
    {
        return this.color == null;
    }
    public Colors getColor()
    {
        return this.color;
    }
    public void setColor(Colors c)
    {
        this.color = c;
    }
    
    public static enum Colors
    {
        white,
        red,
        yellow,
        blue,
        green,
        orange
    }
    
}
