package DsaProject;
import java.util.Scanner;

class StackNode_Dll {
    int info;
    StackNode_Dll next;
    StackNode_Dll prev;
}

public class Stack_dll {
     static StackNode_Dll top = null;
    static Scanner sc = new Scanner(System.in);

     static void showStackDll() {
        System.out.println("1:PUSH");
        System.out.println("2:POP");
        System.out.println("3:RETURN TO MAIN MENUE");
    }

     static void push_Dll() {
        
            StackNode_Dll ptr = new StackNode_Dll();
            System.out.println("\033[H\033[2J");
            System.out.println("YOU HAVE SELECTED TO PUSH IN DLL STACK!\n");
            System.out.println("ENTER THE VALUE YOU WANT TO INSERT");
            int item = sc.nextInt();
            ptr.info = item; 
            ptr.next = top;
            ptr.prev = null;
            top = ptr;
    }

     static void pop_Dll() {
        StackNode_Dll ptr = new StackNode_Dll();
  
            System.out.println("\033[H\033[2J");
            if (top == null) {
                System.out.println("\nDll STACK IS EMPTY!");
                System.out.println("RETURNING BACK...");
            } else { 
                ptr = top;
                top = top.next;
                System.out.println(ptr.info);
    }
}
static void traverseStack() {
    if (top == null) {
        System.out.println("Stack is Empty");
        return;
    }

    StackNode_Dll ptr = top;
    System.out.println("List is");

    while (ptr != null) {
        System.out.print(ptr.info + "  ");
        ptr = ptr.next;
    }

    System.out.println();
}
}