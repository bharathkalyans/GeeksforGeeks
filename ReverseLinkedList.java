public class ReverseLinkedList {

    /*   public static Node reverseLL(Node head){

        Node curr=head,prev=null;

        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    return head;

    }*/
    /*  public void  reverseLL(Node head){
        Stack<Integer> al=new Stack();

        Node curr;
        for(curr=head;curr!=null;curr=curr.next){
            al.push(curr.data);
        }
        System.out.println(al);
        curr=head;
        for (curr=head;curr!=null;curr=curr.next){
            curr.data=al.pop();
        }

    }*/


}
