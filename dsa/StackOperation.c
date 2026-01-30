/* 1. Write a menu driven c program to implement stack operations
~ Push
~ Pop
~ Peek
~ Display */

#include<stdio.h>
#define MAX 3
int st[MAX];
int top = -1;

void push(int st[], int val);
int pop(int st[]);
int peek(int st[]);
void display(int st[]);


//push operation
void push(int st[],int val){
	if(top == MAX -1){
		printf("Stack overflow");
	}else{
		top++;
		st[top]= val;
	}
}

//pop opretaion
int pop(int st[]){
	int val;
	if(top == -1){
		printf("Stack underflow");
		return -1;
	}else{
		val = st[top];
		top--;
		return val;
	}
}

//peek opration
int peek(int st[]){
	if(top == -1){
		printf("Stack is empty");
		return -1;
	}else{
		return st[top];
	}
}

//display opration
void display(int st[]){
	int i;
	if(top == -1){
		printf("Stack is empty");
		
	}else{
		printf("Stack element are: \n");
		for(i=top; i>=0; i--){
			printf("%d\n", st[i]);
		}
	}
}


int main(){
	int val, options;
	
	do{
		printf("\n~~*~~StAcK oPeRaTiOnS~~*~~");
		printf("\n1. PUSH");
		printf("\n2. POP");
		printf("\n3. PEEK");
		printf("\n4. DISPLAY");
		printf("\n5. EXIT");
		printf("\nEnter an option: ");
		scanf("%d", &options);
		
		switch(options){
			case 1:
				printf("\nEnter the number to push on the stack: ");
				scanf("%d",&val);
				push(st,val);
				break;
			case 2:
				val = pop(st);
				if(val != -1)
					printf("\nThe value deleted from the stack is %d",val);
				break;
			case 3:
				val = peek(st);
				if(val != -1)
					printf("\nThe value stored at the top of the stack is %d",val);
				break;	
			case 4:
				display(st);
				break;
			case 5:
				printf("Exit..");
				break;
			default:
				printf("Invalid option.!!");		
			}
	}while(options !=5);
	
	return 0;	      
}
