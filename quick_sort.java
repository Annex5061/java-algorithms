import java.util.*;
public class quick_sort {
  static pt=0;

    int partition( int a[], int lb, int ub)

    {
        int pivot=a[lb];
        int start=lb;
        int end=ub;

        while(start<end)
        {
          while(a[start]<=pivot)
          {
            start++;
          }
        while(a[end]>pivot)
        {
            end--;
        }
        if(start<end)
        {
            
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
        }
        
       
    }


      int temp=a[lb];
      a[lb]=a[end];
      a[end]=temp;

        return end;



    }
   
 

    void sort(int a[],int lb,int ub)
    {
      if(lb<ub)
      {
       int  loc=partition(a, lb, ub);
     sort(a, lb, loc-1);
     sort(a, loc+1, ub);
         

      }


    }
    public static void main(String[] args) {
        
       // int a[]={34,56,12,34,67};
       Scanner sc=new Scanner(System.in);
       Random rd=new Random();
       System.out.println("enter numbers:");
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       {
           a[i]=i;
       }
       
        int n=a.length;

        quick_sort qs=new quick_sort();
        long s=System.nanoTime();
        qs.sort(a, 0, n-1);
        long e=System.nanoTime();
        long time=(e-s);


        System.out.println("after sorting:"+"required time is "+time);
    //     for (int i=0; i<n; i++){
    //     System.out.print(a[i] +"");
    // System.out.println();
    //     }

    }
    
}
