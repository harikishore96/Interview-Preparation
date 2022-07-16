package com.silentanonym.interviewprep.matrix;

import org.junit.jupiter.api.Test;

class MergeIntervalsTest {

  MergeIntervals mergeIntervals = new MergeIntervals();

  @Test
  void merge() {
    System.out.println("Test Case 1:");
    int[][] intervals = {
        {1, 3},
        {2, 6},
        {8, 10},
        {15, 18}
    };
    int[][] mergedIntervals = mergeIntervals.merge(intervals);
    MatrixUtil.print(mergedIntervals);

    System.out.println("Test Case 2:");
    int[][] intervals1 = {
        {1, 4},
        {4, 5}
    };
    int[][] mergedIntervals1 = mergeIntervals.merge(intervals1);
    MatrixUtil.print(mergedIntervals1);

    System.out.println("Test Case 3:");
    intervals = new int[][]{
        {1, 3}
    };
    mergedIntervals = mergeIntervals.merge(intervals);
    MatrixUtil.print(mergedIntervals);

    System.out.println("Test Case 4:");
    intervals = new int[][]{
        {1, 4},
        {2, 3}
    };
    mergedIntervals = mergeIntervals.merge(intervals);
    MatrixUtil.print(mergedIntervals);

    System.out.println("Test Case 5:");
    intervals = new int[][]{
        {1, 4},
        {0, 2},
        {3, 5}
    };
    mergedIntervals = mergeIntervals.merge(intervals);
    MatrixUtil.print(mergedIntervals);

    System.out.println("Test Case 6:");
    intervals = new int[][]{
        {1, 4},
        {4, 5}
    };
    mergedIntervals = mergeIntervals.merge(intervals);
    MatrixUtil.print(mergedIntervals);
  }
}
