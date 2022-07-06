package com.silentanonym.interviewprep.arrays;

public class FindTheHighestAltitude {

  public int largestAltitude(int[] gain) {
    int altitude = 0;
    int maxAltitude = 0;
    for (int i = 0; i < gain.length; i++) {
      altitude += gain[i];
      maxAltitude = Math.max(maxAltitude, altitude);
    }
    return maxAltitude;
  }
}
