#include<stdio.h>
int main()
//gift allocation
{
    int maths,science;
    printf(" maths and science" );
    scanf("%d %d",&maths,&science);
     printf("marks obtained in maths=%d and marks obtained in science=%d\n",maths,science );
    if(maths==30 && science==30)
    {
        printf("you get a gift of $45");
    }
    else if(maths==30 && science<30)
    {
         printf("you get a gift of $15");

    }
    else if(maths<30 && science==30)
    {
         printf("you get a gift of $15");
    }
    else
    {
        printf("not eligible for gift");
    }
    return 0;
}
