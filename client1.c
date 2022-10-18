#include <netdb.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/socket.h>
#define MAX 80
#define PORT 8080
#define SA struct sockaddr
int main()
{
    int sockfd, connfd, n;
    struct sockaddr_in servaddr, cli;
    sockfd = socket(AF_INET, SOCK_STREAM, 0);
    bzero(&servaddr, sizeof(servaddr));
    servaddr.sin_family = AF_INET;
    servaddr.sin_addr.s_addr = inet_addr("127.0.0.1");
    servaddr.sin_port = htons(PORT);
    connect(sockfd, (SA*)&servaddr, sizeof(servaddr));
    int buff,ans;
    printf("\nEnter a number:\n");
    scanf("%d",&buff);
    write(sockfd, &buff, sizeof(int));
    read(sockfd,&ans,sizeof(int));
    close(sockfd);
}