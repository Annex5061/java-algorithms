#include<iostream>
using namespace std;

typedef struct employee
{
    /*data*/
    int eId;
    float salary;
    char favChar;

}ep;

int main(){

    ep aditya;
    aditya.eId=44;
    aditya.salary=30000000;
    aditya.favChar='s';

    cout<<"the value is "<<aditya.eId<<endl;
    cout<<"the value is "<<aditya.salary<<endl;
    cout<<"the value is "<<aditya.favChar<<endl;
    
    return 0;
}