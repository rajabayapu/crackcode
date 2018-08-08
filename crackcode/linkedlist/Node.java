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
 
 void output() {
    Node temp = this;
    while(temp!=null)
    {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }
}
