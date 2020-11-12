import java.util.Collections.*;

public class Queue {
    int cap,size,front;
    int[] arr;
    Queue(int cap){
        this.cap=cap;
        size=0;
        front=0;
        arr=new int[cap];
    }

    public  boolean isFull(){
        return (size==cap);
    }
    public  boolean isEmpty(){
        return (size==0);
    }

    public  int getFront(){
        if(isEmpty())
            return -1;
        else
            return front;
    }

    public int getRear(){
        if(isEmpty())
            return -1;
        else
            return (front+size-1)%cap;
    }

    public  void enQue(int x){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        int rear=getRear();
        rear=(rear+1)%cap;
        arr[rear]=x;
        size++;
    }


    public void deQue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }

        int front=getFront();
        front=(front+1)%cap;
        arr[front]=-111111;
        size--;
    }


    public void printQue(int[] arr){
        for (int x: arr) {
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue q=new Queue(4);



        q.enQue(1);
        q.enQue(2);
        q.enQue(3);
        q.enQue(4);
        q.deQue();
        q.deQue();
        q.deQue();
        q.deQue();
        q.deQue();

        q.printQue(q.arr);

    }


}
