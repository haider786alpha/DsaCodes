package DsaProject;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

class LinkedList {
    static Node start; 

    LinkedList() {
        start = null;
    }

static void insertAtBeginning(int value) {
        Node ptr = new Node(value);
        ptr.next = start;
        start = ptr;
    }

static void insertAtEnd(int value) {
        Node ptr = new Node(value);

        if (start == null) {
            start = ptr;
            return;
        }

        Node ptr1 = start;
        while (ptr1.next != null) {
            ptr1 = ptr1.next;
        }

        ptr1.next = ptr;
    }

static  void insertInMiddle(int value, int position) {
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

        Node ptr = new Node(value);

        if (start == null || position == 1) {
            ptr.next = start;
            start = ptr;
            return;
        }

        Node ptr1 = start;
        for (int i = 1; i < position - 1 && ptr1 != null; ++i) {
            ptr1 = ptr1.next;
        }

        if (ptr1 == null) {
            System.out.println("LINKEDLIST IS EMPTY,MIDDLE NOT FOUND");
            System.out.println("RETURNING.....");
            return;
        }

        ptr.next = ptr1.next;
        ptr1.next = ptr;
    }
     static void insertAtExactPosition() {

    if (start == null) {
        System.out.println("THE LINKEDLIST IS EMPTY");
        return;
    }
    else{
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the value to insert: ");
        int Value = scanner.nextInt();
        Node ptr = new Node(Value);

    System.out.print("Enter the position of the node: ");
     int targetBefore = scanner.nextInt();

    if (start == null || targetBefore == 1) {
        ptr.next = start;
        start = ptr;
        return;
    }
    int count=0;
    Node ptr1=start;
    while(ptr1!=null){
        ptr1=ptr1.next;
        count++;
    }
    if(targetBefore>count || targetBefore<=0){
        System.out.println("INSERTION POSITION NOT VALID");
        return;
    }

    Node ptr2 = start;
    for (int i = 1; i < targetBefore - 1 && ptr2 != null; ++i) {
        ptr2 = ptr2.next;
    }

    ptr.next = ptr2.next;
    ptr2.next = ptr;
}
}
    static void insertBeforePosition() {

    if (start == null) {
        System.out.println("THE LINKEDLIST IS EMPTY");
        return;
    }
    else{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value before which you want to insert a Node_SLL: ");
        int sItem = scanner.nextInt();
        Node ptr1 = start;

        if (ptr1.data == sItem) {
            Node ptr = new Node(0); // Assuming a default value
            System.out.print("Enter the value you want to insert: ");
            int item = scanner.nextInt();
            ptr.data = item;
            ptr.next = start;
            start = ptr;
            return;
        }

        while (ptr1.next != null && ptr1.next.data != sItem) {
            ptr1 = ptr1.next;
        }

        if (ptr1.next == null) {
            System.out.println("Item not found");
            return;
        }

        System.out.print("Enter the value you want to insert: ");
        int item = scanner.nextInt();
        Node ptr = new Node(item);
        ptr.next = ptr1.next;
        ptr1.next = ptr;
    
}
}
static void insertAfterPosition() {

    if (start == null) {
        System.out.println("THE LINKEDLIST IS EMPTY");
        return;
    }
    else{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value after which you want to insert a Node_SLL: ");
        int sItem = scanner.nextInt();
        Node ptr1 = start;

        while (ptr1 != null && ptr1.data != sItem) {
            ptr1 = ptr1.next;
        }

        if (ptr1 == null) {
            System.out.println("Given value not found");
            return;
        }

        System.out.print("Enter the value you want to insert: ");
        int item = scanner.nextInt();
        Node ptr = new Node(item);
        ptr.next = ptr1.next;
        ptr1.next = ptr;
    
}
}
 static void insertInAscendingOrder(int valuee) {
        Node ptr = new Node(valuee);

        if (start == null || valuee < start.data) {
            ptr.next = start;
            start = ptr;
            return;
        }

        Node ptr1 = start;
        while (ptr1.next != null && ptr1.next.data < valuee) {
            ptr1 = ptr1.next;
        }

        ptr.next = ptr1.next;
        ptr1.next = ptr;
    }
    static void insertInDescendingOrder(int Valuee) {
        Node ptr = new Node(Valuee);

        if (start == null || Valuee > start.data) {
            ptr.next = start;
            start = ptr;
            return;
        }

        Node ptr1 = start;
        while (ptr1.next != null && ptr1.next.data > Valuee) {
            ptr1 = ptr1.next;
        }

        ptr.next = ptr1.next;
        ptr1.next = ptr;
    }

static void deleteFirstNode() {
        if (start == null) {
            System.out.println("LINKEDLIST IS EMPTY");
            System.out.println("RETURNING.....");
            return;
        }

        start = start.next;
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

        Node ptr = start;
        while (ptr.next.next != null) {
            ptr = ptr.next;
        }

        ptr.next = null;
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
            return;
        }

        Node ptr = start;
        for (int i = 1; i < position - 1 && ptr != null; ++i) {
            ptr = ptr.next;
        }

        if (ptr == null || ptr.next == null) {
            System.out.println("INVALID POSITION");
            return;
        }

        ptr.next = ptr.next.next;
    }
static int countNodes() {
        int count = 0;
        Node ptr = start;

        while (ptr != null) {
            count++;
            ptr = ptr.next;
        }

        return count;
    }

static void display() {
        Node ptr = start;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println();
    }
}

