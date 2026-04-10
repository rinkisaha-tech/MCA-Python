//read and display n numbers using array
#include <stdio.h>
int main(){
	//int arr[5] = {1, 2, 3, 9, 3};
	int arr[100], n, i, pos, item;
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
	
	printf("\nEnter the element you want to insert: ");
	scanf("%d",&item);
	
	printf("Enter the position of that element: ");
	scanf("%d", &pos);
	
	for(i=n-1; i>=pos; i--){
		arr[i+1]=arr[i];
	}
	arr[pos] = item;
	n=n+1;
	
	printf("Array elements after insertion are: ");
	for(i=0; i<n; i++){
		printf("%d\t", arr[i]);	
	}
	
	
}


