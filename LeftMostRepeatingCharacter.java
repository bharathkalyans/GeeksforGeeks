import java.util.Arrays;

public class LeftMostRepeatingCharacter {


    public static int leftMost(String str){

        int res=-1;
        int n=str.length();

        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if(str.charAt(i)==str.charAt(j))
                    return i;
            }
        }
        return res;
    }

    public static int leftmostEff(String str){

        int n=str.length();

        int res=Integer.MAX_VALUE;
        int [] fIndex=new int[256];

        Arrays.fill(fIndex,-1);
        for (int i=0;i<n;i++){
            int fi=fIndex[str.charAt(i)];

            if(fi==-1){
                fIndex[str.charAt(i)]=i;
            }else{
                res=Math.min(res,fi);
            }

        }
        return (res==Integer.MAX_VALUE)?-1:res;
    }


    public static void main(String[] args) {
        String name="geeksforgeeks";
        System.out.println(leftMost(name));
        System.out.println(leftMost("abcd"));
        System.out.println(leftmostEff(name));
        System.out.println(leftmostEff("abcd"));
    }
}
