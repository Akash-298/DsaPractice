public class Add 1 to LL {
    
}
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
    public Node reverse(Node node){
          Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            
        }
        node = prev;
        return node;
    
    }
    
  public Node addOneToLinkedList(Node head){
      if(head==null){
          return head;
      }
      else{
         Node e =head; 
    head = reverse(head);
    Node curr=head;
    while(curr != null){
        if(curr.data==9  && curr.next!=null){
            curr.data=0;
            curr=curr.next;
        }
        else if(curr.data != 9 ){
            curr.data=curr.data+1;
            break;
        }else if(curr.data==9  && curr.next==null){
            
            curr.data= 1;
            Node m =new Node(0);
            
            m.next=head;
            
            head=m;
            
            curr=curr.next;
            
        }
    }
    
    head= reverse(head);
    return head;
  }
  }
}
