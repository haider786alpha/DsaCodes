package DsaProject;

public class DisplayFunctions {
    static void ThreadFunction(){
        try {
                Thread.sleep(1000);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
            } 
            catch (Exception e) 
            {
                System.out.println("An error occurred while clearing the screen: " + e.getMessage());
            }
    }
    static void ThreadFunction1(){
        try {
                Thread.sleep(2000);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
            } 
            catch (Exception e) 
            {
                System.out.println("An error occurred while clearing the screen: " + e.getMessage());
            }
    }
    static void MainDisplay(){
        System.out.println("1:ARRAY");
        System.out.println("2:STACK");
        System.out.println("3:QUEUE");
        System.out.println("4:LINKEDLIST");
        System.out.println("5:EXIT");
        System.out.print("\nPRESS THE RELEVANT BUTTON FOR PROCESS"+" ");
    }
    static void ArrayDisplay(){
        System.out.println("1:TRAVERSE");
        System.out.println("2:INSERTION");
        System.out.println("3:DELETION");
        System.out.println("4:SEARCHING");
        System.out.println("5:SORTING");
        System.out.println("6:EXIT");
        System.out.print("\nPRESS THE RELEVANT BUTTON FOR PROCESS"+" ");
    }
    static void StackDisplay(){
        System.out.println("1:TRAVERSE");
        System.out.println("2:PUSH");
        System.out.println("3:POP");
        System.out.println("4:EXIT");
        System.out.print("\nPRESS THE RELEVANT BUTTON FOR PROCESS"+" ");
    }
    static void QueueDisplay(){
        System.out.println("1:SIMPLE QUEUE");
        System.out.println("2:CIRCULAR QUEUE");
        System.out.println("3:EXIT");
        System.out.print("\nPRESS THE RELEVANT BUTTON FOR PROCESS"+" ");
    }
    static void QueueMainDisplay(){
        System.out.println("1:QUEUE IN ARRAY");
        System.out.println("2:QUEUE IN LINKEDLIST");
        System.out.println("3:EXIT");
        System.out.print("\nPRESS THE RELEVANT BUTTON FOR PROCESS"+" ");
    }
    static void QueueMain1Display(){
        System.out.println("1:QUEUE IN SLL");
        System.out.println("2:QUEUE IN DLL");
        System.out.println("3:EXIT");
        System.out.print("\nPRESS THE RELEVANT BUTTON FOR PROCESS"+" ");
    }
    static void Single_LinkedListSQueueDisplay(){
        System.out.println("1:TRAVERSE");
        System.out.println("2:ENQUEUE");
        System.out.println("3:DEQUEUE");
        System.out.println("4:EXIT");
        System.out.print("\nPRESS THE RELEVANT BUTTON FOR PROCESS"+" ");
    
    }
    static void Double_LinkedListSQueueDisplay(){
        System.out.println("1:TRAVERSE");
        System.out.println("2:ENQUEUE");
        System.out.println("3:DEQUEUE");
        System.out.println("4:EXIT");
        System.out.print("\nPRESS THE RELEVANT BUTTON FOR PROCESS"+" ");
    
    }
    static void Simple_CircularQueueDisplay(){
        System.out.println("1:TRAVERSE");
        System.out.println("2:INSERTION");
        System.out.println("3:DELETION");
        System.out.println("4:EXIT");
        System.out.print("\nPRESS THE RELEVANT BUTTON FOR PROCESS"+" ");
    
    }
    static void LinkedList(){
        System.out.println("1:SINGLE LINKED LIST");
        System.out.println("2:DOUBLE LINKED LIST");
        System.out.println("3:EXIT");
        System.out.print("\nPRESS THE RELEVANT BUTTON FOR PROCESS"+" ");
    }
    static void sll(){
        System.out.println("1:INSERTION");
        System.out.println("2:DELETION");
        System.out.println("3:EXIT");
        System.out.print("\nPRESS THE RELEVANT BUTTON FOR PROCESS"+" ");
    }
    static void sllInsertion(){
        System.out.println("Choose an option:");
        System.out.println("1:INSERTION AT BEGINNING");
        System.out.println("2:INSERTION AT END");
        System.out.println("3:INSERTION AT MIDDLE");
        System.out.println("4:INSERTION_AT_POSITION");
        System.out.println("5:INSERT IN ASCENDING ORDER");
        System.out.println("6:INSERT IN DESCENDING ORDER");
        System.out.println("7:DISPLAY");
        System.out.println("8:EXIT");
        System.out.print("\nPRESS THE RELEVANT BUTTON FOR PROCESS"+" ");
    }
    static void sllDeletion(){
        System.out.println("Choose an option:");
        System.out.println("1:DELETION AT BEGINNING");
        System.out.println("2:DELETION AT END");
        System.out.println("3:DELETION AT MIDDLE");
        System.out.println("4:DELETION_AT_POSITION");
        System.out.println("5:DISPLAY");
        System.out.println("6:EXIT");
        System.out.print("\nPRESS THE RELEVANT BUTTON FOR PROCESS"+" ");
    }
    static void dll(){
        System.out.println("1:INSERTION");
        System.out.println("2:DELETION");
        System.out.println("3:EXIT");
        System.out.print("\nPRESS THE RELEVANT BUTTON FOR PROCESS"+" ");
    }
    static void dllInsertion(){
        System.out.println("Choose an option:");
        System.out.println("1:INSERTION AT BEGINNING");
        System.out.println("2:INSERTION AT END");
        System.out.println("3:INSERTION AT MIDDLE");
        System.out.println("4:INSERTION_AT_POSITION");
        System.out.println("5:INSERT IN ASCENDING ORDER");
        System.out.println("6:INSERT IN DESCENDING ORDER");
        System.out.println("7:DISPLAY");
        System.out.println("8:EXIT");
        System.out.print("\nPRESS THE RELEVANT BUTTON FOR PROCESS"+" ");
    }
    static void dllDeletion(){
        System.out.println("Choose an option:");
        System.out.println("1:DELETION AT BEGINNING");
        System.out.println("2:DELETION AT END");
        System.out.println("3:DELETION AT MIDDLE");
        System.out.println("4:DELETION_AT_POSITION");
        System.out.println("5:DISPLAY");
        System.out.println("6:EXIT");
        System.out.print("\nPRESS THE RELEVANT BUTTON FOR PROCESS"+" ");
    }
    static void stackMenue() {
        System.out.println("YOU HAVE SELECTED STACK!\n");
        System.out.println("1:STACK ON ARRAY");
        System.out.println("2:STACK ON LINKED LIST");
        System.out.println("3:EXIT");
        System.out.print("\nPRESS THE RELEVANT BUTTON FOR PROCESS"+" ");
    }
    static void SortingDisplay(){
        System.out.println("WHICH TYPE OF SORTING DO U WANT ");
        System.out.println("1:TRAVERSE");
        System.out.println("2:ASCENDING");
        System.out.println("3:DESCENDING");
        System.out.println("4:EXIT");
        System.out.println("\nPRESS THE RELEVANT BUTTON FOR PROCESS");
    }
    static void ASortingDisplay(){
        System.out.println("WHICH TYPE OF ASCENDING SORT DO U WANT ");
        System.out.println("1:BUBBLE SORT");
        System.out.println("2:SELECTION SORT");
        System.out.println("3:INSERTION SORT");
        System.out.println("4:SHELL SORT");
        System.out.println("5:MERGE SORT");
        System.out.println("6:QUICK SORT");
        System.out.println("7:EXIT");
        System.out.print("\nPRESS THE RELEVANT BUTTON FOR PROCESS"+" ");
    
    }
    static void DSortingDisplay(){
        System.out.println("WHICH TYPE OF DESCENDING SORT DO U WANT ");
        System.out.println("1:BUBBLE SORT");
        System.out.println("2:SELECTION SORT");
        System.out.println("3:INSERTION SORT");
        System.out.println("4:SHELL SORT");
        System.out.println("5:MERGE SORT");
        System.out.println("6:QUICK SORT");
        System.out.println("7:EXIT");
        System.out.print("\nPRESS THE RELEVANT BUTTON FOR PROCESS"+" ");
    }
}
