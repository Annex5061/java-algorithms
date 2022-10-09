#include <iostream>
using namespace std;

int main(){
	int a, b, c;
	cout << "Enter the Size of array\n";	//taking input for the size of array
	cin >> a >> b >> c;
	int arr[a][b][c];	//array of required size declared

	for (int i = 0; i < a; ++i)	//counter for first dimension
	{
		for (int j = 0; j < b; ++j)	//counter for second dimension
		{
			for (int k = 0; k < c; ++k)	//counter for third dimension
			{
				cout << "\nEnter value at position[" << i << "]" << "[" << j << "]" << "[" << k << "]";

				cin >> arr[i][j][k];	//taking input in the set counter
			}
		}
	}

	for (int i = 0; i < a; ++i)	//printing the array values as set
	{
		for (int j = 0; j < b; ++j)
		{
			for (int k = 0; k < c; ++k)
			{
				cout << "\nValue at position[" << i << "]" << "[" << j << "]" << "[" << k << "]= " << arr[i][j][k];
			}
		}
	}
	return 0;
}
