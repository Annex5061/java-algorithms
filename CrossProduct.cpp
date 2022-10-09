#include <iostream>
using namespace std;
template <class T>

class vector
{
public:
    T *arr;
    int size;
    vector(int m)
    {
        size = m;
        arr = new T[size];
    }
    T crossproduct(vector &v /*,vector &v3*/)
    {
        int a;
        for (int i = 0; i < size; i++)
        {
           
            
            a= ((arr[i + 1] * v.arr[i + 2]) - (arr[i + 2] * v.arr[i + 1]));
                
            a = ((arr[i + 2] * v.arr[i + 0]) - (arr[i + 0] * v.arr[i + 0]));
                
            a= ((arr[i + 0] * v.arr[i + 1]) - (arr[i + 1] * v.arr[i + 0]));
                
        }
        return a;
    }
    void display()
    {
        int d[size]= crossproduct();
        return d;
    }
};

int main()
{
    vector<int> v1(3), v2(3);

    v1.arr[0] = 1;
    v1.arr[1] = 2;
    v1.arr[2] = 3;

    v2.arr[0] = 3;
    v2.arr[1] = 2;
    v2.arr[2] = 1;

    v1.crossproduct(v2);
    v1.display();
    
    //int d[size] = v1.crossproduct(v2);
    //for(int j=0;j<3;j++)
    //{
    //    
    //    cout<<d[j]<<endl;
    //}
    //cout<<d<<endl;

    //cout<<d[0]<<endl;
    //cout<<d[1]<<endl;
    //cout<<d[2]<<endl;
    
  return 0;
}