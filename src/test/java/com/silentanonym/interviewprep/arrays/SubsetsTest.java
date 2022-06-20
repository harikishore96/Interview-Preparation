package com.silentanonym.interviewprep.arrays;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

class SubsetsTest {

    Subsets subsets = new Subsets();

    @Test
    void subsets() {
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(), Arrays.asList(1), Arrays.asList(2),
                Arrays.asList(1,2), Arrays.asList(3), Arrays.asList(1,3), Arrays.asList(2,3), Arrays.asList(1,2,3));
        List<List<Integer>> actual = subsets.subsets(new int[]{1,2,3});
        assertThat(actual, Matchers.containsInAnyOrder(expected.toArray()));

        expected = Arrays.asList(Arrays.asList(), Arrays.asList(0));
        actual = subsets.subsets(new int[]{0});
        assertThat(actual, Matchers.containsInAnyOrder(expected.toArray()));
    }
}
