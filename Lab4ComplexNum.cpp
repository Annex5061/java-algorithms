/* Implement a class complex which represent the complex number data type.Implement the following operations:
1)Default Constuctor (including a default constuctor which creates the complex number 0+0i)
2)Paramatrised Constuctor (3+5i)
3)Copy Constuctor : use this to display the same complex number as of part 2 */

#include <iostream>
using namespace std;
class complex
{
    int real,imaginary;
    public:
    complex()
    {
        real=imaginary=0;
    }
    void display()
    {
        cout<<real<<"+"<<imaginary<<"i"<<endl;
    }
};
int main()
{
    complex c;
    c.display();
    return 0;
}
/*
#include <iostream>
using namespace std;
class complex
{
    int real,imaginary;
    public:
    complex(int r,int i)
    {
        real=3;
        imaginary=5;
    }
    void display()
    {
        cout<<real<<"+"<<imaginary<<"i"<<endl;
    }

};
int main()
{
    complex c(3,5);
    c.display();
    return 0;
}  */
/*
#include <iostream>
using namespace std;
class complex
{
    int real,imaginary;
    public:
    complex(int r,int i)
    {
        real=r;
        imaginary=i;
    }
    complex(complex &c)
    {
        real=c.real;
        imaginary=c.imaginary;
    }
    void display()
    {
        cout<<real<<"+"<<imaginary<<"i"<<endl;
    }

};
int main()
{
    complex c1(3,5);
    complex c2(c1);
    c1.display();
    c2.display();
    return 0;
}   */