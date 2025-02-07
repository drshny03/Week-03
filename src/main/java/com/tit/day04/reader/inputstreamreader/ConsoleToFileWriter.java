package com.tit.day04.reader.inputstreamreader;
import java.io.*;

import static java.lang.System.err;
import static java.lang.System.out;

public class ConsoleToFileWriter {


    public static void main(String[] args) {
         String filePath = "C:\\capgeminitraining\\Week-3\\Data Structure\\src\\main\\java\\com\\tit\\day04\\reader\\filereader\\textfile.txt";
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            inputStreamReader = new InputStreamReader(System.in);
            bufferedReader = new BufferedReader(inputStreamReader);
            fileWriter = new FileWriter(filePath, false);
            bufferedWriter = new BufferedWriter(fileWriter);

            out.println("Enter text (type 'exit' to stop):");

            String line;
            while (!(line = bufferedReader.readLine()).equalsIgnoreCase("exit")) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            out.println("Text has been written to " + filePath);
        } catch (IOException e) {
            err.println(e.getMessage());
        } finally {
            try {
                if (bufferedWriter != null) bufferedWriter.close();
                if (fileWriter != null) fileWriter.close();
                if (bufferedReader != null) bufferedReader.close();
                if (inputStreamReader != null) inputStreamReader.close();
            } catch (IOException e) {
                err.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}
