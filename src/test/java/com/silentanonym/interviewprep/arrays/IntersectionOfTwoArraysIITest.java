package com.silentanonym.interviewprep.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class IntersectionOfTwoArraysIITest {

    IntersectionOfTwoArraysII intersectionOfTwoArraysII = new IntersectionOfTwoArraysII();

    @Test
    void intersect() {
        // Expected output : [2,2]
        int[] actualOutput = intersectionOfTwoArraysII.intersect(new int[]{1,2,2,1}, new int[]{2,2});
        System.out.println(Arrays.toString(actualOutput));
        // Expected output : [4,9] / [9,4]
        actualOutput = intersectionOfTwoArraysII.intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4});
        System.out.println(Arrays.toString(actualOutput));
    }

    @Test
    void intersect1() {
        // Expected output : [2,2]
        int[] actualOutput = intersectionOfTwoArraysII.intersect1(new int[]{1,2,2,1}, new int[]{2,2});
        System.out.println(Arrays.toString(actualOutput));
        // Expected output : [4,9] / [9,4]
        actualOutput = intersectionOfTwoArraysII.intersect1(new int[]{4,9,5}, new int[]{9,4,9,8,4});
        System.out.println(Arrays.toString(actualOutput));
    }

    @Test
    void intersect2() {
        // Expected output : [2,2]
        int[] actualOutput = intersectionOfTwoArraysII.intersect2(new int[]{1,2,2,1}, new int[]{2,2});
        System.out.println(Arrays.toString(actualOutput));
        // Expected output : [4,9] / [9,4]
        actualOutput = intersectionOfTwoArraysII.intersect2(new int[]{4,9,5}, new int[]{9,4,9,8,4});
        System.out.println(Arrays.toString(actualOutput));
    }
}