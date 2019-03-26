
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

public class CubeSolver 
{
    private Cube curCube;
    //private Queue dcQueue;
    public CubeSolver(Cube c)
    {
        this.curCube = c;
    }
    
    public static Cube getCube()
    {
        int numFaces = 6;
        
        int numSubCubes = 9;
        
        Face[] cubeFaces = new Face[6];
        
        Color[] cubColors = new Color[3];
        
        for(int faces = 0;faces < numFaces;++faces)
        {
            for(int subCube = 0; subCube < numSubCubes;++subCube)
            {
                //Raed in face at 0
                //if(subCube == 1)
                    //Move camera down by one sub cube  
                //else
                //Continue rotating cube
                    //rotation read cube
                        //Firgue out the color by passing it to a color sorting function
            }
            //flip cub
            //store face in array
        }
    }
}
