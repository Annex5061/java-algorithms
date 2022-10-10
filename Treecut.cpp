#include <iostream>
using namespace std;
bool isPossible(long long *arr,long long n,long long mid,long long k){
	int sum=0;
	for(long long i=0;i<n;i++){
		if(arr[i]-mid>0){
			sum=sum+arr[i]-mid;
		}
		if(sum>=k){
			return true;
		}
	}
	return false;
}
int main() {
	long long n,k;
	cin>>n>>k;
	long long arr[n];
	for(long long i=0;i<n;i++){
		cin>>arr[i];
	}
	sort(arr,arr+n);
	long long ans=-1;
	long long  s=0;
	long long e=arr[n-1];
	long long mid=s+(e-s)/2;
	while(s<=e){
		if(isPossible(arr,n,mid,k)){
			s=mid+1;
			ans=mid;
		}
		else{
			e=mid-1;
		}
		mid=s+(e-s)/2;
	}
	cout<<ans<<endl;
	return 0;
}