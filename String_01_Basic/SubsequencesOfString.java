package String_01_Basic;

import java.util.Scanner;

public class SubsequencesOfString {

  public static void printIthsubsequence(String str,int idx){
    int len=str.length();
    StringBuilder sb=new StringBuilder();
    while(len>0){
      if((idx & 1)==1){
          sb.insert(0,str.charAt(len-1));
      }
      len--;
      idx=idx>>1;
    }
    System.out.println(sb.toString());
    return;
  }

  public static void Subsequence(String str){
    int n=str.length();
    int totalSubsequences=1<<n;
    for(int i=0;i<totalSubsequences;i++){
      printIthsubsequence(str,i);

    }
    return;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    Subsequence(str);
  }
}
