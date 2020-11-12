import java.util.Arrays;

public class LeftMostNonRepeatingCharacter {


    public static int leftMostNon(String str){
        int n=str.length();
        for (int i=0;i<n;i++){
            boolean flag=false;
            for (int j = 0; j<n; j++){
                if (str.charAt(i) == str.charAt(j) && i != j) {
                    flag = true;
                    break;
                }
            }
            if(!flag)
                return i;
        }
        return -1;
    }


    public static int leftmostNonrepEff(String str){
        int n=str.length();
        int [] fIndex=new int[256];
        Arrays.fill(fIndex,-1);

        for (int i=0;i<n;i++){

            int fi= fIndex[str.charAt(i)];
            if(fi==-1){
                fIndex[str.charAt(i)]=i;
            }else{
                fIndex[str.charAt(i)]=-2;
            }
        }
        int res=Integer.MAX_VALUE;
        for (int i=0;i< fIndex.length;i++){
            if(fIndex[i]>=0)
                res=Math.min(res,fIndex[i]);
        }

        return (res==Integer.MAX_VALUE)?-1:res;

    }


    public static void main(String[] args) {

        String name="geeksforgeeks";
        String d="abcd";

        System.out.println(leftMostNon(name));
        System.out.println(leftMostNon("aabbcc"));
        System.out.println(leftmostNonrepEff(name));
        System.out.println(leftMostNon("aabbcc"));
    }
}

