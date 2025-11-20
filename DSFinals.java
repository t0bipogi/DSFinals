import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Scanner;

public class DSFinals {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        Stack<Integer> myStack = new Stack<>();
        LinkedList<Integer> myQueue = new LinkedList<>(); 
        TreeSet<Integer> myTree = new TreeSet<>();

        boolean running = true;
        while (running) {
            System.out.println("\n=================================");
            System.out.println("      MAIN MENU");
            System.out.println("=================================");
            System.out.println("1. ArrayList");
            System.out.println("2. LinkedList");
            System.out.println("3. Stack");
            System.out.println("4. Queue");
            System.out.println("5. Tree");
            System.out.println("6. Exit");
            System.out.print("Select Data Structure: ");

            if (scan.hasNextInt()) {
                int choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        menuArrayList(myArrayList);
                        break;
                    case 2:
                        menuLinkedList(myLinkedList);
                        break;
                    case 3:
                        menuStack(myStack);
                        break;
                    case 4:
                        System.out.println("Feature coming soon...");
                        break;
                    case 5:
                        System.out.println("Feature coming soon...");
                        break;
                    case 6:
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } else {
                scan.next(); 
            }
        }
        System.out.println("Program Terminated.");
    }

    public static void manualSearch(Iterable<Integer> list, int val) {
        int index = 0;
        boolean found = false;
        for (Integer i : list) {
            if (i == val) {
                System.out.println("Found " + val + " at index/position " + index);
                found = true;
                break; 
            }
            index++;
        }
        if (!found) System.out.println("Value not found.");
    }

    public static void manualSortArrayList(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        System.out.println("Sorted ArrayList.");
    }

    public static void manualSortLinkedList(LinkedList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        System.out.println("Sorted.");
    }

    public static void manualSortStack(Stack<Integer> stack) {
        int n = stack.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (stack.get(j) > stack.get(j + 1)) {
                    int temp = stack.get(j);
                    stack.set(j, stack.get(j + 1));
                    stack.set(j + 1, temp);
                }
            }
        }
        System.out.println("Sorted Stack.");
    }

    public static void menuArrayList(ArrayList<Integer> list) {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- ARRAYLIST OPERATIONS ---");
            System.out.println("Current: " + list);
            System.out.println("1. Add at End");
            System.out.println("2. Add at Start");
            System.out.println("3. Add at Index");
            System.out.println("4. Search (Manual)");
            System.out.println("5. Sort (Manual)");
            System.out.println("6. Clear");
            System.out.println("7. Back");
            System.out.print("Action: ");

            int action = scan.nextInt();
            switch (action) {
                case 1:
                    System.out.print("Value: ");
                    list.add(scan.nextInt());
                    break;
                case 2:
                    System.out.print("Value: ");
                    list.add(0, scan.nextInt());
                    break;
                case 3:
                    System.out.print("Index: ");
                    int idx = scan.nextInt();
                    System.out.print("Value: ");
                    int val = scan.nextInt();
                    if (idx >= 0 && idx <= list.size()) list.add(idx, val);
                    else System.out.println("Index out of bounds.");
                    break;
                case 4:
                    System.out.print("Search Value: ");
                    manualSearch(list, scan.nextInt());
                    break;
                case 5:
                    manualSortArrayList(list);
                    break;
                case 6:
                    list.clear();
                    System.out.println("Cleared.");
                    break;
                case 7:
                    back = true;
                    break;
            }
        }
    }
    public static void menuLinkedList(LinkedList<Integer> list) {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- LINKEDLIST OPERATIONS ---");
            System.out.println("Current: " + list);
            System.out.println("1. Add at End");
            System.out.println("2. Add at Start");
            System.out.println("3. Add at Index");
            System.out.println("4. Search (Manual)");
            System.out.println("5. Sort (Manual)");
            System.out.println("6. Clear");
            System.out.println("7. Back");
            System.out.print("Action: ");

            int action = scan.nextInt();
            switch (action) {
                case 1:
                    System.out.print("Value: ");
                    list.addLast(scan.nextInt());
                    break;
                case 2:
                    System.out.print("Value: ");
                    list.addFirst(scan.nextInt());
                    break;
                case 3:
                    System.out.print("Index: ");
                    int idx = scan.nextInt();
                    System.out.print("Value: ");
                    int val = scan.nextInt();
                    if (idx >= 0 && idx <= list.size()) list.add(idx, val);
                    else System.out.println("Index out of bounds.");
                    break;
                case 4:
                    System.out.print("Search Value: ");
                    manualSearch(list, scan.nextInt());
                    break;
                case 5:
                    manualSortLinkedList(list);
                    break;
                case 6:
                    list.clear();
                    break;
                case 7:
                    back = true;
                    break;
            }
        }
    }

    public static void menuStack(Stack<Integer> stack) {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- STACK OPERATIONS ---");
            System.out.println("Current: " + stack);
            System.out.println("1. Push (Add)");
            System.out.println("2. Search (Manual)");
            System.out.println("3. Sort (Manual)");
            System.out.println("4. Clear");
            System.out.println("5. Back");
            System.out.print("Action: ");

            int action = scan.nextInt();
            switch (action) {
                case 1:
                    System.out.print("Value: ");
                    stack.push(scan.nextInt());
                    break;
                case 2:
                    System.out.print("Search Value: ");
                    manualSearch(stack, scan.nextInt());
                    break;
                case 3:
                    manualSortStack(stack);
                    break;
                case 4:
                    stack.clear();
                    break;
                case 5:
                    back = true;
                    break;
            }
        }
    }
}