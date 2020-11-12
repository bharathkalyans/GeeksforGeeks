import java.util.*;

    class Interval{
        int start,end;
        Interval(int start,int end){
            this.start=start;
            this.end=end;
        }
    }

    public class MergeOverLapping {

        public void mergeOverLapping(Interval[] arr){
            Arrays.sort(arr, new Comparator<Interval>() { //Implementing Comparator Function
                @Override
                public int compare(Interval o1, Interval o2) {
                    return o1.start -o2.start;
                }
            });
            for (Interval interval : arr) {
                System.out.print(interval.start + " " + interval.end);
                System.out.println();
            }


            int index=0;

            for (int i=1; i<arr.length; i++)
            {

                if (arr[index].end >=  arr[i].start)
                {
                    arr[index].end = Math.max(arr[index].end, arr[i].end);
                    arr[index].start = Math.min(arr[index].start, arr[i].start);
                }
                else {
                    index++;
                    arr[index] = arr[i];
                }
            }

            System.out.print("The Merged Intervals are: ");
            for (int i = 0; i <= index; i++)
            {
                System.out.print("[" + arr[i].start + ","
                        + arr[i].end + "]");
            }
        }
        //Driver Function
    public static void main(String[] args){
        Interval [] a=new Interval[4];
        a[0]=new Interval(1,3);
        a[1]=new Interval(5,7);
        a[2]=new Interval(2,4);
        a[3]=new Interval(10,12);
        MergeOverLapping m=new MergeOverLapping();
        m.mergeOverLapping(a);
    }

}
