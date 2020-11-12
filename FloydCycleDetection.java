/**
 * Detecting a Cycle in A LinkedList!!
 * -->O(n^2)
 *      use two loops one outer loop as curr_head and inner loop always as Head
 *      and if you find and curr_head.next in inner loop just return.....
 *
 * -->O(N)
 *      Maintain a boolean variable in the Node itself,so whenver you use a node make it true
 *      and if you see a node with true it means you are in a cycle!!! and return true;
 *
 * -->O(n) and O(n)
 *     Use a HashSet and push the Address of each node if it is not there or else just return !!
 *
 *
 * -->O(n)
 *  USe a temp Node and making all other nodes pointing to it!!
 *
 *  boolean isAlooP(Node head){
 *      Node temp=new Node;
 *      Node curr=head;
 *
 *      while(curr!=null){
 *          if(curr.next==null)
 *              return false;
 *          if(curr.next==temp)
 *              return true;
 *
 *           Node curr_next=curr.next;
 *           curr.next=temp;
 *           curr=curr_next;
 *
 *      }
 *      return false;
 *  }
 *
 *
 *
 *
 *
 *
 * --Use Floyd Detection Cycle---
 *  Snippet is Below
 *
 *  boolean isALoop(Node head){
 *      Node slow=head,fast=head;
 *      while(!fast && !fast.next){
 *          slow=slow.next;
 *          fast=fast.next.next;
 *
 *          if(slow==fast)
 *          return true;
 *      }
 *      return false;
 *  }
 *
 *
 * ----->>>Detect and remove the Loop in the LinkedList
 *
 * public void detectAndRemoveLoop(Node head){
 *     Node slow=head,fast=head;
 *     int count=0;
 *     while(!fast && !fast.next){
 *         slow=slow.next;
 *         fast=fast.next.next;
 *         if(slow==fast)
 *          break;
 *     }
 *
 *     if(slow!=fast)
 *         return false;
 *
 *      slow=head;
 *      while(slow.next!=fast.next){
 *          slow=slow.next;
 *          fast=fast.next;
 *          count++;
 *      }
 *     System.out.println(count);
 * }
 *
 *
 *
 *
 *
 *
 * **/
/*
*
*1. Additional Questions are detect the elements in a Loop
* 2.Detect the first Element in the Loop!!
*
* */