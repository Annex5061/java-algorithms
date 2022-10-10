#include <assert.h>
#include <ctype.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include <stdio.h>

struct node
{
	int data;
	struct node *next;
};

struct node *head = NULL;

void display()
{
	struct node *p = (struct node *)malloc(sizeof(struct node *));
	p = head;
	while (p != NULL)
	{
		printf("%d ", p->data);

		p = p->next;
	}
	printf("\n");
}

void insert()
{
	int pos;
	printf("Enter the position where you want to insert : ");
	scanf("%d", &pos);

	struct node *ptr = (struct node *)malloc(sizeof(struct node));

	printf("Enter the number : ");
	scanf("%d", &ptr->data);

	struct node *p = (struct node *)malloc(sizeof(struct node));
	p = head;

	if (pos == 1)
	{
		// ptr->data = val;
		ptr->next = p;
		head = ptr;
	}
	else
	{

		for (int i = 0; i < pos - 2; i++)
		{
			p = p->next;
		}
		ptr->next = p->next;
		// ptr->data = val;

		p->next = ptr;
	}
}

void delete ()
{
	if(head==NULL)
	{
		printf("List is empty\n");
	}
	else
	{
		int pos;
		printf("Enter the position where you want to delete : ");
		scanf("%d", &pos);

		struct node *p = (struct node *)malloc(sizeof(struct node));
		struct node *temp = (struct node *)malloc(sizeof(struct node));
		p = head;

		if (pos == 1)
		{
			temp = head;
			head = head->next;
			free(temp);
		}
		else
		{
			for (int i = 0; i < pos - 2; i++)
			{
				p = p->next;
			}
			temp = p->next;
			p->next = temp->next;
			free(temp);
		}
	}
}

void sort()
{
	struct node *p = (struct node *)malloc(sizeof(struct node *));
	struct node *p1 = (struct node *)malloc(sizeof(struct node *));
	p = head;
	int temp;

	while (p->next != NULL)
	{
		p1 = p->next;

		while (p1 != NULL)
		{
			if (p->data > p1->data)
			{
				temp = p->data;
				p->data = p1->data;
				p1->data = temp;
			}
			p1 = p1->next;
		}
		p = p->next;
	}
}

void create()
{
	struct node *p = (struct node *)malloc(sizeof(struct node *));
	struct node *ptr = (struct node *)malloc(sizeof(struct node *));
	int num;
	p = head;
	printf("Enter the number : ");
	scanf("%d", &ptr->data);
	ptr->next = NULL;

	if (head == NULL)
	{
		head = ptr;
	}
	else
	{
		while (p->next != NULL)
		{
			p = p->next;
		}

		p->next = ptr;
	}
}

void search()
{
	struct node *p = (struct node *)malloc(sizeof(struct node *));
	p = head;
	printf("Enter the number you want to search : ");
	int num, count = 1;
	scanf("%d", &num);
	bool flag = false;

	while (p != NULL)
	{
		if (p->data == num)
		{
			printf("%d found at position %d\n", num, count);
			flag = true;
		}
		p = p->next;
		count++;
	}

	if (!flag)
	{
		printf("%d not found\n", num);
	}
}

void reverse()
{
	struct node *p = (struct node *)malloc(sizeof(struct node *));
	struct node *t1 = (struct node *)malloc(sizeof(struct node *));
	struct node *t2 = (struct node *)malloc(sizeof(struct node *));
	p = head;
	t1 = t2 = NULL;

	while(p!=NULL)
	{
		t2 = p->next;
		p->next = t1;
		t1 = p;
		p = t2;
	}
	head = t1;
}

int main()
{
	printf("1. Create\n2. Insert\n3. Delete\n4. Display\n5. Search\n6. Sort\n7. Reverse\n8. Exit\n");
	int c, a = 0;

	while (a == 0)
	{
		printf("Enter your choice : ");
		scanf("%d", &c);
		if (c == 8)
		{
			break;
		}
		else
		{
			if (c == 1)
			{
				create();
			}
			else if (c == 2)
			{
				insert();
			}
			else if (c == 3)
			{
				delete ();
			}
			else if (c == 4)
			{
				display();
			}
			else if (c == 5)
			{
				search();
			}
			else if(c==6)
			{
				sort();
			}
			else if(c==7)
			{
				reverse();
			}
		}
	}
