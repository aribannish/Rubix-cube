
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

public class Cube 
{
    protected Face front,top,back,bottom,right,left;
    private Face curFace;
    
    public Cube(Face[] f)
    {
        this.top = f[0];
        this.front = f[1]; 
        this.bottom = f[2]; 
        this.back = f[3]; 
        this.left = f[4]; 
        this.right = f[5];
    }
    public Cube(){}
    
    /**
     * Rotates the cubes face by pi/2
     * @return R_PI2_M
     */
    public Moves RotatePI2()
    {    
        return Moves.R_PI2_M;
    }
    
    /**
     *  Rotates the cube face by -pi/2
     * @return R_NPI2_M
     */
    public Moves RotateNPI2()
    {
        return Moves.R_NPI2_M;
    }
    
    /**
     *  Flips the cube by pi/2
     * @return F_PI2
     */
    public Moves FilpPI2()
    {
        return Moves.F_PI2;
    }
    
    /**
     *  Rotates the cube by pi/2 with no face movement
     * @return R_NPI2_NoFM
     */
    public Moves RotatePI2NoMovement()
    {
        return Moves.R_NPI2_NoFM;
    }
    
    /**
     *  Rotates the the cube by -pi/2 with no face movement
     * 
     * @return R_NPI2_ NoFM
     */
    public Moves RotateNPINoMovement()
    {
        return Moves.R_NPI2_NoFM;
    }
    
    /**
     *  R_PI2_NoFm, Rotate by pi over 2 no face movement
     *  R_NPI2_NoFM, Rotate cube by -pi over 2 no face movement
     *  R_PI2_M, Rotate cube by pi over 2 with face movement 
     *  R_NPI2_M, Rotate cube by -pi over 2 with face movement
     *  F_PI2 Flip, cube by pi over two
     */
    public static enum Moves
    {
        R_PI2_NoFM,
        R_NPI2_NoFM,
        R_PI2_M,
        R_NPI2_M,
        F_PI2
    }
}
