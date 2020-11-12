import java.util.*;
public class ChainHashing {
    int BUCKET;
    ArrayList<LinkedList<Integer>> al;

    ChainHashing(int b){
        this.BUCKET=b;
        al=new ArrayList<LinkedList<Integer>>();

        for (int i=0;i<b;i++){
            al.add(i,new LinkedList<Integer>());
        }


    }

    void insert(int key){
        int i=key%BUCKET;
     al.get(i).add(key);
    }

    void delete(int key){
        int i=key%BUCKET;
        al.get(i).remove((Integer)key);
    }

    boolean search(int key){
        int i=key%BUCKET;
      return  al.get(i).contains((Integer) key);
    }

    void print(){
        System.out.println(al);
    }
    public static void main(String[] args){

        ChainHashing c=new ChainHashing(7);

        c.insert(50);  c.insert(21);  c.insert(58);
        c.insert(17);  c.insert(15);  c.insert(49);
        c.insert(56);  c.insert(22);  c.insert(23);


        System.out.println(c.search(21));
        c.print();
        System.out.println(c.search(100));
        c.delete(210);
        System.out.println(c.search(21));
        c.print();



    }


}
