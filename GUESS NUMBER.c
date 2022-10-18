// A and B are playing a guessing game where B first thinks up an integer X (positive,
// negative or zero, and could be of arbitrarily large magnitude) and A tries to guess it. In
// response to A’s guess, B gives exactly one of the following three replies:
// a) Try a bigger number
// b) Try a smaller number or
// c) You got it.
// Write a program by designing an efficient algorithm to minimize the number of guesses
// A has to make. An example (not necessarily an efficient one) below:
// Let B thinks up the number 35
// A’s guess B’s response
// 10 Try a bigger number
// 20 Try a bigger number
// 30 Try a bigger number
// 40 Try a smaller number
// 35 You got it
#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<time.h>
int main(void)
{
    double total_time;
    clock_t start, end;
    int lowRange;
    int highRange;
    start = clock();
    printf("Enter Low Range Number :");
    scanf("%d",&lowRange);
    printf("Enter High Range Number :");
    scanf("%d",&highRange);
    int possibleGuesses = highRange + lowRange - 1;
    int maxTurns = (int) (log(possibleGuesses) / log(2)) + 1;
    int yourGuess;
    int playerAanswer;
    int countNumTurns = 1;
    printf("Choose a number from %d to %d, ", lowRange, highRange);
    printf("I will guess your number in %d turns or less.\n\n",maxTurns);
    do {
        possibleGuesses = highRange + lowRange - 1;
        yourGuess = (int)ceil (possibleGuesses / 2.0);
        printf("Is your number %d ?\n", yourGuess);
        printf("Press (1)Try Bigger Number (2)Try Lower Number (3)You got it.\n");
        scanf("%d", &playerAanswer);
        if(playerAanswer == 1)
        lowRange = yourGuess + 1;
        if(playerAanswer == 2)
        highRange = yourGuess - 1;
        if(playerAanswer == 3)
        break;
        countNumTurns++;
    }while(playerAanswer != 3);
    end = clock();
    total_time = ((double) (end - start)) / CLK_TCK;
    printf("I guessed your number in %d turns !\n", countNumTurns);

    system("Pause");
}
