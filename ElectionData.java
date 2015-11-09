package hwk5;

import java.util.HashMap;
import java.util.LinkedList;

public class ElectionData {
	private LinkedList<String> ballot = new LinkedList<String>();
	private IVoteSet firstChoice =
			new voterHashMap();
	private IVoteSet secondChoice =
			new voterHashMap();
	private IVoteSet thirdChoice =
			new voterHashMap();

	ElectionData() {
		this.ballot.add("Gompei");
		this.ballot.add("Husky");
		firstChoice.put("Gompei",	0);
		secondChoice.put("Gompei",	0);
		thirdChoice.put("Gompei",	0);
		firstChoice.put("Husky",	0);
		secondChoice.put("Husky",	0);
		thirdChoice.put("Husky",	0);
	}

	/**
	 * Prints out all the names in the election Ballot
	 */
	public void writeBallot() {
		for (String s : ballot) {
			System.out.println(s);
		}
	}

	/**
	 * Adds the votes to the counter for the candidate specified.
	 * @param candidateName The name of the person being voted for.
	 */
	public void addToFirstVoteCount(String candidateName)throws NotValidCandidateException{
		firstChoice.addVoteToCorrectMap(firstChoice, candidateName);
	}

	public void addToSecondVoteCount(String candidateName)throws NotValidCandidateException{
		secondChoice.addVoteToCorrectMap(secondChoice, candidateName);	
	}

	public void addToThirdVoteCount(String candidateName)throws NotValidCandidateException{
		thirdChoice.addVoteToCorrectMap(thirdChoice, candidateName);
	}

}
