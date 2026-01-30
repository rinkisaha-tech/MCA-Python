#include <stdio.h>
int main()
{
	int i,n,pos,value;
	printf("Enter number of elements:");
	scanf("%d",&n);
	
	int arr[n+1];
	
	printf("Enter the elements:");
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	printf("Enter the position of the element:");
	scanf("%d",&pos);
	
	printf("Enter the element to insert:");
	scanf("%d",&value);
	
	for(i=n;i>=pos;i--)
	{
		arr[i]=arr[i-1];
	}
	arr[pos-1]=value;
	n++;
	
	printf("Final array after insertion:");
	for(i=0;i<n;i++)   
	{
		printf("%d",arr[i]);
	}
	return 0;
}
