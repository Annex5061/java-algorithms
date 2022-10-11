#include<iostream>
using namespace std;

int main(){
    int marks[4]={88,99,66,34};
    int i=0;
    // while(i<4){
    //     cout<<marks[i]<<endl;
    //     i++;
    // }
    do{
        cout<<marks[i]<<endl;
        i++;
    }
    while(i<4);
    return 0;
}