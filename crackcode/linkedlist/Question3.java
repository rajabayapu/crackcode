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
    System.out.println();
    //head.output();
    head.del();
    head.output();
    //System.out.println();
    //head.output();
    //del(head);
    //System.out.println();
    //head.output();
  }
  
  void del()
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
        //System.out.println(slow.data+" "+fast.data);
    }
    prev.next = slow.next;
  }
}
