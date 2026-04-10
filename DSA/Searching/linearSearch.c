//Write a C program to implement a linear search method to find a key in an array.

#include<stdio.h>
int main(){
	int arr[100], n, i, item,found=0;
	printf("Enter the number of elements: ");
	scanf("%d", &n);

	printf("Enter the elements: ");	
	for(i=0; i<n; i++){
		printf("\narr[%d]= ",i);
		scanf("%d", &arr[i]);
	}
	printf("Array elements are: ");
	for(i=0; i<n; i++){
		printf("%d", arr[i]);	
	}
	printf("\nEnter the element you want to find: ");
	scanf("%d", &item);
	
	for(i=0;i<n;i++){
		if(arr[i]==item){
			printf("\nElement found at postion %d",i);
			found=1;
			break;
		}
	}
	
	if(found != 1){
		printf("Element not found..");
	}
	
}
