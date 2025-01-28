package com.tit.day01.linkedlist.doublylinkedlist.undoredo;

public class TextEditorNode {

    String state;
    TextEditorNode prev, next;

    public TextEditorNode(String state) {
        this.state = state;
        this.prev = null;
        this.next = null;
    }
}
