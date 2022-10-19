//WAP Write the following menu driven program for the binary tree
//----------------------------------------
//Binary Tree Menu
//----------------------------------------
//0. Quit
//1. Create
//2. In-Order Traversal
//3. Pre-Order Traversal
//4. Post-Order traversal

#include<stdio.h>
#include<conio.h>
struct tree
{
	int info;
	struct tree *left;
	struct tree *right;
};
struct tree *insert(struct tree *root, int d) 
{
	if(!root)
	{
		root=(struct tree*)malloc(sizeof(struct tree));
		root->info = d;
		root->left = NULL;
		root->right = NULL;
		return(root);
	}
	if(root->info > d)
	     root->left = insert(root->left,d);
	     else 
	     {
		if(root->info < d)
			root->right = insert(root->right,d);
	        }
	return(root);
}
void inorder(struct tree *root)
{
	if(root != NULL)
	{
		inorder(root->left);
		printf(" %d",root->info);
		inorder(root->right);
	}
	return;
}
void postorder(struct tree *root) 
{
	if(root != NULL)
	{
		postorder(root->left);
		postorder(root->right);
		printf(" %d",root->info);
	}
	return;
}
void preorder(struct tree *root)
{
	if(root != NULL) 
	{
		printf(" %d",root->info);
		preorder(root->left);
		preorder(root->right);
	}
	return;
}
int main(void) 
{
	struct tree *root;
	int ch, item,item_no;
	root = NULL;
	do {
		do 
		{
		    printf("\n-----MENU------");
			printf("\n1. Insert in Binary Tree ");
			printf("\n2. Inorder traversal of Binary tree");
			printf("\n3. Postorder traversal of Binary tree");
			printf("\n4. Preorder traversal of Binary tree");
			printf("\n5. Exit ");
			printf("\n-----MENU------");
			printf("\n");
			printf("\nEnter choice : ");
			scanf(" %d",&ch);
			if(ch<1 || ch>5)
			      printf("\n Invalid Entry");
		}
		while (ch<1 || ch>5);
		switch(ch) 
		{
			case 1:
				   printf("\n Enter new element: ");
			scanf("%d", &item);
			root= insert(root,item);
			printf("\n root is %d",root->info);
			printf("\n Binary tree is : ");
			inorder(root);
			break;
			case 2:
				  printf("\n Inorder traversal: ");
			inorder(root);
			break;
			case 3:
				  printf("\n Postorder traversal: ");
			postorder(root);
			break;
			case 4:
				  printf("\n Preorder traversal: ");
			preorder(root);
			break;
			default:
				   printf("\n EXIT ");
		}
	}
	while(ch !=5);
	return(0);
}
