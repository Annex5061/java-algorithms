#include<stdio.h>
void main()
{  //6 11 8 13 10 15 12
	int a=6;
	printf("%d ",a);
	label:
		a=a+5;
		printf("%d ",a);
		a=a-3;
		printf("%d ",a);
		if(a<12)
		{
			goto label;
		}
}
