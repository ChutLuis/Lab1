
public class Point {
    private int x;
    private int y;
    
    public Point (int X, int Y)
    {
        x=X;
        y=Y;
    }
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    public void setX(int newX)
    {
      x= newX;
    }
        public void setY(int newY)
    {
      y= newY;
    }
    public String toString()
    {
        return "("+x+","+y+")";
    }
    public int[] getXY()
    {
        int array1[]={x,y};    
        return    array1;     
    }
    public void setXY(int NewX, int NewY)
    {
        x=NewX;
        y=NewY;
    }
    public double distance(int pX, int pY)
    {
        double distance = Math.sqrt((x-pX)*(x-pX) + (y-pY)*(y-pY));
        return distance;
    }

    public double distanceP(int[] array2)
    {
    
        double distance = Math.sqrt((getXY()[0]-array2[0])*(getXY()[0]-array2[0]) + (getXY()[1]-array2[1])*(getXY()[1]-array2[1]));
        return distance;
    }
    
    public double distanceZero()
    {
        double distance = Math.sqrt((x-0)*(x-0) + (y-0)*(y-0));
        return distance;
    }
    
            
    
    
    
    
}
