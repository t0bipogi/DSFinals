import java.util.*;

public class DSFinals {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        LinkedList<Integer> myLinkedList = new LinkedList<>();

        boolean running = true;
        while (running) {
            System.out.println("1. ArrayList 2. LinkedList 3. Stack 4. Queue 5. Tree 6. Exit");
            if (scan.hasNextInt()) {
                int choice = scan.nextInt();
                switch (choice) {
                    case 1: menuArrayList(myArrayList); break;
                    case 2: menuLinkedList(myLinkedList); break;
                    case 6: running = false; break;
                }
            } else scan.next();
        }
    }

    public static void menuArrayList(ArrayList<Integer> list) {
        System.out.println("1. Add 2. Search 3. Sort 4. Back");
        int action = scan.nextInt();
        if (action == 1) list.add(scan.nextInt());
        else if (action == 2) System.out.println("Search coming soon...");
        else if (action == 3) manualSortArrayList(list);
    }

    public static void menuLinkedList(LinkedList<Integer> list) {
        System.out.println("1. Add 2. Search 3. Sort 4. Back");
        int action = scan.nextInt();
        if (action == 1) list.addLast(scan.nextInt());
        else if (action == 2) System.out.println("Search coming soon...");
        else if (action == 3) manualSortLinkedList(list);
    }
git
    public static void manualSortArrayList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static void manualSortLinkedList(LinkedList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}