import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class game {
    public static void main(String game[]){

        
        int playerscore =0, compscore=0;

        int i=0;
        while(i<=5){
        Scanner p = new Scanner(System.in);
        System.out.println("Enter 0 for ROCK\n Enter 1 for Scissior\n Enter 2 for paper");
        int turn = p.nextInt(3);
        
        Random g = new Random();
        int randomg = g.nextInt(3);
        System.out.println
        ("The Randomly generated number is : " + randomg);
        

        switch (turn) {
            case 0:
                if(randomg == 0){
                    System.out.println("Its a draw");
                    playerscore +=0;
                    compscore +=0;
                break;}
        
                else if(randomg ==1){
                    System.out.println("You win");
                    playerscore +=1;
                    compscore +=0;
                break;}

                else if(randomg == 2){
                    System.out.println("You lose");
                    playerscore +=0;
                    compscore +=1;
                break;}

            case 1:
                if(randomg == 0){
                    System.out.println("You lose");
                    playerscore +=0;
                    compscore +=1;
                break;}
        
                else if(randomg ==1){
                    System.out.println("Its a draw");
                    playerscore +=0;
                    compscore +=0;
                break;}

                else if(randomg == 2){
                System.out.println("You win");
                playerscore +=1;
                compscore +=0;
                break;}

                case 2:
                if(randomg == 0){
                System.out.println("You win");
                playerscore +=1;
                compscore +=0;
                break;}
        
                else if(randomg ==1){
                System.out.println("You lose");
                playerscore +=0;
                compscore +=1;
                break;}

                else if(randomg == 2){
                System.out.println("Its draw");
                playerscore +=0;
                compscore +=0;
                break;}
        }

        ++i;}


        if(playerscore>compscore){
            System.out.println("------------YOU WIN THE MATCH-----------");
        }
        else if(compscore<playerscore){
            System.out.println("-----------COMPUTER WIN THE MATCH-----------");
        }
    }
    }

    

