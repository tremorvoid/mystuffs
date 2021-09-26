

public class Computevol {
    double tv;
    public void Addvol(Box v1, Cylinder v2) {
        Computevol output = new Computevol();
        output.tv = v1.vol()+v2.vol();
        System.out.println("Total volume " +output.tv );
    }
     public static void main(String[] args) {
      Box b = new Box();
      Cylinder c = new Cylinder();
      Computevol cv = new Computevol();
      b.input(1,1,1);
      c.input(1, 1);
      cv.Addvol(b, c);
     }
}
