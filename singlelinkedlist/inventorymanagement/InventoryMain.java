package com.tit.day01.linkedlist.singlelinkedlist.inventorymanagement;

public class InventoryMain {
    public static void main(String[] args) {
        ItemList inventory = new ItemList();

        // Predefined items
        inventory.addAtBeginning("Laptop", 101, 10, 50000.0);
        inventory.addAtEnd("Mouse", 102, 50, 500.0);
        inventory.addAtEnd("Keyboard", 103, 30, 1500.0);
        inventory.addAtPosition("Monitor", 104, 20, 10000.0, 2);
        inventory.addAtEnd("Printer", 105, 15, 8000.0);

        // Display all items
        System.out.println("Initial Inventory:");
        inventory.displayAll();

        // Remove an item
        System.out.println("\nRemoving item with ID 102...");
        inventory.removeByItemId(102);
        inventory.displayAll();

        // Update quantity
        System.out.println("\nUpdating quantity for item with ID 104...");
        inventory.updateQuantity(104, 25);
        inventory.displayAll();

        // Search by ID
        System.out.println("\nSearching for item with ID 105...");
        inventory.searchByIdOrName(105, "");

        // Calculate total value
        System.out.println("\nCalculating total inventory value...");
        inventory.calculateTotalValue();
    }
}
