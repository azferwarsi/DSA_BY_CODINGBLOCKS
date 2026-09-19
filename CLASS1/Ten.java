package CLASS1;

public class Ten {
  public static void main(String[] args) {

    // greatest among 3 numbers using ternaray operator 
    int a=10,b=5,c=90;
    int greatest=(a>b)?((a>c)?a:c):((b>c)?b:c);
    System.out.println(greatest);
  }
}
