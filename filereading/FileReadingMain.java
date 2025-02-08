package com.tit.day06.runtimeanalysis.filereading;

import java.io.FileReader;

import static java.lang.System.out;

public class FileReadingMain {
    public static void main(String[] args)
    {
        //create object of reader class
        FileReading reader = new FileReading();
        long startTime;
        long endTime;
        long totalTime;

        //get performance of file reader
        startTime = System.nanoTime();
        reader.readUsingFileReader();
        endTime = System.nanoTime();

        totalTime = endTime-startTime;
        out.println("time taken by file reader in millisecond - " + totalTime/1e6);

        //get performance of file reader
        startTime = System.nanoTime();
        reader.readUsingInputStreamReader();
        endTime = System.nanoTime();

        totalTime = endTime-startTime;
        out.println("time taken by input stream reader in millisecond - " + totalTime/1e6);

    }

}
