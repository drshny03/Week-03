package com.tit.day04.stringbufferandbuilder.stringbuilder;

public class ReverseString {

    //constructor
    public ReverseString(){}

    //method to reverse a string
    public String reverseString(StringBuilder stringBuilder){
        //reverse stringp







        stringBuilder.reverse();
        //return reverse string
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        //create a object of string builder
        StringBuilder stringBuilder = new StringBuilder();
        //append string to string builder
        stringBuilder.append("Darshan");
        stringBuilder.append(" Yadav");

        ReverseString reverseObject = new ReverseString();
        //reverse string
        String reversedString = reverseObject.reverseString(stringBuilder);
        System.out.println(reversedString);
    }

}
