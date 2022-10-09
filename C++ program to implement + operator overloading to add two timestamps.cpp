// C++ program to implement + operator
// overloading to add two timestamps

#include <iostream>
using namespace std;

// Time class template
class Time {
private:
	int HR, MIN, SEC;

	// Defining functions
public:
	// Functions to set the time
	// in the Time class template
	void setTime(int x, int y, int z)
	{
		HR = x;
		MIN = y;
		SEC = z;
	}

	// Function to print the time
	// in HH:MM:SS format
	void showTime()
	{
		cout << endl
			<< HR << ":" << MIN << ":" << SEC;
	}

	// Function to normalize the resultant
	// time in standard form
	void normalize()
	{
		MIN = MIN + SEC / 60;
		SEC = SEC % 60;
		HR = HR + MIN / 60;
		MIN = MIN % 60;
	}

	// + Operator overloading
	// to add the time t1 and t2
	Time operator+(Time t)
	{
		Time temp;
		temp.SEC = SEC + t.SEC;
		temp.MIN = MIN + t.MIN;
		temp.HR = HR + t.HR;
		temp.normalize();
		return (temp);
	}
};

// Driver code
int main()
{
	Time t1, t2, t3;
	t1.setTime(5, 50, 30);
	t2.setTime(7, 20, 34);

	// Operator overloading
	t3 = t1 + t2;

	// Printing results
	t1.showTime();
	t2.showTime();
	t3.showTime();

	return 0;
}
