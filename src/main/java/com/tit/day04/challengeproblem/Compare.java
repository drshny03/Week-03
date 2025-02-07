package com.tit.day04.challengeproblem;

import java.io.*;
import java.util.StringTokenizer;

public class Compare {
    public static void main(String[] args) {

        StringConcatenate stringConcatenate = new StringConcatenate() ;
        stringConcatenate.compareStringConcatenation() ;
        String filePath = "C:\\capgeminitraining\\Week-3\\Data Structure\\src\\main\\java\\com\\tit\\day04\\reader\\filereader\\textfile.txt";

        CompareFileReader compareFileReader = new CompareFileReader();
        compareFileReader.compareFileReading(filePath); // Change this to a valid file path
    }

}
