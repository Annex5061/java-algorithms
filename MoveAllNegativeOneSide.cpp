#include <iostream>
using namespace std;
void move(int a[], int n)
{int j=0;
for(int i=0;i<n;i++)
{if(a[i]<0)
{swap(a[i],a[j]);
j++;}
}
}

int main() {
    int a[5]={3,-1,2,-4,-6};
    move(a,5);
   for(int i=0;i<5;i++)
   {cout<<a[i]<<" ";}
}
//another method just sort the array