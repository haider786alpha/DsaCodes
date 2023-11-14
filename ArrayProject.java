//[TRAVERSING,INSERTION,DELETION,SEARCHING(BINARY,LINEAR),SORTING(BUBBLE,SELECTION,INSERTION)]
import java.util.*;
public class ArrayProject {
     static int LB=0;//LB is the lower boundary of an array
     static int choice;//
     Thread t;
     static int size=30;//This is the size of the array
     static int item;//This is the insertion number which the user wants to insert
     static int N=0;//N is the number of elements in an array
     static int k;//k is which index number do u want to delete
     static int[] A= new int[size];
public static void main(String[] args) {

    Scanner sc =new Scanner(System.in);
    CallingFunction(sc);
}
static void CallingFunction(Scanner sc){
    do{  
        ThreadFunction();
    Display();
    choice =sc.nextInt();
    
    switch(choice){
        case 1:
                Traverse(sc);
                break;
        case 2:
              Insertion(sc,k,item);
                break;
        case 3:
             Deletion(sc,k);
               break;
        case 4:
            System.out.println("WHICH TYPE OF SEARCHING DO U WANT");
            System.out.println("1:LINEAR SEARCHING " + "2:BINARY SEARCHING");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("WHICH TYPE OF LINEAR SEARCH DO U WANT");
                    System.out.println("1:SINGLE LINEAR SEARCH " + "2:MULTIPLE LINEAR SEARCH");
                    choice=sc.nextInt();
                    switch (choice)
                     {
                        case 1:
                          SingleLinearSearch(sc,item);
                            break;
                        case 2:
                            MultipleLinearSearch(sc,item);
                            break;
                                    }
                                    break;
                case 2:
                    System.out.println("1:SINGLE BINARY SEARCH " + "2:MULTIPLE BINARY SEARCH");
                    choice=sc.nextInt();
                     switch(choice)
                      {
                        case 1:
                           SingleBinarySearch(sc,item);
                           break;
                        case 2:
                           MultiBinarySearch(sc,item);
                           break;
                      }

                
            break;
      
      }
      break;
        case 5:
              System.out.println("WHICH TYPE OF SORTING DO U WANT ");
              System.out.println("1:ASCENDING");
              System.out.println("2:DESCENDING");
              choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("WHICH TYPE OF ASCENDING SORT DO U WANT ");
                    System.out.println("1:BUBBLE SORT");
                    System.out.println("2:SELECTION SORT");
                    System.out.println("3:INSERTION SORT");
                    System.out.println("4:SHELL SORT");
                    choice=sc.nextInt();
                    switch(choice){
                        case 1:
                        BubbleSortA(sc);
                        break;
                        case 2:
                        SelectionSortA(sc);
                        break;
                        case 3:
                        InsertionSortA();
                        break;
                        case 4:
                        ShellSortA();
                        break;
                    }

                break;
                case 2:
                    System.out.println("WHICH TYPE OF DESCENDING SORT DO U WANT ");
                    System.out.println("1:BUBBLE SORT");
                    System.out.println("2:SELECTION SORT");
                    System.out.println("3:INSERTION SORT");
                    System.out.println("4:SHELL SORT");
                    choice=sc.nextInt();
                    switch(choice){
                        case 1:
                        BubbleSortD(sc);
                        break;
                        case 2:
                        SelectionSortD();
                        break;
                        case 3:
                        InsertionSortD();
                        break;
                        case 4:
                        ShellSortD();
                        break;
                    }
                break;
              }
    }}
      while(choice!=6);
}
static void ThreadFunction(){
    try {
    Thread.sleep(2500);
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                // Clear the screen for Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Clear the screen for Unix-like systems (Linux, macOS)
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("An error occurred while clearing the screen: " + e.getMessage());
        }
}
static void Display(){
    System.out.println("1:TRAVERSE");
    System.out.println("2:INSERTION");
    System.out.println("3:DELETION");
    System.out.println("4:SEARCHING");
    System.out.println("5:SORTING");
    System.out.println("6:exit");
    System.out.println("PRESS THE RELEVANT BUTTON FOR PROCESS");
}
static void UnsortedArray(){
        if(N==0){
            System.out.println("THE ARRAY IS EMPTY");
            return;
             }
            System.out.print("THE ARRAY BEFORE SORTING IS "+":");
            for (int i = 0; i <=N-1; i++) 
           {
            System.out.print(A[i]+" ");
            
            }
}
static void SortedArray(){
      System.out.println();
      System.out.print("THE SORTED ARRAY IS "+":");
           for (int k=0;k<N;k++){
           System.out.print(A[k]+" ");
           }
}
static void Traverse(Scanner sc){
     
       if(N==0){
        System.out.println("THE ARRAY IS EMPTY");
        return;
       }
       else{
     System.out.println("THE ARRAY ELEMENTS ARE  ");
    for (int j=LB; j <= N+LB-1; j++) {
        System.out.print(A[j] +" "); 
      }
           }
    }
static void Deletion(Scanner sc,int k){
        if(N==0){
            System.out.println("THE ARRAY IS EMPTY");
            return;
        }
        System.out.println("THE ARRAY ELEMENTS BEFORE DELETION IS "+N);
        System.out.print("ENTER WHICH INDEX NUMBER DO U WANT TO DELETE");
           k=sc.nextInt();
        if(k<LB || k>N+LB-1){
            System.out.println("INVALID INDEX NUMBER");
            return;
        }
        else{
        for(int i=k+1;i<=N+LB-1;i++){
            A[i-1]=A[i];
        }
    }
         for(int i=0;i<N+LB-1;i++){
               System.out.print(A[i] + " ");
        }
        N=N-1;
        System.out.println("THE ARRAY ELEMENTS AFTER DELETION IS "+N);
        
      }
static void Insertion(Scanner sc,int k,int item){
         //ArrayValues(sc);
        System.out.println("ENTER WHICH INDEX DO U WANT TO USE FOR INSERTION");
        k=sc.nextInt();
        System.out.println("ENTER THE ITEM NUMBER WHICH U WANT TO INSERT ");
        item=sc.nextInt();
        System.out.println("THE ARRAY ELEMENTS BEFORE INSERTION IS "+N);
        if(k<LB || k>N+LB){
            System.out.println("INSERTION POSITION NOT VALID");
        }
        if(N == size){
            System.out.println("THE ARRAY IS FULL");
        }
        else{
        for (int i=N+LB-1; i>=k; i--){
            A[i+1]=A[i];
        }
          A[k]=item;
    }
        
         for(int i=0;i<=N;i++){
               System.out.print(A[i] + " ");
        }
        N=N+1;
        System.out.println();
        System.out.println("THE ARRAY ELEMENTS AFTER INSERTION IS "+N);
    }
static void SingleLinearSearch(Scanner sc,int item){
      if(N==0){
            System.out.println("THE ARRAY IS EMPTY");
            return;
        }
    System.out.println("ENTER WHICH ITEM DO U WANT TO SEARCH");
    item=sc.nextInt();

for (int i=LB; i <=N+LB-1; i++) {
    if (item==A[i]) {
        System.out.println("ITEM FOUND");
        return;
    }
    }
    System.out.println("ITEM DOES NOT EXIST");
}
static void MultipleLinearSearch(Scanner sc,int item){
      if(N==0){
            System.out.println("THE ARRAY IS EMPTY");
            return;
        }
    System.out.println("ENTER WHICH ITEM OR ELEMENT DO YOU WANT TO SEARCH");
    item=sc.nextInt();
    int count=0;
    for(int i=LB;i<=N+LB-1;i++){
        if(item==A[i]){
            count=count+1;
        }
        
    }
    if (count==0){
System.out.println("The item exist zero time");
}
else{
System.out.println("The item exists "+ count +" times");
}
}
static void SingleBinarySearch(Scanner sc,int item){
      if(N==0){
            System.out.println("THE ARRAY IS EMPTY");
            return;
        }
    System.out.println("ENTER THE ITEM WHICH U WANT TO SEARCH");
      item=sc.nextInt();
    int low=LB;
      int high=N+LB-1;
      int mid;
      while(low<=high){
           mid=(int)(low+high)/2;
           if(A[mid]==item){
            System.out.println("ITEM FOUND");
            return;
           }
          if(item<A[mid]){
            high=mid-1;
          }
          else
          {
           low=mid+1; 
           }
        }
        System.out.println("ITEM NOT FOUND");
    }  
static void MultiBinarySearch(Scanner sc,int item){
      if(N==0){
            System.out.println("THE ARRAY IS EMPTY");
            return;
        }
 System.out.println("ENTER THE ITEM WHICH U WANT TO SEARCH");
      item=sc.nextInt();
    int low=LB;
      int high=N+LB-1;
      int mid;
      int count=0;
      while(low<=high){
        
           mid=(int)(low+high)/2;
           if(A[mid]==item){
            count=count+1;
            int i=mid+1;
            while(i<=high&&A[i]==item){
            count++;
            i++;}
            i = mid-1;
            while(i>=low&&A[i]==item){
                count++;
                i--;
               }
               System.out.println(item + " found "+ count +" times");
         }
        if(item<A[mid]){
            high=mid-1;
            return;
          }
          else
          {
           low=mid+1; 
           return;
           }
        }
        System.out.println("ITEM NOT FOUND");
    }  
static void BubbleSortA(Scanner sc){
         UnsortedArray();
        for (int i = 0; i < N-1; i++) 
        {
            for (int j = 0; j < N-i-1; j++) 
            {
               if(A[j]>A[j+1])
               {
                 int temp;
                temp=A[j];
                A[j]=A[j+1];
                A[j+1]=temp;
                // A[j]=A[j]+A[j+1];
                // A[j+1]=A[j]-A[j+1];
                // A[j]=A[j]-A[j+1];
               }
            }
        }
         if(N!=0){
         SortedArray();
}
}
static void BubbleSortD(Scanner sc){
        UnsortedArray();
        for (int i = 0; i < N-1; i++) 
        {
            for (int j = 0; j < N-i-1; j++) 
            {
               if(A[j]<A[j+1])
               {
                 int temp;
                temp=A[j];
                A[j]=A[j+1];
                A[j+1]=temp;
                // A[j]=A[j]+A[j+1];
                // A[j+1]=A[j]-A[j+1];
                // A[j]=A[j]-A[j+1];
               }
            }
        }
       if(N!=0){
       SortedArray();
}
}
static void SelectionSortA(Scanner sc){
            UnsortedArray();
            for (int i = 0; i <=N-1; i++) 
            {
                int smallest=i;
                for (int j = i+1; j < N; j++) 
                {
                   if(A[smallest]>A[j])
                   {
                    smallest =j;
                   }
                }
                //  A[i]=A[i]+A[smallest];
                //     A[smallest]=A[i]-A[smallest];
                //     A[i]=A[i]-A[smallest];
                int temp;
                temp=A[smallest];
                A[smallest]=A[i];
                A[i]=temp; 
            }
           if(N!=0){
           SortedArray();
}
}
static void SelectionSortD(){
            UnsortedArray();
            for (int i = 0; i <=N-1; i++) 
            {
                int smallest=i;
                for (int j = i+1; j < N; j++) 
                {
                   if(A[smallest]<A[j])
                   {
                    smallest =j;
                   }
                }
                //  A[i]=A[i]+A[smallest];
                //     A[smallest]=A[i]-A[smallest];
                //     A[i]=A[i]-A[smallest];
                int temp;
                temp=A[smallest];
                A[smallest]=A[i];
                A[i]=temp; 
            }
            if(N!=0){
              SortedArray();
}
}
static void InsertionSortA(){
          UnsortedArray();
            for(int i=1;i<=N-1;i++){
            int currentvalue=A[i];
             int j=i-1;
             while(j>=0&&A[j]>currentvalue){
                A[j+1]=A[j];
                j--;
             }
             A[j+1]=currentvalue;
            }
            if(N!=0){
          SortedArray();
}
}
static void InsertionSortD(){
          UnsortedArray();
            for(int i=1;i<=N-1;i++){
            int currentvalue=A[i];
             int j=i-1;
             while(j>=0&&A[j]<currentvalue){
                A[j+1]=A[j];
                j--;
             }
             A[j+1]=currentvalue;
            }
           if(N!=0){
       SortedArray();
}
}
static void ShellSortA(){
    UnsortedArray();
    int Gap=(int)(N/2);
    while(Gap!=0){
    for (int last=LB+Gap; last<=N+LB-1; last++) {
        int min =A[last];
        int i =last-Gap;
        while(i>=LB && A[i]>min)
        {
            A[i+Gap]=A[i];
            i=i-Gap;
        }
        A[i+Gap]=min;
    }
      Gap=(int)(Gap/2);
    } 
    if(N!=0){
    SortedArray();
}
}
static void ShellSortD(){
    UnsortedArray();
    int Gap=(int)(N/2);
    while(Gap!=0){
    for (int last=LB+Gap; last<=N+LB-1; last++) {
        int min =A[last];
        int i =last-Gap;
        while(i>=LB && A[i]<min)
        {
            A[i+Gap]=A[i];
            i=i-Gap;
        }
        A[i+Gap]=min;
    }
      Gap=(int)(Gap/2);
    } 
    if(N!=0){
    SortedArray();
}
}
}

     

