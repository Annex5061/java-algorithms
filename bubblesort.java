package Sorting;

public class bubblesort {

    public static void main(String args[])
    {
        int a[]={3,4,5,2,1,87,45};


       for(int i=1;i<a.length;i++)
       {
           int key=a[i];

           int hole=i-1;


           while (hole>=0  && a[hole]>key)
           {
               a[hole+1]=a[hole];
               hole=hole-1;

               a[hole+1]=key;
           }

       }

       for(int i=0;i<a.length;i++)
       {
           System.out.println((a[i]));
       }


    }
}
