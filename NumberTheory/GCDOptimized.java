public class GCDOptimized {
  public static void main(String[] args) {
    int a=3,b=17;
    while(b!=0){
      int temp=b;
      b=a%b;
      a=temp;

    }
    System.out.println("gcd:"+a); 
  }
}
