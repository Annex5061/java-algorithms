#include<bits/stdc++.h>
using namespace std;

// 10 catalan numbers-- 1 1 2 5 14 42 132 429 1430 4862 

int catalan(int n){

    if(n<=1){
        return 1;
    }

    int res=0;
    for(int i=0;i<=n-1;i++){
        res+= catalan(i) * catalan(n-i-1);
    }
    return res;
}

int main(){
    
    for(int i=0;i<10;i++){
        cout<<catalan(i)<<endl;
    }
    return 0;
}