import java.util.Scanner;

public class TeamStats {
    private static final int NUMBER_OF_GAMES = 82;
    private static final int NUMBER_OF_QUARTERS = 4;

    private static void initializeScores(int[][] teamScore) {
        for (int game = 0; game < NUMBER_OF_GAMES; game++) {
            for (int qtr = 0; qtr < NUMBER_OF_QUARTERS; qtr++) {
                teamScore[game][qtr] = (int) (Math.random() * 25) + 5;
            }
        }
    }

    private static void displayAllGameScores(int[][] teamScore) {
        for (int game = 0; game < NUMBER_OF_GAMES; game++) {
            System.out.println("\nGame: " + (game + 1));
            for (int qtr = 0; qtr < NUMBER_OF_QUARTERS; qtr++) {
                System.out.print("Q" + (qtr + 1) + ": " + teamScore[game][qtr] + "\t");
            }
        }
    }

    private static double calculateAverageScore(int[][] teamScore, int quarter) {
        int sum = 0;
        for (int game = 0; game < NUMBER_OF_GAMES; game++) {
            sum += teamScore[game][quarter];
        }
        return (double) sum / NUMBER_OF_GAMES;
    }

    private static void displayGameScore(int[][] teamScore, int gameNumber) {
        System.out.println("\nGame: " + gameNumber);
        for (int qtr = 0; qtr < NUMBER_OF_QUARTERS; qtr++) {
            System.out.print("Q" + (qtr + 1) + ": " + teamScore[gameNumber - 1][qtr] + "\t");
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int[][] teamScore = new int[NUMBER_OF_GAMES][NUMBER_OF_QUARTERS];
        initializeScores(teamScore);

        displayAllGameScores(teamScore);

        int choice;
        do {
            System.out.println("\n\n1 - Average score of the season by a selected quarter");
            System.out.println("2 - Display score of a single game");
            System.out.println("3 - Exit");
            choice = keyboard.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Quarter Number: ");
                    int quarter = keyboard.nextInt();
                    double average = calculateAverageScore(teamScore, quarter - 1);
                    System.out.println("Average score of the season in quarter " + quarter + ": " + average);
                    break;
                case 2:
                    System.out.println("Enter Game Number: ");
                    int gameNumber = keyboard.nextInt();
                    displayGameScore(teamScore, gameNumber);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Wrong choice! Enter Again. ");
            }
        } while (choice != 3);

        keyboard.close();
    }
}
