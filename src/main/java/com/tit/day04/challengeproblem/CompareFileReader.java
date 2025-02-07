package com.tit.day04.challengeproblem;

import java.io.*;
import java.util.StringTokenizer;

public class CompareFileReader {

    public static void compareFileReading(String filePath) {
        try {
            // Using FileReader
            long startTime = System.nanoTime();
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int wordCount = countWords(bufferedReader);
            long endTime = System.nanoTime();
            System.out.println("FileReader word count: " + wordCount);
            System.out.println("FileReader time: " + (endTime - startTime)  + " ms");
            bufferedReader.close();
            fileReader.close();

            // Using InputStreamReader
            startTime = System.nanoTime();
            FileInputStream fileInputStream = new FileInputStream(filePath);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
            wordCount = countWords(bufferedReader2);
            endTime = System.nanoTime();
            System.out.println("InputStreamReader word count: " + wordCount);
            System.out.println("InputStreamReader time: " + (endTime - startTime)  + " ms");
            bufferedReader2.close();
            inputStreamReader.close();
            fileInputStream.close();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    private static int countWords(BufferedReader reader) throws IOException {
        int wordCount = 0;
        String line;
        while ((line = reader.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(line);
            wordCount = wordCount+ tokenizer.countTokens();
        }
        return wordCount;
    }
}
