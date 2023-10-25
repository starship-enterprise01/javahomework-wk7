package homeworkquestions;

public class Qs11 {
 public double input(double x, double y, double z, double w){
  double result = (x*y-y*y)/(z-w);
  return result;
 }

 public static void main(String[] args) {
  Qs11 alpha=new Qs11();
  System.out.println ("Expected Output: " + alpha.input( 25.5, 3.5, 40.5, 4.5));
 }
}
