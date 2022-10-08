#include<iostream>
using namespace std;

int main(){
    // pointer --> data type which holds the address of other data types.
    int a=10;
    int*b=&a;
    cout<<"the address of a is "<<b<<endl;
    cout<<"the address of a is "<<&a<<endl;
    cout<<"the value at address of b is "<<*b<<endl;


    // & --> (Address) of Operator
    // * --> (Value at) Dereference Operator

    // Pointer to Pointer
    int**c=&b;
    cout<<"the address of b is "<<&b<<endl;
    cout<<"the address of b is "<<c<<endl;
    cout<<"the value at address of c is "<<*c<<endl;
    cout<<"the value at address of (address of) c is "<<**c<<endl;
    return 0;
}