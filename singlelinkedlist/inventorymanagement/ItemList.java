package com.tit.day01.linkedlist.singlelinkedlist.inventorymanagement;


public class ItemList {

    private ItemNode head;

    // Add an item at the beginning
    public void addAtBeginning(String itemName, int itemId, int quantity, double price) {
        ItemNode newItem = new ItemNode(itemName, itemId, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    // Add an item at the end
    public void addAtEnd(String itemName, int itemId, int quantity, double price) {
        ItemNode newItem = new ItemNode(itemName, itemId, quantity, price);
        if (head == null) {
            head = newItem;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newItem;
    }

    // Add an item at a specific position
    public void addAtPosition(String itemName, int itemId, int quantity, double price, int position) {
        ItemNode newItem = new ItemNode(itemName, itemId, quantity, price);
        if (position == 1) {
            addAtBeginning(itemName, itemId, quantity, price);
            return;
        }
        ItemNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        newItem.next = temp.next;
        temp.next = newItem;
    }

    // Remove an item based on Item ID
    public void removeByItemId(int itemId) {
        if (head == null) {
            System.out.println("The inventory is empty.");
            return;
        }
        if (head.itemId == itemId) {
            head = head.next;
            System.out.println("Item removed.");
            return;
        }
        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != itemId) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Item ID not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Item removed.");
        }
    }

    // Update the quantity of an item by Item ID
    public void updateQuantity(int itemId, int newQuantity) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = newQuantity;
                System.out.println("Quantity updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item ID not found.");
    }

    // Search for an item by Item ID or Item Name
    public void searchByIdOrName(int itemId, String itemName) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == itemId || temp.itemName.equalsIgnoreCase(itemName)) {
                System.out.println("Item Found: Name: " + temp.itemName + ", ID: " + temp.itemId +
                        ", Quantity: " + temp.quantity + ", Price: " + temp.price);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    // Calculate the total value of the inventory
    public void calculateTotalValue() {
        double totalValue = 0;
        ItemNode temp = head;
        while (temp != null) {
            totalValue += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: " + totalValue);
    }

    // Display all items in the inventory
    public void displayAll() {
        if (head == null) {
            System.out.println("The inventory is empty.");
            return;
        }
        ItemNode temp = head;
        while (temp != null) {
            System.out.println("Name: " + temp.itemName + ", ID: " + temp.itemId +
                    ", Quantity: " + temp.quantity + ", Price: " + temp.price);
            temp = temp.next;
        }
    }
}
