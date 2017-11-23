
public class Line{
    private int bX;
    private int bY;
    private int eX;
    private int eY;
    Point bP = new Point(bX,bY);
    Point eP = new Point(eX,eY);
    public Line (int nbX,int nbY,int neX,int neY)//new beggining x and new beggining y, new end x and new end y 
    {
        bX=nbX;
        bY=nbY;
        eX=neX;
        eY=neY;        
    }
    public Line(int point1[], int point2[])
    {
       bP.setXY(point1[0],point1[1]);
       eP.setXY(point2[0],point2[1]);
    }
    public int[] getBegin()
    {           
        return    bP.getXY();     
    }
    public void setBegin(int newBegin[])
    {
        bP.setXY(newBegin[0],newBegin[1]);
    }
    public int[] getEnd()
    {           
        return    eP.getXY();     
    }
    public void setEnd(int newEnd[])
    {
        eP.setXY(newEnd[0],newEnd[1]);
    }
    public int getbX()
    {
        return bX;
    }
    
    public int getbY()
    {
        return bY;
    }
    public void setbX(int newbX)
    {
      bX= newbX;
    }
        public void setbY(int newbY)
    {
      bY = newbY;
    }
    public int getBeginXY()
    {
        return bP.getX() + bP.getY();
    }
    public void setBeginXY(int X, int Y)
    {
        bX=X;
        bY=Y;
    }
    public int geteX()
    {
        return eX;
    }
    
    public int geteY()
    {
        return eY;
    }
    public void seteX(int neweX)
    {
      eX= neweX;
    }
        public void seteY(int neweY)
    {
      bY = neweY;
    }
    public int getEndXY()
    {
        return eP.getX() + eP.getY();
    }
    public void setEndXY(int X, int Y)
    {
        eX=X;
        eY=Y;
    }
    public String toString()
    {
        return "Line[begin=("+bX+","+bY+")"+","+"end=("+eX+","+eY+")"+"]";
    }
      
    public double getLenght()
    {
        double distance = Math.sqrt((eX-bX)*(eX-bX) + (eY-bY)*(eY-bY));
        return distance;
    }
    
    
    
    
}
