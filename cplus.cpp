#include <iostream>
using namespace std;

void checkPalindrome(const char* p){
    
    const char* pnew = p;
    
    for(p;*p != '\0';p++);
  //  p--;
    while (*pnew++ == *--p);
    
    if(pnew>p) cout<<"is";

    else cout<<"isnot";
    
    
}
int main()
{
    int x;
    cout<<"enter the size of the string ";
    cin>>x;
    
    char* str = new char[x];
    
    for(int i = 0; i<x; i++){
        
        cin>>str[i] ;
    }
    
    const char* pointer;
    
    pointer = str;
    
    checkPalindrome(pointer);
    
    delete [] str;
   
    
    
}
