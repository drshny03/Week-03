package com.tit.day01.linkedlist.singlelinkedlist.studentmanagement;



class StudentList {
    private StudentNode head;

    // Add a student at the beginning
    public void addAtBeginning(int rollNumber, String name, int age, String grade) {
        StudentNode newStudent = new StudentNode(rollNumber, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }

    // Add a student at the end
    public void addAtEnd(int rollNumber, String name, int age, String grade) {
        StudentNode newStudent = new StudentNode(rollNumber, name, age, grade);
        if (head == null) {
            head = newStudent;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null) {
                temp = temp.next;
        }
        temp.next = newStudent;
    }

    // Add a student at a specific position
    public void addAtPosition(int rollNumber, String name, int age, String grade, int position) {
        StudentNode newStudent = new StudentNode(rollNumber, name, age, grade);
        if (position == 1) {
            addAtBeginning(rollNumber, name, age, grade);
            return;
        }
        StudentNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }
        newStudent.next = temp.next;
        temp.next = newStudent;
    }

    // Delete a student by roll number
    public void deleteByRollNumber(int rollNumber) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        if (head.rollNumber == rollNumber) {
            head = head.next;
            System.out.println("Record deleted.");
            return;
        }
        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Roll number not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Record deleted.");
        }
    }

    // Search for a student by roll number
    public void searchByRollNumber(int rollNumber) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                System.out.println("Roll Number: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }

    // Display all student records
    public void displayAll() {
        if (head == null) {
            System.out.println("No student records found.");
            return;
        }
        StudentNode temp = head;
        while (temp != null) {
            System.out.println("Roll Number: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }

    // Update a student's grade by roll number
    public void updateGrade(int rollNumber, String newGrade) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                temp.grade = newGrade;
                System.out.println("Grade updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }
}