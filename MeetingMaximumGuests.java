import java.util.*;
import java.io.*;

public class MeetingMaximumGuests {

    public int maxGuests(int[] arr,int[] dep){
        Arrays.sort(arr);
        Arrays.sort(dep);

        int i=1,j=0,curr=1,res=1;
        int n=arr.length;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                curr++;
                i++;
            }else {
                curr--;
                j++;
            }
            res=Math.max(res,curr);
        }
        return res;
    }


    public static void main(String args[]){
        int[] arr={700,900,600};
        int[] dep={730,800,1000};
        MeetingMaximumGuests m=new MeetingMaximumGuests();
        System.out.println(m.maxGuests(arr,dep));

    }
}
