package String_01_Basic;

public class SplitMethod {
  public static void main(String[] args) {
    String str="This is java string class ";
    String arr[]=str.split(",");
    
    for(String s:arr){
      System.out.println(s);
    }
  }
}
