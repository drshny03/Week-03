package com.tit.day02.stackandqueue.circulartour;



public class CircularTour {

    public int findStartingPoint(int[] petrol, int[] distance) {
        int n = petrol.length;
        int start = 0, deficit = 0, surplus = 0;

        for (int i = 0; i < n; i++) {
            surplus += petrol[i] - distance[i];
            if (surplus < 0) {
                start = i + 1;
                deficit += surplus;
                surplus = 0;
            }
        }
        return (surplus + deficit >= 0) ? start : -1;
    }
}
