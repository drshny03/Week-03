package com.tit.day04.stringbufferandbuilder.stringbuffer;

import static java.lang.System.out;

public class ConcatenateStrings {

    public ConcatenateStrings()
    {}
    public static String concatenateString(String [] stringArray)
    {
        StringBuffer stringBuffer = new StringBuffer();

        for(int i =0; i< stringArray.length; i++)
        {
            stringBuffer.append(stringArray[i]);
        }
        return stringBuffer.toString();
    }

    public static void main(String ar[])
    {
          String [] stringArray = {"Hey, Darshan Is Here"," 111IT211034"," TIT"," Bhpal"};
          out.println("Concatenated String: "+concatenateString(stringArray));

    }
}
