package com.tit.day02.stackandqueue.circulartour;

public class CircularTourMain {


    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        CircularTour tour = new CircularTour();
        int start = tour.findStartingPoint(petrol, distance);

        System.out.println(start == -1 ? "No possible tour" : "Start at petrol pump: " + start);
    }
}
