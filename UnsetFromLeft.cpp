#include <bits/stdc++.h>
using namespace std;
#define pb push_back
typedef long long ll;
typedef unsigned long int ull;

void pbf(int num)
{
	for (int i = 10; i >= 0; i--)
	{
		cout << ((num >> i) & 1);
	}
	cout << "\n";
}

int main()
{
	int n, i;
	cin >> n >> i;
	pbf(n);
	pbf(n & ((1 << i) - 1));
}
