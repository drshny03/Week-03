package com.tit.day01.linkedlist.singlelinkedlist.socialmedia;

public class SocialMediaMain {
    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();

        // Add predefined users
        sm.addUser(1, "Alice", 25);
        sm.addUser(2, "Bob", 27);
        sm.addUser(3, "Charlie", 22);
        sm.addUser(4, "Diana", 24);

        // Display all users
        System.out.println("All Users:");
        sm.displayAllUsers();

        // Add friend connections
        sm.addFriendConnection(1, 2);
        sm.addFriendConnection(1, 3);
        sm.addFriendConnection(2, 4);

        // Display friends of a user
        System.out.println("\nFriends of Alice:");
        sm.displayFriends(1);

        // Count friends for each user
        System.out.println("\nCounting friends for each user:");
        sm.countFriends();

        // Remove a friend connection
        System.out.println("\nRemoving friend connection between Alice and Bob:");
        sm.removeFriendConnection(1, 2);
        sm.displayFriends(1);
    }
}