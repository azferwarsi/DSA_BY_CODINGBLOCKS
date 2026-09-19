package Doubly_LinkedList;

public class DoublyLinkedlist<T> {
  
  public class DLLNode<T>{
    public T data;
    public DLLNode prev;
    public DLLNode next;

    public DLLNode(T data){
      this.data=data;
      this.prev=null;
      this.next=null;
    }

  }

  public DLLNode head;
  public int size;
  public DoublyLinkedlist(){
    head=null;
  }

  public void insertAtHead(T data){
    DLLNode newNode=
      if(head==null){
        head=newNode;
        return;
      }

      newNode.next=head;
      head.prev=newNode;
      head=newNode;


  }

  public void insertAtIndex(T data,int idx){
      DLLNode temp=head;
      int i=0;
      while(i<idx){
        temp=temp.next;
        i++;
      }
  }

  public void deleteHead(){
      if(head=null){
        return;
      }
  }

  public void deleteAtIndex(T data,int idx){

  }
}
