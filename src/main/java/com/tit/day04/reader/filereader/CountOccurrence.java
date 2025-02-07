package com.tit.day04.reader.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.System.out;

public class CountOccurrence {

    public static void main(String ar []) {
        String filePath = "C:\\capgeminitraining\\Week-3\\Data Structure\\src\\main\\java\\com\\tit\\day04\\reader\\filereader\\textfile.txt";
        int count =0;

        String targetWord = "and";
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null)
            {

              String [] words  = line.split(" ");

              for (int i= 0; i<words.length; i++) {
                    if (words[i].equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }

            }
            out.println("The Word \""+targetWord+ "\" Appears "+ count+" Times");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
