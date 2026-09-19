package String_01_Basic;

public class PalindromeOrNot {
  public static void main(String[] args) {
    String str="madam";
    String rev="";
    int n=str.length();
    for(int i=n-1;i>=0;i--){
      rev=rev+str.charAt(i);
    }
    if(str.equals(rev)){
      System.out.println("String is palindrome");
    }
    else{
      System.out.println("String is not palindrome");
    }
  }
}
