package String_01_Basic;

public class UpeerCaseOrLowerCase {
  public static void main(String[] args) {
    //character is uppercase or not
    char ch='A';
    if(ch>='A' && ch<='z'){
      System.out.println("Uppercase alphabet");
    
    }
    else{
      System.out.println("Not uppercase ");
    }

    String str="Azfer";
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());
  }
}
