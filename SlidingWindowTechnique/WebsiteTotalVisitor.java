package SlidingWindowTechnique;

public class WebsiteTotalVisitor {
  public static void main(String[] args) {
    int users[]={100,48,82,57,34,112,65};
    int days=3;

    int windowSum=0;
    for(int i=0;i<days;i++){
      windowSum+=users[i];
    }
    System.out.println("Total no of users visited "+windowSum);

    for(int i=1;i<=users.length-days;i++){
      windowSum=windowSum-users[i-1]+users[i+days-1];
      System.out.println("Total no of users visited "+windowSum);
    }

  }
}
