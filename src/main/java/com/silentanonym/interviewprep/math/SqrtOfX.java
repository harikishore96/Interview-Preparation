package com.silentanonym.interviewprep.math;

public class SqrtOfX {

    public int mySqrt(int x) {
        if (x == 0) return 0;
        long number = 1;
        while (number * number <= x) ++number;
        return (int) (number - 1L);
    }

    // Binary Search
    public int mySqrt1(int x) {
        if (x == 0) return 0;
        if (x == 1) return 1;
        int start = 0, end = x, answer = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid != 0 && mid <= x / mid) {
                answer = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return answer;
    }
}
