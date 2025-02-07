package com.tit.day04.challengeproblem;

public class StringConcatenate {

    public static void compareStringConcatenation() {
        String text = "Darshan Yadav";

        // StringBuffer
        long startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 1000000; i++) {
            stringBuffer.append(text);
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuffer time: " + (endTime - startTime)  + " ms");

        // StringBuilder
        startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            stringBuilder.append(text);
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder time: " + (endTime - startTime)  + " ms");
    }
}
