package hwk5;

import java.util.Scanner;

public class VotingMachine {
	private ElectionData data = new ElectionData();
	Scanner keyboard = new Scanner(System.in);
	/**
	 * Prints the ballot for a vote booth.
	 */
	public void printBallot() {

		System.out.println("The candidates are ");
		data.writeBallot();
	}

	public void screen() {
		this.printBallot();
		while (true) {
			System.out.println("Who do you want as your first choice?");
			String firstChoice = keyboard.next();
			System.out.println("Who do you want as your second choice?");
			String secondChoice = keyboard.next();
			System.out.println("Who do you want as your third choice?");
			String thirdChoice = keyboard.next();
			try{this.processVote(firstChoice, secondChoice, thirdChoice);
			} catch (NotValidCandidateException e){
				continue; 
			}
			System.out.println("Your first choice was " + firstChoice);
			System.out.println("Your second choice was " + secondChoice);
			System.out.println("Your first choice was " + thirdChoice);
			break;
		}
	}

	/**
	 * Takes three votes and stores voters choices in proper hashmap.
	 */
	public void processVote(String vote1, String vote2, String vote3) throws NotValidCandidateException{
		if(vote1.equals(vote2) || vote2.equals(vote3) || vote3.equals(vote1)){
			throw new NotValidCandidateException();
		}
		data.addToFirstVoteCount(vote1);
		data.addToSecondVoteCount(vote2);
		data.addToThirdVoteCount(vote3);
	}		
}
