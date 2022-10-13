//program for tower of hanoi
#include<stdio.h>
#include<conio.h>
void main()
{
    int n;
    char A='A',B='B',C='C';
    void hanoi(int,char,char,char);
    printf("Enter the number of disks : ");
    scanf("%d",&n);
    printf("\n\n Tower of Hanoi problem with %d disks\n",n);
    printf("Sequence of moves :\n");
    hanoi(n,A,B,C);
    getch();
}
void hanoi(int n,char A,char B,char C)
{
    if(n==1)
        printf("\n Move disk 1 from rod %c to rod %c",A,C);
    else
    {
        hanoi(n-1,A,C,B);
        printf("\n Move disk %d from rod %c to rod %c",n,A,C);
        hanoi(n-1,B,A,C);
    }
}
