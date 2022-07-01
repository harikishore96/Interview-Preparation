package com.silentanonym.interviewprep.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumUnitsOnATruckTest {

    MaximumUnitsOnATruck maximumUnitsOnATruck = new MaximumUnitsOnATruck();

    @Test
    void maximumUnits() {
        int[][] boxTypes = {{1, 3}, {2, 2}, {3, 1}};
        Assertions.assertEquals(8, maximumUnitsOnATruck.maximumUnits(boxTypes, 4));

        //  [[5,10],[2,5],[4,7],[3,9]]
        int[][] boxTypes1 = {{5, 10}, {2, 5}, {4, 7}, {3, 9}};
        Assertions.assertEquals(91, maximumUnitsOnATruck.maximumUnits(boxTypes1, 10));
    }

    @Test
    void maximumUnits1() {
        int[][] boxTypes = {{1, 3}, {2, 2}, {3, 1}};
        Assertions.assertEquals(8, maximumUnitsOnATruck.maximumUnits1(boxTypes, 4));

        //  [[5,10],[2,5],[4,7],[3,9]]
        int[][] boxTypes1 = {{5, 10}, {2, 5}, {4, 7}, {3, 9}};
        Assertions.assertEquals(91, maximumUnitsOnATruck.maximumUnits1(boxTypes1, 10));
    }
}
