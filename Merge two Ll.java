/*
class Node{
  int data;
  Node next;
  
  Node(int data){
    this.data = data;
    this.next = null;
  }
}
*/
class Solution{
    public Node mergeTwoLinkedList(Node a,Node b){
     
     Node temp =new Node(0);
     Node curr=temp;
  //   System.out.println(temp.data);
  
  if(a==null)     return b;
  if(b==null)     return a;
  
  
  while(a !=null && b!=null){
      
      if(a.data>b.data){
          curr.next=b;
          curr=curr.next;
          b=b.next;
      }else{
          curr.next=a;
          curr=curr.next;
          a=a.next;
      }
      
  }
  
  if(a==null){
      curr.next=b;
      
  }else{
      curr.next=a;
  }
  
     return temp.next;
    }
  }
  