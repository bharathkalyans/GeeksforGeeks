import java.util.ArrayDeque;
import java.util.Queue;
public class GenerateNumbersWithGivenDigit {

    public static void generateDigits(int n,String a,String b){
        Queue<String> q=new ArrayDeque<>();
        q.add(a);q.add(b);
        for (int count=0;count<n;count++){
           String s=q.poll();
            System.out.print(s+" ");
           q.add(s+a);
           q.add(s+b);

        }

    }

    public static void main(String[] args) {
        generateDigits(10,"5","6");
    }
}
