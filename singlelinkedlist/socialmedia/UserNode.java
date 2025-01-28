package com.tit.day01.linkedlist.singlelinkedlist.socialmedia;

class UserNode {
    int userId;
    String name;
    int age;
    FriendNode friendList; // Linked list to store Friend IDs
    UserNode next;

    public UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendList = null;
        this.next = null;
    }
}
