class Node
{
    int data;
    Node next;

    public void setdata(int data)
    {
        this.data=data;
    }

    public int getdata()
    {
        return data;
    }

    public void setnext(Node next)
    {
        this.next=next;
    }

    public Node getnext()
    {
        return next;
    }
}



public class singlylist {
Node start=null;
  public boolean isempty()
  {
      return start==null;
  }

  public void insertfirst(int val)
  {
      Node n=new Node();
      if(isempty())
      {
          n.setdata(val);
          start=n;
      }
      else
      {
          n.setdata(val);
          n.setnext(start);
          start=n;

      }

  }


  public void insertlast(int val)
  {
      Node n=new Node();
      if(isempty())
      {
          n.setdata(val);
          start=n;
      }

      else
      {
          Node temp=start;
          while(temp.next!=null)
          {
              temp=temp.next;
          }
          temp.setnext(n);
          n.setdata(val);
          n.setnext(null);
      }
  }

  public void deletefirst()
  {
      if(isempty())
      {
          System.out.println("list is empty");
      }

      else
      {
          Node temp=start;
         start=temp.getnext();
          System.out.println("deleted element from first" +" " +temp.getdata());
      }
  }


  public void deletelast()
  {
      if(isempty())
      {
          System.out.println("list is emtpy");
      }
      else
      {
          Node temp=start;
          Node pre=null;
          while(temp.next!=null)
          {
              pre=temp;
              temp=temp.next;
          }
          pre.setnext(null);
          System.out.println("deleted element from last"+ " "+temp.getdata());

      }
  }
  public void display() {
      Node temp = start;
      if (isempty()) {
          System.out.println("list is empty");
      } else {
          while (temp!= null) {
              System.out.print(temp.getdata() + "-->");
              temp = temp.getnext();
          }
          System.out.println("null");
      }
  }

    public static void main(String[] args) {
        singlylist obj=new singlylist();
        System.out.println(obj.isempty());
       obj.insertfirst(5);
        obj.insertfirst(4);
        obj.insertfirst(3);
        obj.insertfirst(2);
        obj.insertfirst(1);
        obj.insertlast(6);
        obj.display();
        obj.deletelast();
        obj.deletefirst();
        obj.display();
        System.out.println(obj.isempty());


    }

}
