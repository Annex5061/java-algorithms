#include <iostream>
#include <set>
using namespace std;
void unionofArrays(int arr[],int arr2[], int size, int size1){
	set<int> s;


	for(int i=0;i<size;i++){
		
			
			s.insert(arr[i]);
			
	
	
		
	}
	for(int i=0;i<size1;i++){
		
			
			
	s.insert(arr2[i]);
		
	}
set<int>::iterator it;
   
// print the contents of our set
for (it=s.begin(); it!=s.end(); ++it)
    cout << ' ' << *it;
cout << '\n';
	
}
int main(){
	int arr[]={1,2,3,4};
	int arr2[]={3,4,5,6};
	int size=4;
	int size1=4;
	unionofArrays(arr,arr2,size,size1);
	
	
	return 0;
}
