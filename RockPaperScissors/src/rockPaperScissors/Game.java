package rockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		System.out.println(playable());

	}

	public static String playable() {

		String[] arr = { "rock", "paper", "scissors", "spock", "lizard" };

		Random random = new Random();

		// randomly selects an index from the arr
		int computerTurn = 0;

		Scanner sc = new Scanner(System.in);

		Boolean exit = false;

		double rock = 0;
		double paper = 0;
		double sci = 0;
		double spock = 0;
		double lizard = 0;

		int compWin = 0;
		int humanWin = 0;
		int ties = 0;

		int total = 0;
		String results = null;
		String mostPicked = null;

		do {

			System.out.println("Hello and welcome to the game! Please, pick your turn");
			String turn = sc.next();

			switch (turn) {

			case "rock":
				computerTurn = random.nextInt(arr.length);
				++rock;
				++total;
				if (computerTurn == 0) {
					++ties;
					System.out.println("Tie!");
				} else if (computerTurn == 1 || computerTurn == 3) {
					++compWin;
					System.out.println("Computer won this turn!");
				} else {
					++humanWin;
					System.out.println("You won!");
				}
				continue;

			case "scissors":
				computerTurn = random.nextInt(arr.length);
				++sci;
				++total;

				if (computerTurn == 0 || computerTurn == 3) {
					++compWin;
					System.out.println("Computer won this turn!");
				} else if (computerTurn == 1 || computerTurn == 4) {
					++humanWin;
					System.out.println("You won!");
				} else {
					++ties;
					System.out.println("Tie!");

				}
				continue;

			case "paper":
				computerTurn = random.nextInt(arr.length);
				++total;
				++paper;
				if (computerTurn == 0 || computerTurn == 3) {
					++humanWin;
					System.out.println("You won!");
				} else if (computerTurn == 1) {
					++ties;
					System.out.println("Tie!");
				} else {
					++compWin;
					System.out.println("Computer won this turn!");

				}
				continue;
				
			case "spock":
				computerTurn = random.nextInt(arr.length);
				++total;
				++spock;
				if (computerTurn == 0 || computerTurn == 2) {
					++humanWin;
					System.out.println("You won!");
				} else if (computerTurn == 3) {
					++ties;
					System.out.println("Tie!");
				} else {
					++compWin;
					System.out.println("Computer won this turn!");
				}
				continue;
				
			case "lizard":
				computerTurn = random.nextInt(arr.length);
				++total;
				++lizard;
				if (computerTurn == 1 || computerTurn == 3) {
					++humanWin;
					System.out.println("You won!");
				} else if (computerTurn == 4) {
					++ties;
					System.out.println("Tie!");
				} else {
					++compWin;
					System.out.println("Computer won this turn!");
				}
				continue;

			default:
				exit = true;
				sc.close();
			}

		} while (exit != true);

		rock = (rock / total) * 100;
		paper = (paper / total) * 100;
		sci = (sci / total) * 100;
		spock = (spock / total) * 100;
		lizard = (lizard / total) * 100;

		mostPicked = "\n" + "Rock - " + rock + "\n" + "Scissors - " + sci + "\n" + "Paper - " + paper + "\n" + "Spock - " + spock + "\n" + "Lizard - " + lizard;

		results = "Total Games played: " + total + ". Computer has won " + compWin + " times, while player has won "
				+ humanWin + " times." + " Game has tied " + ties + " times." + mostPicked;

		return results;

	}

}
