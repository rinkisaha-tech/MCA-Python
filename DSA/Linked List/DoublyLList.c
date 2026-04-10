/*Write a C program to implement basic operations on a doubly linked list: 
1.Insert at the beginning 
2.Insert at the end
3.Delete first node
4.Delete last node
5.Display all nodes*/

#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int data;
    struct node* prev;
    struct node* next;
}node;

node* head = NULL;
//Insert at begin
void insertBeginning(int value) {
    node* newNode = (node*)malloc(sizeof(node));
    newNode->data = value;
    newNode->prev = NULL;
    newNode->next = head;

    if (head != NULL)
        head->prev = newNode;

    head = newNode;
    printf("Inserted at beginning.\n");
}

// Insert at end
void insertEnd(int value) {
    node* newNode = (node*)malloc(sizeof(node));
    node* temp = head;

    newNode->data = value;
    newNode->next = NULL;

    if (head == NULL) {
        newNode->prev = NULL;
        head = newNode;
        return;
    }

    while (temp->next != NULL)
        temp = temp->next;

    temp->next = newNode;
    newNode->prev = temp;

    printf("Inserted at end.\n");
}

// Delete first node
void deleteFirst() {
    if (head == NULL) {
        printf("List is empty.\n");
        return;
    }

    node* temp = head;
    head = head->next;

    if (head != NULL)
        head->prev = NULL;

    free(temp);
    printf("First node deleted.\n");
}

// Delete last node
void deleteLast() {
    if (head == NULL) {
        printf("List is empty.\n");
        return;
    }

    node* temp = head;

    if (temp->next == NULL) {
        head = NULL;
        free(temp);
        printf("Last node deleted.\n");
        return;
    }
    while (temp->next != NULL)
        temp = temp->next;

    temp->prev->next = NULL;
    free(temp);

    printf("Last node deleted.\n");
}

// Display list
void display() {
    node* temp = head;

    if (temp == NULL) {
        printf("List is empty.\n");
        return;
    }
    printf("Doubly Linked List: ");
    while (temp != NULL) {
        printf("%d <-> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

// Main function
int main() {
    int choice, value;

	printf("\n--- Doubly Linked List Menu ---\n");
    printf("1. Insert at Beginning\n");
    printf("2. Insert at End\n");
    printf("3. Delete First Node\n");
    printf("4. Delete Last Node\n");
    printf("5. Display\n");
    printf("6. Exit\n");
    while (1) {
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter value: ");
                scanf("%d", &value);
                insertBeginning(value);
                break;
            case 2:
                printf("Enter value: ");
                scanf("%d", &value);
                insertEnd(value);break;
            case 3: deleteFirst();break;
            case 4: deleteLast();break;
            case 5: display();break;
            case 6: exit(0);
            default: printf("Invalid choice.\n");
        }
    }
    return 0;
}
