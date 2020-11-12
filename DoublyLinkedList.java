class NodeD{
    int data;
    NodeD prev;
    NodeD  next;
    NodeD(int d){
        this.data=d;
    }
}

class DLList{
    NodeD head;

    public void insertBegin(int x){
        NodeD temp=new NodeD(x);
        if(head==null){
            head=temp;
            return;
        }

        temp.next= head;
        head.prev=temp;
        head =temp;

    }

    public void printList(){
        NodeD temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }


    public void insertEnd(int x){
     NodeD temp=new NodeD(x);
     if(head==null){
         head=temp;
         return;
     }

     NodeD pointer=head;
     while (pointer.next!=null){
         pointer=pointer.next;
     }

     pointer.next=temp;
     temp.prev=pointer;

    }

}



public class DoublyLinkedList {
    public static void main(String[] args) {
        DLList dl=new DLList();

        dl.insertBegin(3);
        dl.insertBegin(2);
        dl.insertBegin(1);
        dl.insertEnd(4);
        dl.insertEnd(5);
        dl.insertBegin(0);
        dl.printList();


    }
}
