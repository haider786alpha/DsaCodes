import java.util.Scanner;
public class insertion{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int LB=0;
        System.out.println("enter the size of an array=");
        int N=sc.nextInt();
        int size=20;
        
       int A[]=new int[size];
       for(int i=0;i<N;i++){
         System.out.println("values in an index"+i);
           A[i]=sc.nextInt();
       }
       System.out.println("enter the value you want to insertion=");
      int item=sc.nextInt();
      System.out.println("enter the position where you want to insert the item=");
      int k=sc.nextInt();
       if(k<LB||k>N+LB-1){
        System.out.println("deletion position is invalid");
        return;
      }
     if(N==size){
       System.out.println("array is full");
     }
    else{

    for(int i=LB+N-1;i>=k;i--){
        A[i+1]=A[i];
    }}
    
    A[k]=item;
    
    System.out.println("insetion="+item);
  
System.out.println("the array after insertion=");
for (int i = 0; i <= N; i++) {
    System.out.println("A[" + i + "] = " + A[i]);
}
N++;

}}
//  }
     //   if(N == size){
          //  System.out.println("THE ARRAY IS FULL");
      //  }
      //  else{
       // for (int i=N+LB-1; i>=k; i--){
       //     A[i+1]=A[i];
        //}
       //   A[k]=item;
  //  }
        
      //   for(int i=0;i<=N;i++){
      //         System.out.println(A[i]);
     //   }
     //   N=N+1;
      //  System.out.println("THE ARRAY ELEMENTS AFTER INSERTION IS "+N);
   // }public class insertion {
    

