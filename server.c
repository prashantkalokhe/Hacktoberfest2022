#include <stdio.h>
#include <netdb.h>
#include <netinet/in.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include <sys/socket.h>
#include <sys/types.h>
#define MAX 80
#define PORT 8080
#define SA struct sockaddr
int main()
{
    int sockfd, connfd1,connfd2, len, n,i=0;
    struct sockaddr_in servaddr, cli1,cli2;
    sockfd = socket(AF_INET, SOCK_STREAM, 0);
    bzero(&servaddr, sizeof(servaddr));
    servaddr.sin_family = AF_INET;
    servaddr.sin_addr.s_addr = htonl(INADDR_ANY);
    servaddr.sin_port = htons(PORT);
    bind(sockfd, (SA*)&servaddr, sizeof(servaddr));
    listen(sockfd, 5);
    len = sizeof(cli1);
    connfd1 = accept(sockfd, (SA*)&cli1, &len);
    connfd2 = accept(sockfd, (SA*)&cli2, &len);
    int b1,b2,add,mul;
    read(connfd1, &b1, sizeof(int));
    printf("From client 1: %d\n", b1);
    read(connfd2, &b2, sizeof(int));
    printf("From client 2: %d\n", b2);
    close(sockfd);
}