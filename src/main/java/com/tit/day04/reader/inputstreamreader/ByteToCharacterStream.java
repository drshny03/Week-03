package com.tit.day04.reader.inputstreamreader;
import java.io.*;
public class ByteToCharacterStream {


    static String filePath = "C:\\capgeminitraining\\Week-3\\Data Structure\\src\\main\\java\\com\\tit\\day04\\reader\\filereader\\textfile.txt";

    static FileInputStream fileInputStream = null;
    static InputStreamReader inputStreamReader = null;
    static BufferedReader bufferedReader = null;

    public static void main(String[] args) {


        try {
            fileInputStream = new FileInputStream(filePath); // Read binary data
            inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8"); // Convert bytes to characters
            bufferedReader = new BufferedReader(inputStreamReader); // Efficient reading

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } finally {
            try {
                if (bufferedReader != null) bufferedReader.close();
                if (inputStreamReader != null) inputStreamReader.close();
                if (fileInputStream != null) fileInputStream.close();
            } catch (IOException e) {
                System.err.println("Error closing the file: " + e.getMessage());
            }
        }
    }
}

