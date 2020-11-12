import java.util.Stack;

public class ReverseWordsinAString {



    /**
     We can use a Stack as  Naive Approach!!
     1->Create a Stack.
     2->Push all the Words into it.
     3->Print the Word while popping!!
     **/


    public static void reverseusingStack(String me){

        String  [] str=me.split(" ");
        Stack stack=new Stack();

        for (int i=0;i<str.length;i++){
            stack.push(str[i]);
        }

        for (int i=0;i<str.length;i++){
            System.out.print(stack.pop()+" ");
        }
        System.out.println();
    }

    public static void reverse(char[] str){

        int n=str.length;
        int start=0;
        for (int end=0;end<n;end++){
            if(str[end]==' '){
                reverseMe(str,start,end-1);
                start=end+1;
            }
        }
        reverseMe(str,start,n-1);
        reverseMe(str,0,n-1);

    }


    public static void reverseMe(char[] str,int low,int high){
        while (low<=high){
            swap(str,low,high);
            low++;
            high--;
        }
    }

    public static void swap(char[]str,int low,int high){
        char temp=str[low];
        str[low]=str[high];
        str[high]=temp;
    }

    public static void main(String[] args) {
        String name="Welcome to GeeksforGeeks";
        char str[]=name.toCharArray();
        reverse(str);
         String newname=new String(str);
        System.out.println("\""+newname+"\"");
//        for (char x:str){
//            System.out.print(x+"");
//        }

    }
}
