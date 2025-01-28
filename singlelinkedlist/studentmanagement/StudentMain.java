package com.tit.day01.linkedlist.singlelinkedlist.studentmanagement;

public class StudentMain {
    public static void main(String[] args) {
        //create student list
        StudentList list = new StudentList();
        //add values
        list.addAtBeginning(34, "Darshan",22 ,"A");
        list.addAtEnd(88, "Rajveer",19 ,"A");
        list.addAtPosition(07, "Aadi",20 ,"B",2);
        list.addAtPosition(01, "Aadarsh",21 ,"C",4);
        list.addAtPosition(18, "Ankit",20 ,"A",3);

        //display list
        list.displayAll();

        //delet student
        list.deleteByRollNumber(19);

        list.displayAll();

        list.deleteByRollNumber(99);

        //search student
        list.searchByRollNumber(88);
        list.searchByRollNumber(99);

        //upgrade grade
        list.updateGrade(1,"B");

        list.displayAll();
    }

}
