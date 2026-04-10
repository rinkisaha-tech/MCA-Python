#include<stdio.h>
int main(){
	
	int arr[100], n, i, item, found=0, low=0, high, mid;
	printf("Enter the number of elements: ");
	scanf("%d", &n);
	high=n-1;
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
	
	while(low<=high && item >= arr[low] && item <= arr[high]){

		mid = low+((item-arr[low])*(high-low))/(arr[high]-arr[low]);

		if(arr[mid]==item){

			printf("Item is found at position %d..",mid);
			found =1;
			break;
		}
		else if(arr[mid]<item){

			low=mid+1;
		}
		else if(arr[mid]> item){

			high= mid-1;
		}
		else{
			printf("Enter a valid element..!!");
		}
	}
	return 0;
}
