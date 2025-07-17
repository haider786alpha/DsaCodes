package DsaProject;
import java.util.Scanner;


class StackNode {
    int info;
    StackNode next;
}

public class Stack_sll {
     static StackNode top = null;
    static Scanner sc = new Scanner(System.in);

     static void showStackSll() {
        System.out.println("1:PUSH");
        System.out.println("2:POP");
        System.out.println("3:TRAVERSE");
        System.out.println("3:EXIT");
    }

     static void push_Sll() {
        
            StackNode ptr = new StackNode();
            System.out.println("\033[H\033[2J");
            System.out.println("YOU HAVE SELECTED TO PUSH IN SLL STACK!\n");
            System.out.println("ENTER THE VALUE YOU WANT TO INSERT");
            int item = sc.nextInt();
            ptr.info = item; 
            ptr.next = top;
            top = ptr;

    }

     static void pop_Sll() {

        StackNode ptr = new StackNode();
        
            if (top == null) {
                System.out.println("SLL STACK IS EMPTY!");
                System.out.println("RETURNING BACK...");
            } else { 
                ptr = top;
                top = top.next;
                System.out.println(ptr.info);

    }
}
static void traverseStack() {
    if (top == null) {
        System.out.println("STACK IS EMPTY");
        return;
    }

    StackNode ptr = top;
    System.out.println("List is");

    while (ptr != null) {
        System.out.print(ptr.info + "\t");
        ptr = ptr.next;
    }

    System.out.println();
}
}
