public class Box {
    double len, breadth, height,vol;
    public void input(double l, double b,double h) {
      len =  l  ;
        breadth =b;
         height =h;
    }
    public double vol() {
        vol = len*breadth*height;
        return vol;
    }
    
}
