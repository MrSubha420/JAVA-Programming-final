// Write a program in java where create three function short,add,remove the elements
import java.util.Scanner;

public class Program3 {
    private int[] array;
    private int size;

    public Program3(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    // Add an element to the array
    public void addElement(int element) {
        if (size < array.length) {
            array[size] = element;
            size++;
            System.out.println("Added: " + element);
        } else {
            System.out.println("Array is full, cannot add more elements.");
        }
    }

    // Delete an element from the array
    public void deleteElement(int element) {
        int index = findElement(element);
        if (index != -1) {
            // Shift elements to the left to fill the gap
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
            System.out.println("Deleted: " + element);
        } else {
            System.out.println("Element not found.");
        }
    }

    // Find the index of an element in the array
    private int findElement(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    // Sort the array (Bubble sort for simplicity)
    public void sortArray() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Array sorted.");
    }

    // Display the array
    public void displayArray() {
        if (size == 0) {
            System.out.println("Array is empty.");
        } else {
            System.out.print("Array: ");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the capacity of the array: ");
        int capacity = scanner.nextInt();
        Program3 arrayOps = new Program3(capacity);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add element");
            System.out.println("2. Delete element");
            System.out.println("3. Sort array");
            System.out.println("4. Display array");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    int elementToAdd = scanner.nextInt();
                    arrayOps.addElement(elementToAdd);
                    break;
                case 2:
                    System.out.print("Enter element to delete: ");
                    int elementToDelete = scanner.nextInt();
                    arrayOps.deleteElement(elementToDelete);
                    break;
                case 3:
                    arrayOps.sortArray();
                    break;
                case 4:
                    arrayOps.displayArray();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
