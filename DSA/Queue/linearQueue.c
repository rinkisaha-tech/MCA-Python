#include<stdio.h>
#define MAX 5
int queue[MAX];
int front = -1, rear = -1, value, i, choice;

void insert(){
	if(rear == MAX -1){
		printf("Queue Overflow..\n");
	}else{
		printf("Enter value to insert: ");
		scanf("%d", &value);
		
		if(front == -1)
			front = 0;
		rear++;
		queue[rear] = value;
		printf("Value inserted successfully..!\n");
	}
}

void delete(){
	if(front == -1|| front>rear){
		printf("Queue Underflow..\n");
	}else{
		printf("Deleted element: %d\n",queue[front++]);

	}
}
		
void display(){
	if(front==-1 || front>rear){
		printf("Queue is empty..!\n");
	}else{
		printf("Queue element are: ");
		for(i = front; i<=rear; i++){
			printf("%d",queue[i]);
		}
		printf("\n");
	}
}

int main(){
		printf("Linear Queue Menu\n");
		printf("1.Insert\n");
		printf("2.DElete\n");
		printf("3.Display\n");
		printf("4.Exit\n");
	do{
		printf("Enter your choice: ");
		scanf("%d",&choice);
		
		switch(choice){
			case 1:
				insert();
				break;
			case 2:
				delete();
				break;
			case 3:
				display();
				break;
			case 4:
				printf("Existing..\n");
				break;
			default:
				printf("Invalid option...!!\n");
		}
	} 
	while(choice != 4);
	return 0;
}                                                                                   
