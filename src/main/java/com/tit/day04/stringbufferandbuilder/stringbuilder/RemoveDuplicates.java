package com.tit.day04.stringbufferandbuilder.stringbuilder;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
 //constructor
    public RemoveDuplicates(){}
    //method to remove duplicate
    public String removeDuplicate(StringBuilder stringBuilder){
        //create a hashset and stringbuilder
        Set<Character> hashSet = new HashSet<>();
        StringBuilder uniqueString = new StringBuilder();

        //get length
        int length = stringBuilder.length();

        //loop to iterate over string builder
        for(int i=0; i<length; i++){
            char currentChar = stringBuilder.charAt(i);
            if(!(hashSet.contains(currentChar))){
                uniqueString.append(currentChar);
                hashSet.add(currentChar);
            }
        }
        //return unique string
        return uniqueString.toString();
    }


    //main method
    public static void main(String[] args) {
        //create an object of string builder
        StringBuilder stringBuilder = new StringBuilder();
        //append string to string builder
        stringBuilder.append("Darshanshan Yadavdav");

        RemoveDuplicates removeObject = new RemoveDuplicates();
        //remove duplicate
        String uniqueString = removeObject.removeDuplicate(stringBuilder);
        //print orignal string
        System.out.println("orignal string - "+stringBuilder);
        //print  string after removing duplicate character
        System.out.println("After removing duplicate "+uniqueString);
    }


}
