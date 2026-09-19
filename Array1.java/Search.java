import java.util.Scanner;

public class Search {
  public static void main(String[] args) {
    int n;
    int item;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array");
    n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter array element");
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("Enter item to be searcehed");
    item=sc.nextInt();
    for(int i=0;i<n;i++){
      if(a[i]==item){
        System.out.println("Item found at index "+i);
      }
      
    }
    

  }
}
