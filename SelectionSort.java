import java.util.*;
public class SelectionSort {
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
     
        int n;
        int x;
        int A[]=new int[30];
     do{  
        System.out.println("How much elements do u want in ur array");
        n=sc.nextInt();
        System.out.println("ENTER "+n+" ELEMENTS");
        for (int k=0; k<= n-1; k++) {
            A[k]=sc.nextInt();
        }
        for (int i = 0; i <=n-1; i++) 
        {
            int smallest=i;
            for (int j = i+1; j < n; j++) 
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
        System.out.println("THE SORTED ARRAY IS ");
            for (int i = 0; i <=n-1; i++) 
           {
            System.out.println(A[i]);
            
            }
              System.out.println("PRESS ANY NUMBER TO RESTART OR PRESS 00 FOR EXIT ");
         x=sc.nextInt();
        }
        while(x != 00);

    }
  
        
    }

