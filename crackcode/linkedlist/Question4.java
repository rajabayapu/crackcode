// partition list based on value
pubic class Question4 {
  
  Node partition(Node n, int x) {
    Node beforeStart = null;
    Node afterStart = null;
    
    while(n != null) {
      Node next = n.next;
      if(n.data < x) {
          n.next = beforeStart;
          beforeStart = n;
      } else {
          n.next = afterStart;
          afterStart = n; 
      }
      n = next;
    }
    
    if(beforeStart == null) {
      return afterStart; 
    }
    
    Node head = beforeStart;
    while(beforeStart.next != null) {
      beforeStart = beforeStart.next;
    }
    beforeStart.next = afterStart;
    return head;
  }
  
}
