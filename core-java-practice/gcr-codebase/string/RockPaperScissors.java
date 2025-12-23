package string;

import java.util.*;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        sc.nextLine(); 
        String[][] results = new String[games][3];
        int playerWins = 0, computerWins = 0, draws = 0;
        for (int i = 0; i < games; i++) {
            System.out.print("Game " + (i + 1) + " - Enter your choice (rock/paper/scissors): ");
            String playerChoice = sc.nextLine().toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = findWinner(playerChoice, computerChoice);
            results[i][0] = playerChoice;
            results[i][1] = computerChoice;
            results[i][2] = winner;
            if (winner.equals("Player")) playerWins++;
            else if (winner.equals("Computer")) computerWins++;
            else draws++;
        }
        String[][] stats = calculateStats(playerWins, computerWins, draws, games);
        displayResults(results, stats);
    }

    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    public static String findWinner(String player, String computer) {
        if (player.equals(computer)) return "Draw";
        if ((player.equals("rock") && computer.equals("scissors")) ||
            (player.equals("paper") && computer.equals("rock")) ||
            (player.equals("scissors") && computer.equals("paper"))) {
            return "Player";
        } else {
            return "Computer";
        }
    }

    public static String[][] calculateStats(int playerWins, int computerWins, int draws, int totalGames) {
        String[][] stats = new String[2][3];
        stats[0][0] = "Player"; 
        stats[0][1] = String.valueOf(playerWins); 
        stats[0][2] = String.format("%.2f%%", (playerWins * 100.0) / totalGames);
        stats[1][0] = "Computer"; 
        stats[1][1] = String.valueOf(computerWins); 
        stats[1][2] = String.format("%.2f%%", (computerWins * 100.0) / totalGames);
        return stats;
    }

    public static void displayResults(String[][] results, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("Player\tComputer\tWinner");
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2]);
        }

        System.out.println("\nStatistics:");
        System.out.println("Participant\tWins\tWinning %");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

}
