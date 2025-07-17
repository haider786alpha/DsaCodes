package DsaProject;
import java.util.Scanner;

public class QueueSLL {

    static class NodeSLL {
        int info;
        NodeSLL next;

        NodeSLL(int value) {
            info = value;
            next = null;
        }
    }

    static NodeSLL F, R;
    static int choice, item;

    

    static void enqueueSLL() {
        NodeSLL ptr = new NodeSLL(0);
        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER THE VALUE FOR INSERTION\t");
        item = scanner.nextInt();

        ptr.info = item;
        ptr.next = null;

        if (R == null) {
            F = ptr;
            R = ptr;
        } else {
            R.next = ptr;
            R = ptr;
        }
    }
    static void dequeueSLL() {
        if (F == null) {
            System.out.println("QUEUE IS EMPTY");
            return;
        }

        NodeSLL ptr = F;

        if (F.next == null) {
            F = null;
            R = null;
        } else {
            F = F.next;
        }

        ptr = null; //free memory
    }

    static void displayQueue() {
        if (F == null) {
            System.out.println("QUEUE_LL IS EMPTY");
            return;
        }

        NodeSLL ptr = F;
        System.out.println("LIST IS :");

        while (ptr != R) {
            System.out.print(ptr.info + "  ");
            ptr = ptr.next;
        }

        System.out.print(ptr.info + "  ");
    }
}



