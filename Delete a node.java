
const LinkedListNode = class {
    constructor(nodeData) {
        this.data = nodeData;
        this.next = null;
    }
};

// Complete the function below

function deleteNode(head, position) {
    let temp=head;
    let prev = null
 
   if( head===null || head.next===null ){
       return null;
   }else{
       if(position === 0 ){
           head=head.next;
           return head;
       }else if(position == 1){
           temp = head.next;
           head.next=temp.next;
           return head
       }else{
           for(let i=0;i<position;i++){
               prev=temp
               temp=temp.next
           }
           
           if(temp.next==null){
               prev.next=null
               return head
           }else{
               prev.next=temp.next
               return head
           }
       }
   }
}

