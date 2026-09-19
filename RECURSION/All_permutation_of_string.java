package RECURSION;

public class All_permutation_of_string {

  public static String swap(String str,int i, int j){
    char[] charr=str.toCharArray();
    char temp=charr[i];
    charr[i]=charr[j];
    charr[j]=temp;

    return String.valueOf(charr);
    // System.out.println(str); 
    // return;

  }

  public static void permute(String str, int i){

    if(i==str.length()){
      System.out.println(str);
      return;
    }
    for(int j=i;j<str.length();j++){
     str= swap(str,i,j);
      permute(str,i+1);
    }
  }

public static void permute(String str){
  permute(str,0);
}
  public static void main(String[] args) {
    String str="abc";
    permute(str);

  }
}
