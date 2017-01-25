/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size()<=1) return intervals;
        
        List<Interval> res = new LinkedList<>();
        
        Collections.sort(intervals, new Comparator<Interval>(){
		public int compare(Interval i1, Interval i2) {
		    return i1.start - i2.start;
		}
	    }); // sort intervals by its start value
        
        int start=intervals.get(0).start;
        int end=intervals.get(0).end;
        
        for (Interval interval : intervals) {
            // since we've already sort the intervals by start
            // this can tell us if current interval overlap with [start, end] or not
            if (end>=interval.start) { 
                end=Math.max(end, interval.end);
            }
            else {
                res.add(new Interval(start, end));
                start=interval.start;
                end=interval.end;
            }
        }
        // add the last [start, end] interavl
        res.add(new Interval(start, end));
        return res;
    }
}