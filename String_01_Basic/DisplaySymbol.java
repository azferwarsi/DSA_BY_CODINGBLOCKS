package String_01_Basic;

public class DisplaySymbol {
  public static void main(String[] args) {
    // display only symbol in given string

    String str="@abc#123";
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      if(!(ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
        System.out.println(ch);
      }
    }
  }
}
