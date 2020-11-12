import java.util.ArrayList;

public class MyStack {
    ArrayList<Integer> al=new ArrayList<>();

    public void push(int ele){
        al.add(ele);
    }
    public int pop() throws ArrayIndexOutOfBoundsException{

        int x=al.get(al.size()-1);
        al.remove(al.size()-1);

        return x;
    }

    public int peek(){
        return al.get(al.size()-1);
    }

    public boolean isEmpty(){
        return al.isEmpty();
    }

    public int size(){
        return al.size();
    }

    public void printStack(){
        for (int i=al.size()-1;i>=0;i--){
            System.out.println("| "+al.get(i)+" |");
            System.out.println(" ---");
        }
    }

    public static void main(String[] args) {

        MyStack s=new MyStack();
        try { System.out.println(s.pop()); }catch (Exception ignored){ System.out.println("Stack Underflow"); }
        System.out.println("Size is "+ s.size());
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.printStack();
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println("Size is "+ s.size());
        System.out.println(s.isEmpty());
    }


}
