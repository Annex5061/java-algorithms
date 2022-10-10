#include<iostream>
using namespace std;
int main()
{
    int A[5] ={ 2,3,4,5,6};
    
     int sum=0;
     for(int i=0; i<5; i++)
     sum=sum + A[i];
     cout<<"sum of all elements are"<< sum;
return 0;
}