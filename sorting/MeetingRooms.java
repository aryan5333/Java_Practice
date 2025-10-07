import java.lang.*;
import java.util.*;


 public class MeetingRooms{
    static class Interval{
    public boolean canAttendMetting(int [][]intervals){
        if(intervals==null || intervals.length==0) return true;

        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        for(int i=0;i<intervals.length;i++){
            if(intervals[i-1][1]>intervals[i][0]){
                return false;
            }

        }
        return true;

    }
 }
    public static void main(String[] args) {
        List<Interval>intervals=new ArrayList<>();
        intervals.add(new Interval(0,30));
        intervals.add(new Interval(5,10));
        intervals.add(new Interval(15,20));

        for(Interval interval:intervals){
            System.out.println(interval);

        }

        
    }
 }

