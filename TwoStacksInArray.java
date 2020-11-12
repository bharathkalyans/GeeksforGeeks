public class TwoStacksInArray {

    int[] arr;
    int capacity,top1,top2;
    TwoStacksInArray(int x){
        this.capacity=x;
        arr=new int[x];
        top1=-1;
        top2=x;
    }

    public void push1(int x){
        if (top1<top2-1){
            arr[++top1]=x;
            return;
        }
        System.out.println("Overflow");
    }
    public void push2(int x){
        if (top1<top2-1){
            arr[--top2]=x;
            return;
        }
        System.out.println("Overflow");
    }

    public int pop1(){
        if(top1==-1) {System.out.println("Underflow"); return -1;}
        return arr[top1--];
    }
    public int pop2(){
        if(top2==capacity){ System.out.println("Underflow"); return -1;}
        return arr[top2++];
    }


    public void printStacks(){
        for (int j : arr) {
            System.out.print("| "+j + " |");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TwoStacksInArray s=new TwoStacksInArray(6);

        s.push1(1);
        s.push1(2);
        s.push1(3);
        s.push2(1);
        s.push2(2);
        s.push2(3);
        s.printStacks();
        System.out.println(s.pop2());
        s.push1(4);
        s.push2(5);
        s.printStacks();
    }
}
