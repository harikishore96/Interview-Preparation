package com.silentanonym.interviewprep.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindCenterOfStarGraphTest {

  FindCenterOfStarGraph findCenterOfStarGraph = new FindCenterOfStarGraph();

  @Test
  void findCenter() {
    int[][] edges = {
        {1, 2}, {2, 3}, {4, 2}
    };
    Assertions.assertEquals(2, findCenterOfStarGraph.findCenter(edges));

    int[][] edges1 = {
        {1, 2}, {5, 1}, {1, 3}, {1, 4}
    };
    Assertions.assertEquals(1, findCenterOfStarGraph.findCenter(edges1));
  }

  @Test
  void findCenter1() {
    int[][] edges = {
        {1, 2}, {2, 3}, {4, 2}
    };
    Assertions.assertEquals(2, findCenterOfStarGraph.findCenter1(edges));

    int[][] edges1 = {
        {1, 2}, {5, 1}, {1, 3}, {1, 4}
    };
    Assertions.assertEquals(1, findCenterOfStarGraph.findCenter1(edges1));
  }
}
