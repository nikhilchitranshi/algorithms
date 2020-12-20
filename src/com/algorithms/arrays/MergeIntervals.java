package com.algorithms.arrays;

import java.util.ArrayList;

public class MergeIntervals {

	public static void main(String[] args) {
		ArrayList<Interval> intervals = new ArrayList<Interval>();
		
//		intervals.add(new Interval(1,2));
//		intervals.add(new Interval(3,5));
//		intervals.add(new Interval(6,7));
//		intervals.add(new Interval(8,10));
//		intervals.add(new Interval(12,16));
//		
//		
//		System.out.println(mergeIntervals(intervals, new Interval(4,9)));
		
		
//		intervals.add(new Interval(1,3));
//		intervals.add(new Interval(6,9));
//		
//		System.out.println(mergeIntervals(intervals, new Interval(2,5)));
		
		intervals.add(new Interval(1,2));
		intervals.add(new Interval(4,5));
		intervals.add(new Interval(6,7));
		intervals.add(new Interval(10,11));
		
		System.out.println(mergeIntervals(intervals, new Interval(3,9)));
		
	}

	private static ArrayList<Interval> mergeIntervals(ArrayList<Interval> intervals, Interval newInterval) {
        
        

        
        if(newInterval.end - newInterval.start <0 ) {
            newInterval = new Interval(newInterval.end, newInterval.start);
        }
        
        
        // If the interval is to be inserted at start    
        if(intervals.size() ==0 || (newInterval.end < intervals.get(0).start && intervals.size() > 0)) {
            intervals.add(0, newInterval);
        
        //  If the interval is to be inserted at end
        }else if(newInterval.start > intervals.get(intervals.size()-1).end  && intervals.size() > 0) {
            intervals.add(intervals.size(), newInterval);
        
        }else if(newInterval.start <= intervals.get(0).start && newInterval.end >= intervals.get(intervals.size()-1).end){
            intervals.removeAll(intervals);
            intervals.add(newInterval);
        
        }else {    
            int prevIndex = -1;
            int nextIndex = -1;
            int prevMergeIntervalIndex = -1;
            int nextMergeIntervalIndex = -1;
            int newInsertionSpot=-1;
            
            for (int i = 0; i < intervals.size(); i++) {

                Interval interval = intervals.get(i);

                if (newInterval.start > interval.start && newInterval.start < interval.end) {
                    prevMergeIntervalIndex = i;
                }

                if (newInterval.end > interval.start && newInterval.end < interval.end) {
                    nextMergeIntervalIndex = i;
                }
                
                
                if(i < intervals.size()-1  && (newInterval.start > interval.end && newInterval.end < intervals.get(i+1).start)) {
                    newInsertionSpot = i;
                }
                
                if(newInterval.start > interval.end) {
                		prevIndex = i;
                }
                
                if(newInterval.end < interval.start) {
                		nextIndex = i;
                }

            }

            if(newInsertionSpot != -1) {
                intervals.add(newInsertionSpot+1, newInterval);
            
            
            }else if (prevMergeIntervalIndex != -1 && nextMergeIntervalIndex != -1) {

                intervals.subList(prevMergeIntervalIndex+1, nextMergeIntervalIndex).clear();
                
                Interval mergedInterval = new Interval(intervals.get(prevMergeIntervalIndex).start, intervals.get(prevMergeIntervalIndex+1).end);

                intervals.remove(prevMergeIntervalIndex);
                intervals.add(prevMergeIntervalIndex, mergedInterval);
                intervals.remove(prevMergeIntervalIndex+1);

            }else if (prevMergeIntervalIndex == -1 && nextMergeIntervalIndex != -1) {
                
                Interval mergedInterval = new Interval(newInterval.start, intervals.get(nextMergeIntervalIndex).end);
                intervals.remove(nextMergeIntervalIndex);
                intervals.add(nextMergeIntervalIndex,mergedInterval);
                
            }else if(prevIndex!=-1 && nextIndex!=-1) {
            		intervals.subList(prevIndex+1, nextIndex).clear();
            		intervals.add(prevIndex+1,newInterval);
            }

                    
        }
        return intervals;
        
    
    }
	
}

class Interval{
	int start;
	int end;
	
	Interval() { start = 0; end = 0; }
	Interval(int s, int e) { start = s; end = e; }
	@Override
	public String toString() {
		return "Interval [start=" + start + ", end=" + end + "]";
	}
	
	
}