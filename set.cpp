#include<bits/stdc++.h>
using namespace std;
void print(set<string> &s)
{
    for(string value :s){
        cout<<value<<endl;
    }
}
int main(){
    set<string> s;
    s.insert("abc");   //O(log(n))
    s.insert("def");
    s.insert("ghi");
    s.insert("abc");
    //auto it= s.find("abc");     //O(log(n))
    //if(it!=s.end()){   
      //  s.erase(it);
    //}
    //s.erase("abc");
    print (s);
      
   /* unordered_set<int> s; 
    s.insert(1);   //O(1)
    s.insert(4);
    s.insert(2);
    s.insert(3);
    auto it= s.find(2);     //O(1)
    if(it!=s.end()){   
        s.erase(it);
    }
    for(int value :s){
        cout<<value<<" ";
    }*/

    
   /* multiset<string> s;    //it can store doublicate strings
    s.insert("abc");   //O(log(n))
    s.insert("abc");
    s.insert("ghi");
    s.insert("jkl");
    
   /* auto it= s.find("abc");     //O(log(n))
    if(it!=s.end()){   
        s.erase(it);
    }*/
    // s.erase("abc")   //it will erase both "abc" from the set
    
    /*for(string value :s){
        cout<<value<<endl;
    }*/
    
}