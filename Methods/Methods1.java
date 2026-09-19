package Methods;

public class Methods1 {
  public static void main(String[] args) {
    greet();
  }
  public static void greet(){
    System.out.println("Introduction to method in java");
    average(12, 77);
    average(2,7);
  }
  public static int average(int a, int b){
    int c=(a+b)/2;
    
    System.out.println(c);
    return c;
  }
}
