package DsaProject;
import java.util.Scanner;

class Nodee {
    int data;
    Nodee next;
    Nodee prev;

    Nodee(int value) {
        data = value;
        next = null;
        prev = null;
    }
}

class DoublyLinkedList {
    static Nodee start; 

    DoublyLinkedList() {
        start = null;
    }

    static void insertAtBeginning(int value) {
        Nodee ptr = new Nodee(value);
        ptr.next = start;
        ptr.prev = null;

        if (start != null) {
            start.prev = ptr;
        }

        start = ptr;
    }

    static void insertAtEnd(int value) {
        Nodee ptr = new Nodee(value);

        if (start == null) {
            start = ptr;
            return;
        }

        Nodee ptr1 = start;
        while (ptr1.next != null) {
            ptr1 = ptr1.next;
        }

        ptr1.next = ptr;
        ptr.prev = ptr1;
    }

    static void insertInMiddle(int value, int position) {
        int count = countNodes();

        if (count == 0) {
            System.out.println("LIST IS EMPTY,MIDDLE NOT FOUND");
            System.out.println("RETURNING.....");
            return;
        }

        if (position < 1) {
            System.out.println("INVALID POSITION");
            System.out.println("RETURNING.....");
            return;
        }

        Nodee ptr = new Nodee(value);

        if (start == null || position == 1) {
            ptr.next = start;
            ptr.prev = null;

            if (start != null) {
                start.prev = ptr;
            }

            start = ptr;
            return;
        }

        Nodee ptr1 = start;
        for (int i = 1; i < position -1 && ptr1 != null; ++i) {
            ptr1 = ptr1.next;
        }

        if (ptr1 == null) {
            System.out.println("LINKEDLIST IS EMPTY,MIDDLE NOT FOUND");
            System.out.println("RETURNING.....");
            return;
        }

        ptr.next = ptr1.next;
        ptr.prev = ptr1;
        ptr1.next = ptr;

        if (ptr.next != null) {
            ptr.next.prev = ptr;
        }
    }

    static void insertAtExactPosition() {
        if (start == null) {
            System.out.println("THE LINKEDLIST IS EMPTY");
            return;
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the value to insert: ");
            int valueExact = scanner.nextInt();
            Nodee ptr = new Nodee(valueExact);
            System.out.print("Enter the position of the node: ");
            int targetBefore = scanner.nextInt();

            if (targetBefore == 1) {
                ptr.next = start;
                ptr.prev = null;

                if (start != null) {
                    start.prev = ptr;
                }

                start = ptr;
                return;
            }

            int count = 0;
            Nodee ptr1 = start;
            while (ptr1 != null) {
                ptr1 = ptr1.next;
                count++;
            }
            if (targetBefore > count || targetBefore <= 0) {
                System.out.println("INSERTION POSITION NOT VALID");
                return;
            }

            ptr1 = start;
            for (int i = 1; i < targetBefore - 1 && ptr1 != null; ++i) {
                ptr1 = ptr1.next;
            }

            ptr.next = ptr1.next;
            ptr.prev = ptr1;
            ptr1.next = ptr;

            if (ptr.next != null) {
                ptr.next.prev = ptr;
            }
        }
    }

    static void insertBeforePosition() {
        if (start == null) {
            System.out.println("THE LINKEDLIST IS EMPTY");
            return;
        } else {
            Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the item Before which you want to insert a Node_DLL: ");
        int sitem = scanner.nextInt();

        if (start.data == sitem) {
            System.out.print("Enter value you want to insert: ");
            int item = scanner.nextInt();
            Nodee ptr = new Nodee(item);
            ptr.prev = null;
            ptr.next = start;
            start.prev = ptr;
            start = ptr;
            return;
        }

        Nodee ptr1 = start;
        while (ptr1 != null && ptr1.data != sitem) {
            ptr1 = ptr1.next;
        }

        if (ptr1 == null) {
            System.out.println("Required Item not found");
            return;
        }

        System.out.print("Enter value you want to insert: ");
        int item = scanner.nextInt();
        Nodee ptr = new Nodee(item);
        ptr.next = ptr1;
        ptr.prev = ptr1.prev;

        if (ptr1.prev != null) {
            ptr1.prev.next = ptr;
        }

        ptr1.prev = ptr;
            // Scanner scanner = new Scanner(System.in);
            // System.out.print("Enter the value to insert: ");
            // int valueBefore = scanner.nextInt();
            // Nodee ptr = new Nodee(valueBefore);
            // System.out.print("Enter the position of the node before which to insert: ");
            // int targetBefore = scanner.nextInt();

            // if (targetBefore == 1) {
            //     ptr.next = start;
            //     ptr.prev = null;

            //     if (start != null) {
            //         start.prev = ptr;
            //     }

            //     start = ptr;
            //     return;
            // }

            // int count = 0;
            // Nodee ptr1 = start;
            // while (ptr1 != null) {
            //     ptr1 = ptr1.next;
            //     count++;
            // }
            // if (targetBefore > count || targetBefore <= 0) {
            //     System.out.println("INSERTION POSITION NOT VALID");
            //     return;
            // }

            // ptr1 = start;
            // for (int i = 1; i < targetBefore - 1 && ptr1 != null; ++i) {
            //     ptr1 = ptr1.next;
            // }

            // ptr.next = ptr1.next;
            // ptr.prev = ptr1;
            // ptr1.next = ptr;

            // if (ptr.next != null) {
            //     ptr.next.prev = ptr;
            // }
        }
    }

    static void insertAfterPosition() {
        

        if (start == null) {
            System.out.println("THE LINKEDLIST IS EMPTY");
            return;
        } else {
            Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the item After which you want to insert a Node_DLL: ");
        int sitem = scanner.nextInt();

        Nodee ptr1 = start;
        while (ptr1 != null && ptr1.data != sitem) {
            ptr1 = ptr1.next;
        }

        if (ptr1 == null) {
            System.out.println("Item not found");
            return;
        }

        System.out.print("Enter value you want to insert: ");
        int item = scanner.nextInt();
        Nodee ptr = new Nodee(item);
        ptr.prev = ptr1;
        ptr.next = ptr1.next;

        if (ptr1.next != null) {
            ptr1.next.prev = ptr;
        }

        ptr1.next = ptr;
            // Scanner scanner = new Scanner(System.in);
            // System.out.print("Enter the value to insert: ");
            // int valueAfter = scanner.nextInt();
            // Nodee ptr = new Nodee(valueAfter);
            // System.out.print("Enter the position of the node after which to insert: ");
            // int targetAfter = scanner.nextInt();
            // int count = 0;
            // Nodee ptr1 = start;
            // while (ptr1 != null) {
            //     ptr1 = ptr1.next;
            //     count++;
            // }
            // if (targetAfter > count || targetAfter <= 0) {
            //     System.out.println("INSERTION POSITION NOT VALID ");
            //     return;
            // }

            // ptr1 = start;
            // for (int i = 1; i < targetAfter && ptr1 != null; ++i) {
            //     ptr1 = ptr1.next;
            // }

            // ptr.next = ptr1.next;
            // ptr.prev = ptr1;
            // ptr1.next = ptr;

            // if (ptr.next != null) {
            //     ptr.next.prev = ptr;
            // }
        }
    }
    static void insertInAscendingOrder(int value) {
        Nodee ptr = new Nodee(value);

        if (start == null || value < start.data) {
            ptr.next = start;
            if (start != null) {
                start.prev = ptr;
            }
            start = ptr;
            return;
        }
        Nodee ptr1 = start;
        while (ptr1.next != null && ptr1.next.data < value) {
            ptr1 = ptr1.next;
        }

        ptr.next = ptr1.next;
        ptr.prev = ptr1;
        if (ptr1.next != null) {
            ptr1.next.prev = ptr;
        }
        ptr1.next = ptr;
    }
    static void insertInDescendingOrder(int valuee) {
        Nodee ptr = new Nodee(valuee);

        if (start == null || valuee > start.data) {
            ptr.next = start;
            if (start != null) {
                start.prev = ptr;
            }
            start = ptr;
            return;
        }

        Nodee ptr1 = start;
        while (ptr1.next != null && ptr1.next.data > valuee) {
            ptr1 = ptr1.next;
        }

        ptr.next = ptr1.next;
        ptr.prev = ptr1;
        if (ptr1.next != null) {
            ptr1.next.prev = ptr;
        }
        ptr1.next = ptr;
    }


    static void deleteFirstNode() {
        if (start == null) {
            System.out.println("LINKEDLIST IS EMPTY");
            System.out.println("RETURNING.....");
            return;
        }

        start = start.next;

        if (start != null) {
            start.prev = null;
        }
    }

    static void deleteLastNode() {
        if (start == null) {
            System.out.println("LINKEDLIST IS EMPTY");
            System.out.println("RETURNING.....");
            return;
        }

        if (start.next == null) {
            start = null;
            return;
        }

        Nodee ptr1 = start;
        while (ptr1.next.next != null) {
            ptr1 = ptr1.next;
        }

        ptr1.next = null;
    }

    static void deleteAtPosition(int position) {
        if (position < 1) {
            System.out.println("INVALID POSITION");
            return;
        }

        if (start == null) {
            System.out.println("LINKEDLIST IS EMPTY");
            return;
        }

        if (position == 1) {
            start = start.next;

            if (start != null) {
                start.prev = null;
            }
            return;
        }

        Nodee ptr1 = start;
        for (int i = 1; i < position - 1 && ptr1 != null; ++i) {
            ptr1 = ptr1.next;
        }

        if (ptr1 == null || ptr1.next == null) {
            System.out.println("INVALID POSITION");
            return;
        }

        ptr1.next = ptr1.next.next;

        if (ptr1.next != null) {
            ptr1.next.prev = ptr1;
        }
    }

    static int countNodes() {
        int count = 0;
        Nodee ptr = start;

        while (ptr != null) {
            count++;
            ptr = ptr.next;
        }

        return count;
    }

  

    static void display() {
        Nodee ptr = start;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println();
    }
}
