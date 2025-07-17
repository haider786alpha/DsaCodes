package DsaProject;
import java.util.*;

public class Array {
     static int LB=0;//LB is the lower boundary of an array
     static int low;//used in merge 
     static int mid;//used in merge
     static int high;//used in merge
     static int size=60;//This is the size of the array
     static int item;//This is the insertion number which the user wants to insert
     static int N=0;//N is the number of elements in an array
     static int k;//k is which index number do u want to delete
     static int[] A= new int[size];


static void UnsortedArray()
    {
        if(N==0)
        {
            System.out.println("THE ARRAY IS EMPTY");
            return;
        }
            System.out.print("THE ARRAY BEFORE SORTING IS "+":");
            for (int i = 0; i <=N-1; i++) 
           {
            System.out.print(A[i]+" ");
            
            }
    }
static void SortedArray()
    {
        System.out.println();
        System.out.print("THE SORTED ARRAY IS "+":");
        for (int j=LB; j <= N+LB-1; j++) 
        {
            System.out.print(A[j] +" "); 
        }
    }
static void Traverse(){
    System.out.print("\033[H\033[2J");
    System.out.println("YOU HAVE SELECTED TRAVERSING.");
       if(N==0)
       {
          System.out.println("THE ARRAY IS EMPTY");
          System.out.println("\nRETURNING.....");
          return;
       }
       else
       {
          System.out.println("THE ARRAY ELEMENTS ARE  ");
          for (int j=LB; j <= N+LB-1; j++) 
         {
          System.out.print(A[j] +" "); 
         }
         System.out.println();
         System.out.println("\nRETURNING.....");
       }
    }
static void Deletion(Scanner sc,int k){
        char choice='y';
        do{
        System.out.print("\033[H\033[2J");
        System.out.println("YOU HAVE SELECTED DELETION.");
        if(N==0){
            System.out.println("THE ARRAY IS EMPTY");
            System.out.println("\nRETURNING.....");
            return;
        }
       System.out.println("ARRAY ELEMENTS BEFORE DELETION  "+ N);
        System.out.print("\nENTER WHICH INDEX DO U WANT TO DELETE (CHOOSE BETWEEN " + LB + "-"+ (N + LB - 1) + "): ");
           k=sc.nextInt();
        if(k<LB || k>N+LB-1){
            System.out.println("INVALID INDEX NUMBER");
            System.out.println("\nPRESS 'Y' TO DELETE ANOTHER ITEM");
            choice = sc.next().charAt(0);
        }
        else{
        for(int i=k+1;i<=N+LB-1;i++){
            A[i-1]=A[i];
        }
        N=N-1;
        System.out.println();
        System.out.println("ARRAY ELEMENTS AFTER DELETION "+ N);
        if (N != 0) {
            System.out.println("\nPRESS 'Y' TO DELETE ANOTHER ITEM");
            choice = sc.next().charAt(0);
        }
    }
    if (N == 0) {
        System.out.println();
        System.out.println("ARRAY IS EMPTIED");
        System.out.println("\nRETURNING TO MAIN MENU....");
        return;
    }
}
        while(choice=='y' || choice=='Y');
        System.out.println("RETURNING TO MAIN MENU....");
        
      }
static void Insertion(Scanner sc,int k,int item){
        char choice;
        do{
        System.out.print("\033[H\033[2J");
        System.out.println("YOU HAVE SELECTED INSERTION.");
        if(N == size){
        System.out.println("THE ARRAY IS FULL");
        System.out.println("\nRETURNING.....");
        return;
        }
         System.out.print("\nENTER WHICH INDEX DO U WANT TO USE FOR INSERTION (CHOOSE BETWEEN " + LB + "-" + (N + LB)+ "): ");
         k=sc.nextInt();
        if(k<LB || k>N+LB){
           System.out.println("INSERTION POSITION NOT VALID");
           System.out.println("\nPRESS 'Y' TO INSERT ITEM AGAIN");
           choice = sc.next().charAt(0);
        }
        else{
        System.out.println("ENTER THE ITEM NUMBER WHICH U WANT TO INSERT ");
        item=sc.nextInt();
        System.out.println("BEFORE INSERTION  "+ N);
        
        for (int i=N+LB-1; i>=k; i--){
            A[i+1]=A[i];
        }
          A[k]=item;
          N=N+1;
        System.out.println();
        System.out.println("AFTER INSERTION  "+ N);
        System.out.println("\nPRESS 'Y' TO INSERT ANOTHER ITEM");
        choice= sc.next().charAt(0);
    }

    }
    while(choice=='y' || choice=='Y');
    System.out.println("RETURNING TO MAIN MENU....");
        
    }
static void SingleLinearSearch(Scanner sc,int item){
       System.out.print("\033[H\033[2J");
       System.out.println("YOU HAVE SELECTED SingleLinearSearch.");
       if(N==0){
            System.out.println("THE ARRAY IS EMPTY");
            return;
        }
       System.out.println("ENTER WHICH ITEM DO U WANT TO SEARCH");
       item=sc.nextInt();

       for (int i=LB; i<=N+LB-1; i++) {
       if (item==A[i]) {
        System.out.println("ITEM FOUND\n");
        System.out.println("RETURNING....");
        return;
    }
    }
       System.out.println("ITEM DOES NOT EXIST");
}
static void MultipleLinearSearch(Scanner sc,int item){
    System.out.print("\033[H\033[2J");
    System.out.println("YOU HAVE SELECTED MultipleLinearSearch.");
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
    System.out.print("\033[H\033[2J");
    System.out.println("YOU HAVE SELECTED SingleBinarySearch.");
     for(int i=1;i<=N-1;i++){
            int currentvalue=A[i];
             int j=i-1;
             while(j>=0&&A[j]>currentvalue){
                A[j+1]=A[j];
                j--;
             }
             A[j+1]=currentvalue;
            }
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
    System.out.print("\033[H\033[2J");
    System.out.println("YOU HAVE SELECTED MultipleBinarySearch.");
         if(N==0){
            System.out.println("THE ARRAY IS EMPTY");
            return;
        }
     for(int i=1;i<=N-1;i++){
            int currentvalue=A[i];
             int j=i-1;
             while(j>=0&&A[j]>currentvalue){
                A[j+1]=A[j];
                j--;
             }
             A[j+1]=currentvalue;
            }
        int count=0;
        int Low=LB;
        int High=N+LB-1;
        System.out.println("ENTER THE ITEM WHICH U WANT TO SEARCH");
        item=sc.nextInt();
        int mid;
        while(Low<=High){
             mid=(Low+High)/2;
            if(A[mid]==item){
               count= count+1;
               int i=mid+1;
                while(i<=High&&A[i]==item){
                    count=count+1;
                    i=i+1; 
                }
                i=mid-1;
                while(i>=Low&&A[i]==item){
                    count=count+1;
                    i=i-1;
                }
                System.out.print("Item found "+count+" times");
                return;
            }
            else{
            if(A[mid]<item){
                Low=mid+1;
            }
            else{
                High=mid-1;
            }
            }
        }
          
       
System.out.print(" Item not found");
     
  }
static void BubbleSortA(Scanner sc){
    System.out.print("\033[H\033[2J");
    System.out.println("YOU HAVE SELECTED BubbleSortAscending.");
    if(N==0){
        System.out.println("THE ARRAY IS EMPTY");
        return;
    }
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
                //2nd swapping method
                // A[j]=A[j]+A[j+1];
                // A[j+1]=A[j]-A[j+1];
                // A[j]=A[j]-A[j+1];
               }
            }
        }
        if(N!=0){
        System.out.println();
        System.out.println("THE ARRAY IS SORTED");
        System.out.println("RETURNING.....");
}
}
static void BubbleSortD(Scanner sc){
    System.out.print("\033[H\033[2J");
    System.out.println("YOU HAVE SELECTED BubbleSortDescending.");
        if(N==0){
            System.out.println("THE ARRAY IS EMPTY");
            return;
        }
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
        System.out.println();
        System.out.println("THE ARRAY IS SORTED");
        System.out.println("RETURNING.....");
}
}
static void SelectionSortA(Scanner sc){
    System.out.print("\033[H\033[2J");
    System.out.println("YOU HAVE SELECTED SelectionSortAscending.");
        if(N==0){
            System.out.println("THE ARRAY IS EMPTY");
            return;
        }
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
                int temp;
                temp=A[smallest];
                A[smallest]=A[i];
                A[i]=temp; 
            }
        if(N!=0){
        System.out.println();
        System.out.println("THE ARRAY IS SORTED");
        System.out.println("RETURNING.....");
}
}
static void SelectionSortD(){
    System.out.print("\033[H\033[2J");
    System.out.println("YOU HAVE SELECTED SelectionSortDescending.");
         if(N==0){
            System.out.println("THE ARRAY IS EMPTY");
            return;
        }
            for (int i = 0; i <=N-1; i++) 
            {
                int greatest=i;
                for (int j = i+1; j < N; j++) 
                {
                   if(A[greatest]<A[j])
                   {
                    greatest =j;
                   }
                }
                int temp;
                temp=A[greatest];
                A[greatest]=A[i];
                A[i]=temp; 
            }
        if(N!=0){
        System.out.println();
        System.out.println("THE ARRAY IS SORTED");
        System.out.println("RETURNING.....");
}
}
static void InsertionSortA(){
    System.out.print("\033[H\033[2J");
    System.out.println("YOU HAVE SELECTED InsertionSortAscending.");
        if(N==0){
            System.out.println("THE ARRAY IS EMPTY");
            return;
        }
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
        System.out.println();
        System.out.println("THE ARRAY IS SORTED");
        System.out.println("RETURNING.....");
}
}
static void InsertionSortD(){
    System.out.print("\033[H\033[2J");
    System.out.println("YOU HAVE SELECTED InsertionSortDescending.");
         if(N==0){
            System.out.println("THE ARRAY IS EMPTY");
            return;
        }
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
        System.out.println();
        System.out.println("THE ARRAY IS SORTED");
        System.out.println("RETURNING.....");
}
}
static void ShellSortA(){
    System.out.print("\033[H\033[2J");
    System.out.println("YOU HAVE SELECTED ShellSortAscending.");
         if(N==0){
            System.out.println("THE ARRAY IS EMPTY");
            return;
        }
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
        System.out.println();
        System.out.println("THE ARRAY IS SORTED");
        System.out.println("RETURNING.....");
}
}
static void ShellSortD(){
    System.out.print("\033[H\033[2J");
    System.out.println("YOU HAVE SELECTED InsertionSortDescending.");
         if(N==0){
            System.out.println("THE ARRAY IS EMPTY");
            return;
        }
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
        System.out.println();
        System.out.println("THE ARRAY IS SORTED");
        System.out.println("RETURNING.....");
}
}
static void mergeSortA(int low, int high) {
    System.out.print("\033[H\033[2J");
    System.out.println("YOU HAVE SELECTED MergeSortAscending.");
        if(N==0){
        System.out.println("ARRAY IS EMPTY");
        return;
    }
    if (low < high) {
        int mid = (low + high) / 2;
        mergeSortA(low, mid);
        mergeSortA(mid + 1, high);
        mergeA(low, mid, high);
    }
}
static void mergeA(int low, int mid, int high) {
    int n1 = mid - low + 1;
    int n2 = high - mid;

    int Left[] = new int[n1];
    int Right[] = new int[n2];
    int k=mid+1;
    for (int i = 0; i < n1; i++)
        Left[i] = A[low + i];
    for (int j = 0; j < n2; j++){
        Right[j] = A[k];
        k++;
    }

    int ptrl = 0, ptrr = 0;
    int ptra = low;
    while (ptrl < n1 && ptrr < n2) {
        if (Left[ptrl] <= Right[ptrr]) {
            A[ptra] = Left[ptrl];
            ptrl++;
        } else {
            A[ptra] = Right[ptrr];
            ptrr++;
        }
        ptra++;
    }

    while (ptrl < n1) {
        A[ptra] = Left[ptrl];
        ptrl++;
        ptra++;
    }

    while (ptrr < n2) {
        A[ptra] = Right[ptrr];
        ptrr++;
        ptra++;
    }
}
static void mergeSortD(int low, int high) {
    System.out.print("\033[H\033[2J");
    System.out.println("YOU HAVE SELECTED MergeSortDescending.");
    if(N==0){
        System.out.println("ARRAY IS EMPTY");
        return;
    }
    if (low < high) {
        int mid = (low + high) / 2;
        mergeSortD(low, mid);
        mergeSortD(mid + 1, high);
        mergeD(low, mid, high);
    }
}
static void mergeD(int low, int mid, int high) {
    int n1 = mid - low + 1;
    int n2 = high - mid;

    int Left[] = new int[n1];
    int Right[] = new int[n2];
    int k=mid+1;
    for (int i = 0; i < n1; i++)
        Left[i] = A[low + i];
    for (int j = 0; j < n2; j++){
        Right[j] = A[k];
        k++;
    }

    int ptrl = 0, ptrr = 0;
    int ptra = low;
    while (ptrl < n1 && ptrr < n2) {
        if (Left[ptrl] >= Right[ptrr]) {
            A[ptra] = Left[ptrl];
            ptrl++;
        } else {
            A[ptra] = Right[ptrr];
            ptrr++;
        }
        ptra++;
    }

    while (ptrl < n1) {
        A[ptra] = Left[ptrl];
        ptrl++;
        ptra++;
    }

    while (ptrr < n2) {
        A[ptra] = Right[ptrr];
        ptrr++;
        ptra++;
    }
}
static void quickSortA(int low, int high) {
    System.out.print("\033[H\033[2J");
    System.out.println("YOU HAVE SELECTED QuickSortAscending.");
     if(N==0){
        System.out.println("ARRAY IS EMPTY");
        return;
    }
    if (low < high) {
        int index= partitionA(low, high);
        quickSortA(low, index - 1);
        quickSortA(index + 1, high);
    }
}
static int partitionA(int low, int high) {
    int pivot = A[high];
    int i = low - 1;

    for (int j = low; j < high; j++) {
        if (A[j] <= pivot) {
            i++;
            // Swap arr[i] and arr[j]
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    }

    // Swap arr[i+1] and arr[high] (pivot)
    int temp = A[i + 1];
    A[i + 1] = A[high];
    A[high] = temp;

    return i + 1;
}
static void quickSortD(int low, int high) {
    System.out.print("\033[H\033[2J");
    System.out.println("YOU HAVE SELECTED QuickSortDescending.");
    if(N==0){
     System.out.println("ARRAY IS EMPTY");
     return;
    }
    if (low < high) {
        int index= partitionD(low, high);
        quickSortD(low, index - 1);
        quickSortD(index + 1, high);
    }
}
static int partitionD(int low, int high) {
    int pivot = A[high];
    int i = low - 1;

    for (int j = low; j < high; j++) {
        if (A[j] >= pivot) {
            i++;
            // Swap arr[i] and arr[j]
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    }

    // Swap arr[i+1] and arr[high] (pivot)
    int temp = A[i + 1];
    A[i + 1] = A[high];
    A[high] = temp;

    return i + 1;
}
}

