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
  public Node addTwoLinkedList(Node l1,Node l2) {
    //write your code here.
    Node ans = new Node(0) ;
    Node curr = ans ;
    int c = 0 ;
    
    while(l1!=null || l2!=null || c!=0)
    {
         int x= l1==null? 0:l1.data;
         
         int y= l2==null? 0:l2.data;
         
         int sum=x+y+c;
        curr.next=new Node(sum%10);
          c=sum/10;
        
        curr=curr.next;
        
        l1= l1== null ? null:l1.next;
         l2= l2== null ? null:l2.next;
        
        
    }
    // ans.next=curr;
    return  ans.next;
  }
}
