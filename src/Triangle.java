
public class Triangle {
        private double base;
    private double height;
    public Triangle(double base, double height)
    {
        this.base=base;
        this.height=height;
    }
    
    
    
    
     public double getArea() {
      return 0.5*base*height;
   }
   public String toString() {
      return "Triangle[base=" + base + ",height=" + height + "]";
   }
}
