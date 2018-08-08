//kth to the last element of single linked list

class Question2 {

  Node kthToLast(Node head, int k) {
    Node n1 = head;
    Node n2 = head;
    
    // move n2 to k nodes forward
    for(int i=0; i<k-1;i++) {
      if(n2 == null)
        return null;
      n2 = n2.next;
    }
    
    // there are less then k elements
    if(n2 == null) return null;
    
    // move both nodes together
    while(n2.next != null) {
      n1 = n1.next;
      n2 = n2.next;
    }
    return n1;
  }
}
