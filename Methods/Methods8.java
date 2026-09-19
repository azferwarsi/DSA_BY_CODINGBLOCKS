package Methods;

public class Methods8 {
  public static void main(String[] args) {
    //methods overloading using methods
    AreaOfSquare();
    System.out.println(AreaOfSquare(8));
  }

  public static void AreaOfSquare(){
    int side=9;
    int area=side*side;
    System.out.println(area);
  }
  public static int AreaOfSquare(int s){
      int area1=s*s;
      return area1;

  }
}
