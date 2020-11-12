import java.util.Queue;
import java.util.LinkedList;
public class ReverseQueue {

    public static void reverseQueue(Queue<Integer> q){
        /*Naive method is Using a Stack ,pushing all elements and
        * popping it back to the Queue*/

        if(q.isEmpty())
            return;

        int x=q.poll();
        reverseQueue(q);
        q.add(x);

    }

    public static void printQueue(Queue q){
        System.out.println(q);
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        printQueue(q);
        reverseQueue(q);
        printQueue(q);

    }
}
