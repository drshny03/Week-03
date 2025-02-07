package com.tit.day04.stringbufferandbuilder.stringbuffer;

public class Compare {

    public Compare()
    {}

    public long bufferPerformance()
    {
            String string = "Darshan is Here";
            StringBuffer stringBuffer = new StringBuffer();

            long startTime = System.nanoTime();
            for(int i = 0; i<1000000; i++)
             {
                  stringBuffer.append(string);
             }
            long endTime =  System.nanoTime();
            return  endTime-startTime;
    }

    public long builderPerformance()
    {
        String string = "Darshan is Here";
        StringBuilder stringBuilder = new StringBuilder();

        long startTime = System.nanoTime();
        for(int i = 0; i<1000000; i++)
        {
            stringBuilder.append(string);
        }
        long endTime =  System.nanoTime();
        return  endTime-startTime;
    }

}
