Class Node {
 Node next = null;
 int data;
 
 public Node(int data) {
    this.data = data;
 }
 
 void appendToTail(int d) {
    Node end = new Node(d);
    Node n = this;
    
    while(n.next != null) {
      n = n.next;
    }
    
    n.next = end;
 }
 
   
  
  void deleteNode()
  {
    Node head=this;
    Node fast=head, slow=head;
    Node prev=null;
    while(fast.next!=null)
    {
        prev=slow;
        slow=slow.next;
        fast=fast.next;
        if(fast.next!=null)
          fast=fast.next;
    }
    prev.next = slow.next;
  }
 
 void output() {
    Node temp = this;
    while(temp!=null)
    {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }
}
