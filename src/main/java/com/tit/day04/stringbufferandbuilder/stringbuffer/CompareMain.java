package com.tit.day04.stringbufferandbuilder.stringbuffer;

import static java.lang.System.out;
public class CompareMain {

    public static void main(String[] args) {
        Compare compare = new Compare();
        long builderTime  = compare.builderPerformance();
        long bufferTime  = compare.bufferPerformance();

        out.println("Time Taken By String Buider : "+ builderTime+
                "\n Time Taken By String Buffer : "+ bufferTime);
    }
}
