package com.tit.day04.reader.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.System.out;

public class ReadFileLineByLine {

  public static void main(String ar []) {
      String filePath = "C:\\capgeminitraining\\Week-3\\Data Structure\\src\\main\\java\\com\\tit\\day04\\reader\\filereader\\textfile.txt";

      try {
          FileReader fileReader = new FileReader(filePath);
          BufferedReader bufferedReader = new BufferedReader(fileReader);
          String line;
          while ((line = bufferedReader.readLine()) != null)
          {
             out.println(line);
          }
      } catch (IOException ex) {
          ex.printStackTrace();
      }
  }
}
