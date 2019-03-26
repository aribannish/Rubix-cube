
package robotics.Classes;

import robotics.Classes.Color.Colors;

/**
 * @author ABB
 */
//------------------------------------------------------------------------------
//--------------------------------Imports---------------------------------------
//------------------------------------------------------------------------------



//------------------------------------------------------------------------------
//------------------------------End of imports----------------------------------
//------------------------------------------------------------------------------

public class Face 
{
    protected Colors[][] faceColors;
    protected FacePos curPos;
    
    public Face(Colors[][] face,FacePos p)
    {
        this.curPos = p;
        this.faceColors = face;
    }
    public Face()
    {
        this.curPos = null;
        this.faceColors = null;
    }
    public Colors[] getBottomCol(Colors[] c)
    {
        Colors[] bottom = this.faceColors[2];
        this.faceColors[2] = c;
        return bottom;
    }
    public Colors[] getTopCol(Colors[] c)
    {
        Colors[] top = this.faceColors[0];
        this.faceColors[0] = c;
        return top;
    }
    public void setFacePos(FacePos p)
    {
        this.curPos = p;
    }
    public FacePos getFacePos()
    {
        return this.curPos;
    }
    public static enum FacePos
    {
        Front,
        Top,
        Back,
        Bottom,
        Right,
        Left
    }
}
