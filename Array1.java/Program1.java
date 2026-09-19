public class Program1 {
  public static void main(String[] args) {
  
    //array method 1
    char ch[]={'a','b','c'};
  System.out.println(ch[1]);

  //method 2
  int arr[]=new int[3];
  arr[0]=1;
  arr[1]=2;
  arr[2]=3;
  System.out.println(arr[1]);  
  
  //method 3 using loop
  int arr2[]={2,3,4,5,6};
  for(int i=0;i<arr2.length;i++){
    System.out.print(arr2[i]+" ");
  }
  

  }
}
