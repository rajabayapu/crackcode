
public class question1
{
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int d = in.nextInt();
    Node head = new Node(d);
    for(int i=0; i<4; i++)
    {
      d = in.nextInt();
      head.appendToTail(d);
    }
    if(!checkDuplicate(head))
      System.out.println("Not duplicated");
    else
      System.out.println("Duplicate");
  }

  static boolean checkDuplicate(Node head)
  {
    HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
    int i=0;
    while(head!=null)
    {
      if(hm.get(head.data)!=null)
        return true;
      else{
        hm.put(head.data, i);
        System.out.println(hm.get(head.data)+" "+head.data);
        i++;
      }
      head = head.next;
    }
    return false;
  }

}
