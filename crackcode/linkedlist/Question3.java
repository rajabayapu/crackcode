// delete a node from single linked list, given access to only that node
pubic class Question3
{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int d = in.nextInt();
    Node head = new Node(d);
    for(int i=0; i<3; i++)
    {
      d = in.nextInt();
      head.appendToTail(d);
    }
    deleteNode(head);
  }
  
  void boolean deleteNode(Node n) {
    if(n == null || n.next == null) {
      return false;
    }
    
    Node next = n.next;
    n.data = next.data;
    n.next = next.next;
    return true;
  }
}
