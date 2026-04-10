//Write a c program to find a key through a binary search method.

#include<stdio.h>
int main(){
	
	int arr[]={10,20,30,40};
	int n = 4,item = 30, low = 0, high = n-1, found = 0, mid;
	
	
	while(low<=high){
		mid = (low+high)/2;
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
