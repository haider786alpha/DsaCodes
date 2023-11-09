import java.util.*;
public class InsertionSort {
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
     
           int n;
        int choice;
        int x;
        //boolean x =sc.nextBoolean();
        int A[]=new int[30];
     do{ 
        //code for taking elements from user 
        System.out.println("How much elements do u want in ur array");
        n=sc.nextInt();
        System.out.println("ENTER "+n+" ELEMENTS");
        for (int k=0; k<= n-1; k++) {
            A[k]=sc.nextInt();
        }
        //first code for sorting
        // for (int i = 0; i <=n-1; i++) 
        // {
        //    int current=A[i];
        //    int j=i-1;
        //    while(j>=0&&current<A[j])
        //    {
        //     A[j+1]=A[j];
        //     j--;
        //    }
        //    A[j+1]=current;
        // }
        // second code for sorting
        for (int i = 0; i < n-1; i++) {
            for (int j =i+1; j>0; j--) {
                if(A[j]<A[j-1]){
                    int temp;
                    temp=A[j];
                    A[j]=A[j-1];
                    A[j-1]=temp;
                }
                else{
                    break;
                }
                
            }
            
        }
        //code for displaying
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
