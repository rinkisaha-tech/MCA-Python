//Write a C program to delete an element from a particular position of an existing array.

#include<stdio.h>
int main(){
	int arr[100],n,i,pos,item;
	printf("Enter the number of elements: ");
	scanf("%d", &n);

	printf("Enter the elements: ");	
	for(i=0; i<n; i++){
		printf("\narr[%d]= ",i);
		scanf("%d", &arr[i]);
	}
	printf("Array elements are: ");
	for(i=0; i<n; i++){
		printf("%d\t", arr[i]);	
	}
	
	printf("Enter the position for deleting an element: ");
	scanf("%d\t", &pos);
	
	for(i=pos; i<=n-1; i++){
		arr[i]=arr[i+1];
	}
	n=n-1;
	
	printf("Array elements after deletion are: ");
	for(i=0; i<n; i++){
		printf("%d\t", arr[i]);	
	}	
}
