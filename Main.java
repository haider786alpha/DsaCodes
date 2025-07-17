package DsaProject;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {

    Scanner sc =new Scanner(System.in);
    CallingFunction(sc);
}
static void CallingFunction(Scanner sc){

        System.out.print("\033[H\033[2J");
        System.out.println("DATA STRUCTURES AND ALGORITHMS");
        System.out.println("MADE BY: MALIK HAIDER HUSSAIN");
        System.out.println("TEACHER: NAUMAN QADEER");
        DisplayFunctions.ThreadFunction1();

    do{ 
    DisplayFunctions.ThreadFunction();
    DisplayFunctions.MainDisplay();
    ChoiceVariables.MainChoice=sc.nextInt();
    switch(ChoiceVariables.MainChoice){
    case 1:
    do{
        DisplayFunctions.ThreadFunction();
        boolean Value = false;
       for (int i = 0; i < Array.A.length; i++) {
        if (Array.A[i] != 0) {
            Value = true;
            break;
        }
        }
        if (Value) {} 
        else {
        System.out.println(
"NOTE: ARRAY IS EMPTY, ENTER AN ARRAY USING INSERTION FIRST IN ORDER TO PERFORM ANY OTHER ACTION!");
    }
       DisplayFunctions.ArrayDisplay();
       ChoiceVariables.ArrayChoice =sc.nextInt();
       switch(ChoiceVariables.ArrayChoice){
        case 1:
                Array.Traverse();
                break;
        case 2:
              Array.Insertion(sc,Array.k,Array.item);
                break;
        case 3:
             Array.Deletion(sc,Array.k);
               break;
        case 4:{
            do{
            DisplayFunctions.ThreadFunction();
            System.out.println("WHICH TYPE OF SEARCHING DO U WANT");
            System.out.println("1:LINEAR SEARCHING " + "\n2:BINARY SEARCHING \n3:EXIT");
            System.out.println("\nPRESS THE RELEVANT BUTTON FOR PROCESS");
            ChoiceVariables.SearchChoice=sc.nextInt();
            switch (ChoiceVariables.SearchChoice) 
            {
                case 1:{
                    do{
                   // System.out.print("\033[H\033[2J");
                   DisplayFunctions.ThreadFunction();
                    System.out.println("WHICH TYPE OF LINEAR SEARCH DO U WANT");
                    System.out.println("1:SINGLE LINEAR SEARCH " + "\n2:MULTIPLE LINEAR SEARCH \n3:EXIT");
                    System.out.println("\nPRESS THE RELEVANT BUTTON FOR PROCESS");
                    ChoiceVariables.LSearchChoice=sc.nextInt();
                    switch (ChoiceVariables.LSearchChoice)
                     {
                        case 1:
                            Array.SingleLinearSearch(sc,Array.item);
                            break;
                        case 2:
                            Array.MultipleLinearSearch(sc,Array.item);
                            break;
                        case 3:
                            System.out.println("\nRETURNING TO PREVIOUS STEP....");
                            break;
                        default:
                            System.out.println("\nINVALID CHOICE, PLEASE SELECT A VALID OPTION");
                            break;
                    }
                }
                    while(ChoiceVariables.LSearchChoice!=3);
                }
                break;
                    
                case 2:{
                    do{
                   // System.out.print("\033[H\033[2J");
                   DisplayFunctions.ThreadFunction();
                    System.out.println("WHICH TYPE OF BINARY SEARCH DO U WANT");
                    System.out.println("1:SINGLE BINARY SEARCH " + "\n2:MULTIPLE BINARY SEARCH \n3:EXIT");
                    System.out.println("\nPRESS THE RELEVANT BUTTON FOR PROCESS");
                    ChoiceVariables.BSearchChoice=sc.nextInt();
                     switch(ChoiceVariables.BSearchChoice)
                      {
                        case 1:
                           Array.SingleBinarySearch(sc,Array.item);
                           break;
                        case 2:
                           Array.MultiBinarySearch(sc,Array.item);
                           break;
                        case 3:
                           System.out.println("\nRETURNING TO PREVIOUS STEP....");
                           break;
                        default:
                           System.out.println("\nINVALID CHOICE, PLEASE SELECT A VALID OPTION");
                           break;
                      }
                    }
                    while(ChoiceVariables.BSearchChoice!=3);
                    }
                    break;
                case 3:
                    System.out.println("\nRETURNING TO PREVIOUS STEP....");
                    break;
                default:
                    System.out.println("\nINVALID CHOICE, PLEASE SELECT A VALID OPTION");
                    break;
                }
                    }
                    while(ChoiceVariables.SearchChoice!=3);
               }
                break;
                
                    
                
        case 5:{
        do{
            //System.out.print("\033[H\033[2J");
             DisplayFunctions.ThreadFunction();
             DisplayFunctions.SortingDisplay();
              ChoiceVariables.SortChoice=sc.nextInt();
              switch(ChoiceVariables.SortChoice)
              {
                case 1:
                    Array.Traverse();
                 break;
                case 2:{
                    do{
                    DisplayFunctions.ThreadFunction();
                    DisplayFunctions.ASortingDisplay();
                    ChoiceVariables.SortChoiceA=sc.nextInt();
                    switch(ChoiceVariables.SortChoiceA)
                    {
                        case 1:
                         Array.BubbleSortA(sc);
                        break;
                        case 2:
                         Array.SelectionSortA(sc);
                        break;
                        case 3:
                         Array.InsertionSortA();
                        break;
                        case 4:
                         Array.ShellSortA();
                        break;
                        case 5:
                         Array.mergeSortA(0, Array.N - 1);
                          if(Array.N!=0){
                          System.out.println();
                          System.out.println("THE ARRAY IS SORTED");
                          System.out.println("RETURNING.....");
                           }
                        break;
                        case 6:
                         Array.quickSortA(0,Array.N-1);
                         if(Array.N!=0){
                         System.out.println();
                         System.out.println("THE ARRAY IS SORTED");
                         System.out.println("RETURNING.....");
                         }
                        break;
                        case 7:
                         System.out.println("\nRETURNING TO PREVIOUS STEP....");
                        break;
                        default:
                         System.out.println("\nINVALID CHOICE, PLEASE SELECT A VALID OPTION");
                        break;
                     }}
                     while(ChoiceVariables.SortChoiceA!=7);
                    }
                break;
                case 3:{
                    do{
                    DisplayFunctions.ThreadFunction();
                    DisplayFunctions.DSortingDisplay();
                    ChoiceVariables.SortChoiceD=sc.nextInt();
                    switch(ChoiceVariables.SortChoiceD)
                    {
                        case 1:
                        Array.BubbleSortD(sc);
                        break;
                        case 2:
                        Array.SelectionSortD();
                        break;
                        case 3:
                        Array.InsertionSortD();
                        break;
                        case 4:
                        Array.ShellSortD();
                        break;
                        case 5:
                        Array.mergeSortD(0,Array.N-1);
                        if(Array.N!=0){
                        System.out.println();
                        System.out.println("THE ARRAY IS SORTED");
                        System.out.println("RETURNING.....");
                         }
                        break;
                        case 6:
                        Array.quickSortD(0,Array.N-1);
                        if(Array.N!=0){
                        System.out.println();
                        System.out.println("THE ARRAY IS SORTED");
                        System.out.println("RETURNING.....");
                         }
                        break;
                        case 7:
                         System.out.println("\nRETURNING TO PREVIOUS STEP....");
                        break;
                        default:
                         System.out.println("\nINVALID CHOICE, PLEASE SELECT A VALID OPTION");
                        break;
                    }}
                    while(ChoiceVariables.SortChoiceD!=7);
                }
                break;
                case 4:
                    System.out.println("\nRETURNING TO PREVIOUS STEP....");
                    break;
                default:
                    System.out.println("\nINVALID CHOICE, PLEASE SELECT A VALID OPTION");
                    break;
              }}
              while(ChoiceVariables.SortChoice!=4);
            }
                break;
        case 6:
        System.out.println("BACK TO MAIN MENU.....");
        break;
        default:
        System.out.println("\nINVALID CHOICE, PLEASE SELECT A VALID OPTION");
        break;       

    }

}
       while(ChoiceVariables.ArrayChoice!=6);
       break;
    case 2:{
        
    do{
     DisplayFunctions.ThreadFunction();
    System.out.println("YOU HAVE SELECTED STACK!\n");
    System.out.println("1:STACK ON ARRAY");
    System.out.println("2:STACK ON LINKED LIST");
    System.out.println("3:EXIT");
    System.out.print("\nPRESS THE RELEVANT BUTTON FOR PROCESS"+" ");
      ChoiceVariables.StackChoice=sc.nextInt();
      switch(ChoiceVariables.StackChoice){
        case 1:
        Stack_Array.Stackarray();
        do {
            DisplayFunctions.ThreadFunction();
            System.out.println("YOU HAVE SELECTED STACK ON ARRAY!\n");
            DisplayFunctions.StackDisplay();
            ChoiceVariables.Stack_ArrayChoice = sc.nextInt();
            switch (ChoiceVariables.Stack_ArrayChoice) {

                case 1: 
                    Stack_Array.traverse();
                    break;
                case 2: 
                   Stack_Array.push();
                    break;
                    case 3:
                    Stack_Array.pop();
                    break;
                case 4: 
                    System.out.println("RETURNING BACK...");
                    break;
                default:
                 System.out.println("\nINVALID CHOICE, PLEASE SELECT A VALID OPTION");
                    break;
            }

        } while (ChoiceVariables.Stack_ArrayChoice != 4);
        break;
        
        case 2:
        do {
            DisplayFunctions.ThreadFunction();
            System.out.println("YOU HAVE SELECTED STACK ON LINKED LIST!\n");
            System.out.println("1:STACK ON SINGLE LINKED LIST");
            System.out.println("2:STACK ON DOUBLE LINKED LIST");
            System.out.println("3:EXIT");
            ChoiceVariables.Stack_LlChoice = sc.nextInt();
            switch (ChoiceVariables.Stack_LlChoice) {

                case 1: 
                {
                  do{
                    DisplayFunctions.ThreadFunction();
                    System.out.println("YOU HAVE SELECTED STACK ON SINGLE LINKEDLIST!\n");
                 
                    Stack_sll.showStackSll();
                    ChoiceVariables.Stack_SLlChoice = sc.nextInt();
                    switch (ChoiceVariables.Stack_SLlChoice) {

                        case 1:
                            Stack_sll.push_Sll();
                            break;
                        case 2: 
                            Stack_sll.pop_Sll();
                            break;
                            case 3:
                            Stack_sll.traverseStack();
                            break;
                        case 4: 
                            System.out.println("RETURNING BACK...");
                            break;
                        default:
                        System.out.println("\nINVALID CHOICE, PLEASE SELECT A VALID OPTION");
                            break;
                    }}
                    while(ChoiceVariables.Stack_SLlChoice!=4);
                }
                    break;
                case 2: 
                  {
                  do{
                    DisplayFunctions.ThreadFunction();
                    System.out.println("YOU HAVE SELECTED STACK ON DOUBLE LINKEDLIST!\n");
                 
                    Stack_dll.showStackDll();
                    ChoiceVariables.Stack_DLlChoice = sc.nextInt();
                    switch (ChoiceVariables.Stack_DLlChoice) {

                        case 1:
                            Stack_dll.push_Dll();
                            break;
                        case 2: 
                            Stack_dll.pop_Dll();
                            break;
                            case 3:
                            Stack_dll.traverseStack();
                            break;
                        case 4: 
                            System.out.println("RETURNING BACK...");
                            break;
                        default:
                        System.out.println("\nINVALID CHOICE, PLEASE SELECT A VALID OPTION");
                            break;
                    }}
                    while(ChoiceVariables.Stack_DLlChoice!=4);
                }
                    break;
                case 3: 
                    System.out.println("RETURNING BACK...");
                    break;
                default:
                 System.out.println("\nINVALID CHOICE, PLEASE SELECT A VALID OPTION");
                    break;
            }

        } while (ChoiceVariables.Stack_LlChoice != 3);
        
        break;
        case 3:
        System.out.println("BACK TO MAIN MENU.....");
        break;
        default:
        System.out.println("\nINVALID CHOICE, PLEASE SELECT A VALID OPTION");
        break;
    }
       }
       while(ChoiceVariables.StackChoice!=3);
    }break;
    case 3:{
    
    do{
      DisplayFunctions.ThreadFunction();
      DisplayFunctions.QueueMainDisplay();
      ChoiceVariables.QueueMainChoice=sc.nextInt();
      switch(ChoiceVariables.QueueMainChoice){
        case 1:{
            QueueArray.Queue();
            do{
          DisplayFunctions.ThreadFunction();
          DisplayFunctions.QueueDisplay();
          ChoiceVariables.QueueArrayChoice=sc.nextInt();
          switch(ChoiceVariables.QueueArrayChoice){
            case 1:{
           do{
            DisplayFunctions.ThreadFunction();
            DisplayFunctions.Simple_CircularQueueDisplay();
             ChoiceVariables.LinearQueueChoice=sc.nextInt();
            switch(ChoiceVariables.LinearQueueChoice){
                case 1:
                QueueArray.TRAVERSELQ();
                break;
                case 2:
                QueueArray.INSERTIONLQ();
                break;
                case 3:
                QueueArray.DELETIONLQ();
                break;
                case 4:
                System.out.println("RETURNING TO MENU...");
                break;
                default:
                System.out.println("\nINVALID CHOICE, PLEASE SELECT A VALID OPTION");
                break;
             }
             }
            while(ChoiceVariables.LinearQueueChoice!=4);

            }break;
            case 2:{
            do{
            DisplayFunctions.ThreadFunction();
            DisplayFunctions.Simple_CircularQueueDisplay();
             ChoiceVariables.CircularQueueChoice=sc.nextInt();
            switch(ChoiceVariables.CircularQueueChoice){
                case 1:
                QueueArray.TRAVERSECQ();
                break;
                case 2:
                QueueArray.INSERTIONCQ();
                break;
                case 3:
                QueueArray.DELETIONCQ();
                break;
                case 4:
                System.out.println("RETURNING......");
                break;
                default:
                System.out.println("\nINVALID CHOICE, PLEASE SELECT A VALID OPTION");
                break;
            }
        }
            while(ChoiceVariables.CircularQueueChoice!=4);
        }
        break;
         case 3:
         System.out.println("RETURNING....");
         break;
         default:
         System.out.println("\nINVALID CHOICE, PLEASE SELECT A VALID OPTION");
         break;
          }}
          while(ChoiceVariables.QueueArrayChoice!=3);
        break;}
        case 2:{
            do{
            DisplayFunctions.ThreadFunction();
            DisplayFunctions.QueueMain1Display();
            ChoiceVariables.QueueLinkedlistChoice=sc.nextInt();
            switch(ChoiceVariables.QueueLinkedlistChoice){
                case 1:
                do{
                    DisplayFunctions.ThreadFunction();
                    DisplayFunctions.Single_LinkedListSQueueDisplay();
                    ChoiceVariables.QueueSllLinkedlistChoice=sc.nextInt();
                    switch(ChoiceVariables.QueueSllLinkedlistChoice){
                        case 1:
                        QueueSLL.displayQueue();
                        break;
                        case 2:
                        QueueSLL.enqueueSLL();
                        break;
                        case 3:
                        QueueSLL.dequeueSLL();
                        break;
                        case 4:
                        System.out.println("RETURNING......");
                        break;
                        default:
                        System.out.println("\nINVALID CHOICE, PLEASE SELECT A VALID OPTION");
                        break;
                    }}
                    while(ChoiceVariables.QueueSllLinkedlistChoice!=4);
                break;
                case 2:
                do{
                    DisplayFunctions.ThreadFunction();
                    DisplayFunctions.Double_LinkedListSQueueDisplay();
                    ChoiceVariables.QueueDllLinkedlistChoice=sc.nextInt();
                    switch(ChoiceVariables.QueueDllLinkedlistChoice){
                        case 1:
                        QueueDLL.displayQueue();
                        break;
                        case 2:
                        QueueDLL.enqueueDLL();
                        break;
                        case 3:
                        QueueDLL.dequeueDLL();
                        break;
                        case 4:
                        System.out.println("RETURNING......");
                        break;
                        default:
                        System.out.println("\nINVALID CHOICE, PLEASE SELECT A VALID OPTION");
                        break;
                    }}
                    while(ChoiceVariables.QueueDllLinkedlistChoice!=4);
                break;
                case 3:
                System.out.println("RETURNING....");
                break;
                default:
                System.out.println("\nINVALID CHOICE, PLEASE SELECT A VALID OPTION");
                break;
            }}
            while(ChoiceVariables.QueueLinkedlistChoice!=3);
    }

        break;
        case 3:
        System.out.println("BACK TO MAIN MENU.....");
        break;
        default:
        System.out.println("\nINVALID CHOICE, PLEASE SELECT A VALID OPTION");
        break;
    }
      
}
      while(ChoiceVariables.QueueMainChoice!=3);
    }
      break;
      case 4:{  
        do{
        DisplayFunctions.ThreadFunction();
        DisplayFunctions.LinkedList();
        ChoiceVariables.LinkedListChoice=sc.nextInt();
        switch(ChoiceVariables.LinkedListChoice){
            case 1:{
                do{
             DisplayFunctions.ThreadFunction();
             DisplayFunctions.sll();
             ChoiceVariables.SingleLinkedListChoice=sc.nextInt();
             switch(ChoiceVariables.SingleLinkedListChoice){
                case 1:{
            do{
            DisplayFunctions.ThreadFunction();
            DisplayFunctions.sllInsertion();
            ChoiceVariables.SingleLinkedListInsertionChoice=sc.nextInt();
            switch(ChoiceVariables.SingleLinkedListInsertionChoice){
                case 1:
                System.out.print("INSERT VALUE AT BEGINNING: ");
                int valueBeginning = sc.nextInt();
                LinkedList.insertAtBeginning(valueBeginning);
                break;
                case 2:
                System.out.print("INSERT VALUE AT END: ");
                int valueEnd = sc.nextInt();
                LinkedList.insertAtEnd(valueEnd);
                break;
                case 3:{
                do{
                DisplayFunctions.ThreadFunction();
                System.out.println("1:INSERT IN MIDDLE");
                System.out.println("2:INSERT BEFORE MIDDLE");
                System.out.println("3:INSERT AFTER MIDDLE");
                System.out.println("4:EXIT");
                ChoiceVariables.insertmiddle_Sll=sc.nextInt();
                switch(ChoiceVariables.insertmiddle_Sll){
                    case 1:
                    if (LinkedList.start == null) {
                        System.out.println("THE LINKEDLIST IS EMPTY,MIDDLE NOT FOUND");
                        System.out.println("RETURNING.......");
                        break;
                    }
                    System.out.print("INSERT VALUE AT MIDDLE ");
                    int valueMiddle = sc.nextInt();
                    int countt =LinkedList.countNodes();
                    int mid=countt / 2 + 1;
                    LinkedList.insertInMiddle(valueMiddle, mid);
                    break;
                    case 2:
                    if (LinkedList.start == null) {
                        System.out.println("THE LINKEDLIST IS EMPTY,MIDDLE NOT FOUND");
                        System.out.println("RETURNING.......");
                        break;
                    }
                    System.out.print("INSERT THE VALUE BEFORE MIDDLE: ");
                    int valueBeforeMiddle = sc.nextInt();
                    int Count =LinkedList.countNodes();
                    int middlePosition = (Count / 2)+1;
                    LinkedList.insertInMiddle(valueBeforeMiddle, middlePosition);
                    break;
                    case 3:
                    if (LinkedList.start == null) {
                        System.out.println("THE LINKEDLIST IS EMPTY,MIDDLE NOT FOUND");
                        System.out.println("RETURNING.......");
                        break;
                    }
                    System.out.print("INSERT THE VALUE AFTER MIDDLE: ");
                    int valueAfterMiddle = sc.nextInt();
                    int Countt =LinkedList.countNodes();
                    int MiddlePosition = (Countt / 2)+1;
                    LinkedList.insertInMiddle(valueAfterMiddle, MiddlePosition+ 1);
                    break;
                    case 4:
                    System.out.println("\nRETURNING TO PREVIOUS STEP....");
                    break;
                    default:
                    System.out.println("\nINVALID CHOICE, PLEASE SELECT A VALID OPTION");
                    break;
                }}
                while(ChoiceVariables.insertmiddle_Sll!=4);
            }
                
                break;
                case 4:{
                do{
                DisplayFunctions.ThreadFunction();
                System.out.println("1: INSERT AT EXACT POSITION");
                System.out.println("2: INSERT BEFORE EXACT POSITION");
                System.out.println("3: INSERT AFTER EXACT POSITION");
                System.out.println("4: EXIT");
                ChoiceVariables.positionnchoice=sc.nextInt();
                switch(ChoiceVariables.positionnchoice){
                    case 1:
                    LinkedList.insertAtExactPosition();
                    break;
                    case 2:
                    LinkedList.insertBeforePosition();
                    break;
                    case 3:
                    LinkedList.insertAfterPosition();
                    break;
                    case 4:
                    System.out.println("\nRETURNING TO PREVIOUS STEP....");
                    break;
                    default:
                    System.out.println("\nINVALID CHOICE, PLEASE SELECT A VALID OPTION");
                    break;
                }}
                while(ChoiceVariables.positionnchoice!=4);
            }
                
                break;
                case 5:
                System.out.println("INSERT THE VALUE");
                int insertValue=sc.nextInt();
                LinkedList.insertInAscendingOrder(insertValue);
                break;
                case 6:
                System.out.println("INSERT THE VALUE");
                int InsertValue=sc.nextInt();
                LinkedList.insertInDescendingOrder(InsertValue);
                break;
                case 7:
                System.out.print("LINKEDLIST: ");
                LinkedList.display();
                break;
                case 8:
                System.out.println("\nRETURNING TO PREVIOUS STEP....");
                break;
                default:
                System.out.println("\nINVALID CHOICE, PLEASE SELECT A VALID OPTION");
                break;
            }}
            while(ChoiceVariables.SingleLinkedListInsertionChoice!=8);
        }
            break;
                case 2:
                {
            do{
            DisplayFunctions.ThreadFunction();
            DisplayFunctions.sllDeletion();
            ChoiceVariables.SingleLinkedListDeletionChoice=sc.nextInt();
            switch(ChoiceVariables.SingleLinkedListDeletionChoice){
                case 1:
                LinkedList.deleteFirstNode();
                break;
                case 2:
                LinkedList.deleteLastNode();
                break;
                case 3:
                int positionToDelete = LinkedList.countNodes();
                int middle=positionToDelete / 2 + 1;
                LinkedList.deleteAtPosition(middle);
                break;
                case 4:
                System.out.println("ENTER THE POSITION TO DELETE");
                int deletePosition=sc.nextInt();
                LinkedList.deleteAtPosition(deletePosition);
                break;
                case 5:
                System.out.print("LINKEDLIST: ");
                LinkedList.display();
                break;
                case 6:
                System.out.println("\nRETURNING TO PREVIOUS STEP....");
                break;
                default:
                System.out.println("\nINVALID CHOICE, PLEASE SELECT A VALID OPTION");
                break;
            }}
            while(ChoiceVariables.SingleLinkedListDeletionChoice!=6);
        }
                break;
                case 3:
                System.out.println("\nRETURNING TO PREVIOUS STEP....");
                break;
                default:
                System.out.println("\nINVALID CHOICE, PLEASE SELECT A VALID OPTION");
                break;
             }}
             while(ChoiceVariables.SingleLinkedListChoice!=3);
        }
            break;
            case 2:{
             do{   
            DisplayFunctions.ThreadFunction();
            DisplayFunctions.dll();
            ChoiceVariables.DoubleLinkedListChoice=sc.nextInt();
            switch(ChoiceVariables.DoubleLinkedListChoice){
                case 1:{
            do{
            DisplayFunctions.ThreadFunction();
            DisplayFunctions.dllInsertion();
            ChoiceVariables.DoubleLinkedListInsertionChoice=sc.nextInt();
            switch(ChoiceVariables.DoubleLinkedListInsertionChoice){
                case 1:
                System.out.print("INSERT VALUE AT BEGINNING: ");
                int valueBeginningg = sc.nextInt();
                DoublyLinkedList.insertAtBeginning(valueBeginningg);
                break;
                case 2:
                System.out.print("INSERT VALUE AT END: ");
                int valueEndd = sc.nextInt();
                DoublyLinkedList.insertAtEnd(valueEndd);
                break;
                case 3:{
                do{
                DisplayFunctions.ThreadFunction();
                System.out.println("1:INSERT IN MIDDLE");
                System.out.println("2:INSERT BEFORE MIDDLE");
                System.out.println("3:INSERT AFTER MIDDLE");
                System.out.println("4:EXIT");
                ChoiceVariables.insertmiddle_Dll=sc.nextInt();
                switch(ChoiceVariables.insertmiddle_Dll){
                    case 1:
                    if (DoublyLinkedList.start == null) {
                        System.out.println("THE LINKEDLIST IS EMPTY,MIDDLE NOT FOUND");
                        System.out.println("RETURNING.......");
                        break;
                    }
                     System.out.print("INSERT VALUE AT MIDDLE ");
                     int valueMiddlee = sc.nextInt();
                     int count = DoublyLinkedList.countNodes();
                     int midd = count / 2 + 1;
                     DoublyLinkedList.insertInMiddle(valueMiddlee, midd);
                    break;
                    case 2:
                    if (DoublyLinkedList.start == null) {
                        System.out.println("THE LINKEDLIST IS EMPTY,MIDDLE NOT FOUND");
                        System.out.println("RETURNING.......");
                        break;
                    }
                      System.out.print("INSERT THE VALUE BEFORE MIDDLE: ");
                      int valueBeforeMiddle = sc.nextInt();
                      int COUNT = DoublyLinkedList.countNodes();
                      int middlePositionn = COUNT/ 2 + 1;
                      DoublyLinkedList.insertInMiddle(valueBeforeMiddle , middlePositionn);
                    break;
                    case 3:
                    if (DoublyLinkedList.start == null) {
                        System.out.println("THE LINKEDLIST IS EMPTY,MIDDLE NOT FOUND");
                        System.out.println("RETURNING.......");
                        break;
                    }
                     System.out.print("INSERT THE VALUE AFTER MIDDLE: ");
                     int valueAfterMiddle = sc.nextInt();
                     int COUNTT = DoublyLinkedList.countNodes();
                     int MiddlePositionn = COUNTT/ 2 + 1;
                     DoublyLinkedList.insertInMiddle(valueAfterMiddle , MiddlePositionn+1);
                    break;
                    case 4:
                    System.out.println("\nRETURNING TO PREVIOUS STEP....");
                    break;
                    default:
                    System.out.println("\nINVALID CHOICE, PLEASE SELECT A VALID OPTION");
                    break;
                }}
                while(ChoiceVariables.insertmiddle_Dll!=4);
            }
            break;
                case 4:
                {
                    do{
                    DisplayFunctions.ThreadFunction();
                    System.out.println("1: INSERT AT EXACT POSITION");
                    System.out.println("2: INSERT BEFORE EXACT POSITION");
                    System.out.println("3: INSERT AFTER EXACT POSITION");
                    System.out.println("4: EXIT");
                    ChoiceVariables.positionchoice=sc.nextInt();
                    switch(ChoiceVariables.positionchoice){
                        case 1:
                         DoublyLinkedList.insertAtExactPosition();
                        break;
                        case 2:
                        DoublyLinkedList.insertBeforePosition();
                        break;
                        case 3:
                        DoublyLinkedList.insertAfterPosition();
                        break;
                        case 4:
                        System.out.println("\nRETURNING TO PREVIOUS STEP....");
                        break;
                        default:
                        System.out.println("\nINVALID CHOICE, PLEASE SELECT A VALID OPTION");
                        break;
                    }}
                    while(ChoiceVariables.positionchoice!=4);
                }
                 break;
                case 5:
                System.out.println("INSERT THE VALUE");
                int insertValue=sc.nextInt();
                DoublyLinkedList.insertInAscendingOrder(insertValue);
                break;
                case 6:
                System.out.println("INSERT THE VALUE");
                int InsertValue=sc.nextInt();
                DoublyLinkedList.insertInDescendingOrder(InsertValue);
                break;
                case 7:
                System.out.print("LINKEDLIST: ");
                DoublyLinkedList.display();
                break;
                case 8:
                System.out.println("\nRETURNING TO PREVIOUS STEP....");
                break;
                default:
                System.out.println("\nINVALID CHOICE, PLEASE SELECT A VALID OPTION");
                break;
            }}
            while(ChoiceVariables.DoubleLinkedListInsertionChoice!=8);
        }
                break;
                case 2:
                {
            do{
            DisplayFunctions.ThreadFunction();
            DisplayFunctions.dllDeletion();
            ChoiceVariables.DoubleLinkedListDeletionChoice=sc.nextInt();
            switch(ChoiceVariables.DoubleLinkedListDeletionChoice){
                case 1:
                DoublyLinkedList.deleteFirstNode();
                break;
                case 2:
                DoublyLinkedList.deleteLastNode();
                break;
                case 3:
                int positionToDelete = DoublyLinkedList.countNodes();
                int middle = positionToDelete / 2 + 1;
                DoublyLinkedList.deleteAtPosition(middle);
                break;
                case 4:
                System.out.println("ENTER THE POSITION TO DELETE");
                int deletePosition=sc.nextInt();
                DoublyLinkedList.deleteAtPosition(deletePosition);
                break;
                case 5:
                System.out.print("LINKEDLIST: ");
                DoublyLinkedList.display();
                break;
                case 6:
                System.out.println("\nRETURNING TO PREVIOUS STEP....");
                break;
                default:
                System.out.println("\nINVALID CHOICE, PLEASE SELECT A VALID OPTION");
                break;
            }}
            while(ChoiceVariables.DoubleLinkedListDeletionChoice!=6);
        }
                break;
                case 3:
                System.out.println("\nRETURNING TO PREVIOUS STEP....");
                break;
                default:
                System.out.println("\nINVALID CHOICE, PLEASE SELECT A VALID OPTION");
                break;
            }}
            while(ChoiceVariables.DoubleLinkedListChoice!=3);
        }
            break;
            case 3:
            System.out.println("\nRETURNING TO PREVIOUS STEP....");
            break;
            default:
            System.out.println("\nINVALID CHOICE, PLEASE SELECT A VALID OPTION");
            break;
    
        }}
        while(ChoiceVariables.LinkedListChoice!=3);
    }
        break;
    case 5:
    System.out.println("EXITING THE CODE......");
    return;
    default:
    System.out.println("\nINVALID CHOICE, PLEASE SELECT A VALID OPTION");
    break;
}
}
      while(ChoiceVariables.MainChoice!=5);

}}







