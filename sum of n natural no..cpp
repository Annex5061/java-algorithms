// 1). Write a program to calculate the sum of the 
// first 10 natural numbers.
// 
#include <iostream>
using namespace std;

int main()
{
    int n,i,sum=0;
    cout<<"the value of n is : ";
    cin>>n;
    for(i=1;i<=n;i++)
    {
        sum+=i;
    }
    cout<<"sum="<<sum;
    return 0;
}
