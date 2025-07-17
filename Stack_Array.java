package DsaProject;
import java.util.Scanner;

// Stack on Array
class Stack_Array {
    static int size, item;
    static  int lb = 0;
    static int top = lb - 1;
    static int[] S;

static void Stackarray() {
        System.out.print("\033[H\033[2J");
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER THE STACK SIZE:");
        size = scanner.nextInt();
        S = new int[size];
        
    }
static void traverse() {
        System.out.print("\033[H\033[2J");
        System.out.println("YOU HAVE SELECTED TRAVERSING.");
        if (top == lb - 1) {
            System.out.println("STACK IS EMPTY");
            return;
        }
        System.out.println("THE STACK IS :");
        for (int i = top; i >= lb; i--) {
            System.out.print("[" + S[i] + "] ");
        }
        System.out.println();
    }
static void push() {
        char choice='y';
        do{
        System.out.print("\033[H\033[2J");
        System.out.println("YOU HAVE SELECTED PUSH.");
        if (top == size + lb - 1) {
            System.out.println("STACK IS FULL");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE ITEM U WANT TO PUSH ");
        item = scanner.nextInt();
        top++;
        S[top] = item;
        System.out.println("PRESS 'Y' to PUSH AGAIN");
        choice= scanner.next().charAt(0);
    }
        while(choice=='y'|| choice=='Y');
        System.out.println("RETURNING TO MENU...");
    }
static void pop() {
        char choice='y';
        do{
        System.out.print("\033[H\033[2J");
        System.out.println("YOU HAVE SELECTED POP.");
        if (top == lb - 1) {
            System.out.println("STACK IS EMPTY");
            return;
        }
        item = S[top];
        top--;
        System.out.println("[" + item + "] IS POPPED");
        Scanner scanner=new Scanner(System.in);
        System.out.println("PRESS 'Y' to POP AGAIN");
        choice= scanner.next().charAt(0);
    }
         while(choice=='y'|| choice=='Y');
        System.out.println("RETURNING TO MENU...");
    }
}
