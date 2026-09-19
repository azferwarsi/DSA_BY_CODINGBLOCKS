package String_01_Basic;

public class DisplayOnlyDigit {
  public static void main(String[] args) {
    String str="abc@123";
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      if(ch>='0' && ch<='9'){
        System.out.print(ch);
      }
    }
  }
}
