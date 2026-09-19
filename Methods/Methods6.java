package Methods;

public class Methods6 {
  public static void main(String[] args) {
    System.out.println("The area of circle is"+AreaOfCircle(8));
    System.out.println("The area of circle is"+AreaOfCircle(9.8));
  }

  public static double AreaOfCircle(double radius){
    double pi=3.14;
    double area=pi*radius*radius;
    return area;

  }
}
