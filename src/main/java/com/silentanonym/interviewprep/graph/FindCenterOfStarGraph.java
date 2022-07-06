package com.silentanonym.interviewprep.graph;

public class FindCenterOfStarGraph {

  public int findCenter(int[][] edges) {
    int[] p1 = edges[0], p2 = edges[1];
    if (p1[0] == p2[0] || p1[0] == p2[1]) {
      return p1[0];
    } else if (p1[1] == p2[0] || p1[1] == p2[1]) {
      return p1[1];
    }
    return 0;
  }

  public int findCenter1(int[][] edges) {
    if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
      return edges[0][0];
    } else {
      return edges[0][1];
    }
  }
}
