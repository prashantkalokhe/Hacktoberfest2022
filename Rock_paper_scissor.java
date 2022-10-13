package GAME;
/* THIS IS OUR FIRST GAME */
import java.util.Random;
import java.util.Scanner;
public class GAME_01 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
      Random device = new Random();
        System.out.println(" device num");


        System.out.println("<---------- ROCK, PAPER & SCISSOR-------->");
        System.out.println(" KINDLY USE \n 1 FOR ROCK \n 2 FOR PAPER \n 3 FOR SCISSOR\n");


           while (true) {
               System.out.println("ENTER YOUR CHOICE");
               int ply2 = input.nextInt(4);
               System.out.println("YOUR CHOICE IS: " + ply2);
               int ply1 = device.nextInt(1, 4);
               System.out.println("COMPUTER CHOICE IS: " + ply1);
               if (ply2 == 3) {
                   if (ply1 == 3) {
                       System.out.println(" GAME IS TIE");
                   } else if (ply1 == 2) {
                       System.out.println("YOU ARE THE WINNER");
                   } else {
                       System.out.println("YOU LOSE THE GAME____");
                   }
               } else if (ply2 == 2) {
                   if (ply1 == 3) {
                       System.out.println("YOU LOSE THE GAME");
                   } else if (ply1 == 2) {
                       System.out.println("GAME IS TIE");
                   } else {
                       System.out.println("YOU ARE THE WINNER");
                   }

               } else if (ply2 == 1) {
                   if (ply1 == 3) {
                       System.out.println("YOU ARE THE WINNER GAME");
                   } else if (ply1 == 2) {
                       System.out.println("YOU LOSE THE GAME");
                   } else {
                       System.out.println("YOU LOSE THE GAME");
                   }
               }
           }
    }
}
