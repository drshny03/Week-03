package com.tit.day01.linkedlist.doublylinkedlist.undoredo;

public class TextEditorMain {


    private TextEditorNode head, tail, current;
    private final int historyLimit;
    private int size;

    public TextEditorMain(int historyLimit) {
        this.historyLimit = historyLimit;
        this.head = this.tail = this.current = null;
        this.size = 0;
    }

    // Add new text state
    public void addState(String newState) {
        TextEditorNode newNode = new TextEditorNode(newState);

        if (current != null) {
            current.next = newNode;
            newNode.prev = current;
        } else {
            head = newNode;
        }

        current = newNode;
        tail = newNode;

        // Remove any redo history
        newNode.next = null;

        // Enforce history limit
        if (size == historyLimit) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        } else {
            size++;
        }
    }

    // Undo functionality
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("No more states to undo.");
        }
    }

    // Redo functionality
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("No more states to redo.");
        }
    }

    // Display the current state
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current State: " + current.state);
        } else {
            System.out.println("No states available.");
        }
    }

    public static void main(String[] args) {
        TextEditorMain editor = new TextEditorMain(10);

        editor.addState("State 1: Darshan Is Here");
        editor.addState("State 2: Darshan Was Here");
        editor.addState("State 3: Darshan Will Be Here");

        editor.displayCurrentState(); // State 3

        editor.undo();
        editor.displayCurrentState(); // State 2

        editor.undo();
        editor.displayCurrentState(); // State 1

        editor.redo();
        editor.displayCurrentState(); // State 2

        editor.addState("State 4: Hello!");
        editor.displayCurrentState(); // State 4

        editor.redo(); // No more states to redo.
    }
}
