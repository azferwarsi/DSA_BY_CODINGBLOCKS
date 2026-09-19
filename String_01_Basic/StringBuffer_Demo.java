package String_01_Basic;

public class StringBuffer_Demo {
  public static void main(String[] args) {
    // StringBuffer sb=new StringBuffer("Azfer");
    // System.out.println(sb.capacity());

    //  StringBuffer sb=new StringBuffer();
    // System.out.println(sb.capacity());  // 16+ string length

    // sb.append("bye");
    // System.out.println(sb.capacity());


    StringBuffer sb=new StringBuffer("Deepak java");
    // StringBuffer sb2=new StringBuffer("Deepak java");
    // StringBuffer sb3=sb.append("hi");
    // System.out.println(sb.length());
    // System.out.println(sb.append(" hi"));
    // System.out.println(sb.charAt(3));
    // System.out.println(sb.delete(2, 5));
    // System.out.println(sb.deleteCharAt(3));
    // System.out.println(sb.equals(sb2));
    // System.out.println(sb.equals(sb3));
    System.out.println(sb.indexOf("k"));
    System.out.println(sb.lastIndexOf("a"));
    System.out.println(sb.insert(5, "kumar"));
    System.out.println(sb.replace(0, 6, "Azfer"));
    System.out.println(sb.reverse());

  }
}
