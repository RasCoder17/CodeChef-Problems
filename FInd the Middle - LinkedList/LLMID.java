// class Node{
//     int val;
//     Node next;
//     Node(int x){
//     	this.x = val;
//     }
// }

static int getMiddleElement(Node head){
      Node slow = head;
     Node fast = head;
     
     while( slow != null && fast != null && fast.next != null ){
         
         slow = slow.next;
         
         fast = fast.next.next;
         
     }
     
     return slow.val;
     
}