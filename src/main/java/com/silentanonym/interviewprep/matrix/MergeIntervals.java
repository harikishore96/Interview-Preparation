package com.silentanonym.interviewprep.matrix;

import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {

  public int[][] merge(int[][] intervals) {
    if (intervals.length <= 1) {
      return intervals;
    }
    int[][] mergedIntervals = new int[intervals.length][2];

    Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
    int p1 = 0, k = 0;
    mergedIntervals[k] = intervals[p1];
    while (p1 < intervals.length) {
      int[] pair = intervals[p1];

      if (mergedIntervals[k][1] >= pair[0]) {
        mergedIntervals[k] = new int[]{Math.min(mergedIntervals[k][0], pair[0]),
            Math.max(mergedIntervals[k][1], pair[1])};
      } else {
        mergedIntervals[++k] = pair;
      }
      ++p1;
    }

    return Arrays.copyOfRange(mergedIntervals, 0, k + 1);
  }
}
