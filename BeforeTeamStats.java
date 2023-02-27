package teamstats;

import java.util.Scanner;

public class TeamStats {
        public static void main(String[] args)
        {
            Scanner keyboard = new Scanner(System.in);

            // This 2-d array holds scores for 82 games by quater
            int[][] teamscore = new int[82][4];

            //Initialise array to random scores
            for(int game = 0; game < 82 ; game++)
            {
                for(int qtr = 0; qtr < 4 ; qtr++)
                {
                    teamscore[game][qtr] = (int)(Math.random()*25) + 5;
                }
            }

            //View all games scores
            for(int game = 0; game < 82 ; game++)
            {
                System.out.println("\nGame: "+(game+1));
                for(int qtr = 0; qtr < 4 ; qtr++)
                {
                    System.out.print("Q" + (qtr+1) + ": " + teamscore[game][qtr] + "\t");
                }
            }

            // MENU
            int ch;
            do {
                System.out.println("\n\n1 - Average score of the season by a selected quater");
                System.out.println("2 - Display score of a single Match");
                System.out.println("3 - Exit");
                ch = keyboard.nextInt();
                
                switch(ch){
                    case 1:
                        int quater;
                        System.out.println("Enter Quater Number: ");
                        quater = keyboard.nextInt();

                        int sum = 0;
                        for (int i = 0; i < 82; i++) {
                            sum = sum + teamscore[i][quater];
                        }
                        System.out.println("Average score of the season by a selected quater : " + (sum / 82));
                        break;
                    case 2:
                        int game;
                        System.out.println("Enter Season Number: ");
                        game = keyboard.nextInt();

                        System.out.println("\nGame: " + game);
                        for (int qtr = 0; qtr < 4; qtr++) {
                            System.out.print("Q" + (qtr + 1) + ": " + teamscore[game - 1][qtr] + "\t");
                        }
                        System.out.println("Enter Season Number: ");
                        game = keyboard.nextInt();

                        System.out.println("\nGame: " + game);
                        for (int qtr = 0; qtr < 4; qtr++) {
                            System.out.print("Q" + (qtr + 1) + ": " + teamscore[game - 1][qtr] + "\t");
                        }
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Wrong choice! Enter Again. ");
                }
            } while(ch != 3);
        }
    }
