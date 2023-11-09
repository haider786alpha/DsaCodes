import java.util.*;
public class BubbleSort {
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
     
           int n;
        int choice;
        int x;
        //boolean x =sc.nextBoolean();
        int A[]=new int[30];
     do{  
        System.out.println("How much elements do u want in ur array");
        n=sc.nextInt();
        System.out.println("ENTER "+n+" ELEMENTS");
        for (int k=0; k<= n-1; k++) {
            A[k]=sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) 
        {
            for (int j = 0; j < n-i-1; j++) 
            {
               if(A[j]>A[j+1])
               {
                 //int temp;
                //temp=A[j];
                //A[j]=A[j+1];
                //A[j+1]=temp;
                A[j]=A[j]+A[j+1];
                A[j+1]=A[j]-A[j+1];
                A[j]=A[j]-A[j+1];
               }
            }
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


