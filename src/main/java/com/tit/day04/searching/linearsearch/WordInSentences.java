package com.tit.day04.searching.linearsearch;

public class WordInSentences {

    public static void main(String[] args) {

        String[] sentances = {"Success is not about luck; it’s about hard work, consistency, and resilience.",
                "Every challenge you face is an opportunity to grow stronger and smarter.",
                "The journey may be tough, but each step forward brings you closer to your dreams.",
                "Believe in yourself even when no one else does, because your determination defines your future.",
                "Keep pushing, keep learning, and never give up great things"};

        String word  = "your";

        String result = findWord(sentances,word);
        System.out.println("Result : "+result);

    }

    private static String findWord (String []sentences,String word)
    {
        for(int i = 0; i <sentences.length; i++)
        {
            String [] array = sentences[i].split(" ");
            for(int j = 0; j<array.length; j++)
            {
                if(word.equals(array[j]))
                {
                    return sentences[i];
                }
            }
        }
        return "Not Found";
    }

}
