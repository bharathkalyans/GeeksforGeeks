package myNode;

import java.util.ArrayList;
import java.util.Stack;

class Node{
    int data;
    Node next;
    Node(int d){
        this.data=d;
    }
}//Node


class LList{

    Node head;//-->Head of the LL!

    public void insertBegin(int x){
        Node temp=new Node(x);
        temp.next= head;
        head =temp;
    }



    public void insertEnd(int x){
        Node temp=new Node(x);

        if(head==null){
            head=temp;
            return;
        }
        Node pointer=head;
        while(pointer.next!=null)
            pointer=pointer.next;

        pointer.next=temp;
    }

    public void printList(){

        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" --> Address: "+temp);
            temp=temp.next;
        }
    }


}




public class LinkedList {


    public static void main(String[] args) {

        LList l=new LList();
        l.insertBegin(3);
        l.insertBegin(2);
        l.insertBegin(1);
        l.insertEnd(4);
        l.insertEnd(5);
        l.printList();



    }

}
