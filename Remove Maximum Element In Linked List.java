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
  public Node deleteMaximum(Node head){
   
   Node te= head;
   Node motha= head;
   
   Node magcha = null;
   
   while(te!=null){
       if(te.next!=null && te.next.data>=motha.data){
           motha=te.next;
           magcha = te;
       }
       
       te=te.next;
   }
   
   if(motha == head){
       head=head.next;
   }else{
       magcha.next = motha.next;
   }
   return head;
  }
}
