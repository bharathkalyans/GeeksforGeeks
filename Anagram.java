import java.util.Arrays;

public class Anagram {


    static boolean isAnagramNaive(String s1, String s2){

        if(s1.length()!=s2.length())
            return false;

        char[] a=s1.toCharArray();
        char[] b=s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        String A=new String(a);
        String B=new String(b);


        return A.equals(B);

    }//O(NlogN) Time and O((s1+s2).length) Space!!


    static boolean isAnagramEffiecient(String s1, String s2){

        if(s1.length()!=s2.length())
            return false;

        int[] count=new int[256];

        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        for (int i=0;i<256;i++){
            if(count[i]!=0)
                return false;
        }

        return true;
    }//O(N + 256) Time and O(256) Space!! --> You can replace 256 with static final MAZ_SIZE=256;

    public static void main(String[] args) {


        System.out.println(isAnagramEffiecient("funeral","realfun"));
        System.out.println(isAnagramNaive("theeoes","theysee"));

    }
}
