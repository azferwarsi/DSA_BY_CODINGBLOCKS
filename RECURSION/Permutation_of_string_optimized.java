package RECURSION;

public class Permutation_of_string_optimized {

  static void permutation(String str, String ans){

    //Base case
    if(str.length()==0){
      System.out.println(ans);
      return;
    }

    //Choose each character one by one
    for(int i=0;i<str.length();i++){
      char curr=str.charAt(i);

      String remaining=str.substring(0, i)+str.substring(i + 1);
      permutation(remaining, ans+curr);
    }

    
  }

  public static void main(String[] args) {
    String str="ABCD";
    permutation(str, "");
  }
}
