public class Cylinder {
    double radius , height, vol;
    public void input(double r , double h) {
        radius = r; 
        height = h;
    }
    public double vol() {
        vol = 3.14*height*radius;
        return vol;
    }
}
