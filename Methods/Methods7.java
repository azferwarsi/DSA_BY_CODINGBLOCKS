package Methods;

public class Methods7 {
  public static void main(String[] args) {
    Min(9, 4);
    Min(5,66);
    System.out.println(getRandom());
  }
  public static void  Min(int a,int b){
    System.out.println(Math.min(a,b));
    
  }

  public static int getRandom(){
    return (int) (Math.random()*6+1);
  }
}
