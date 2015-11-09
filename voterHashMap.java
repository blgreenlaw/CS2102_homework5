package hwk5;

public class voterHashMap {
	private HashMap<String, Integer> firstVotes =
			new HashMap<String, Integer>();
	private HashMap<String,Integer> secondChoice =
			new HashMap<String,Integer>();
	private HashMap<String,Integer> thirdChoice =
			new HashMap<String,Integer>();
	
	/**
	 * Actually puts the vote count up by one at correct hashmap location.
	 * @param map The hashmap of the candidate where a vote is being added.
	 * @param candidateName The name of the person being voted for.
	 */
	private void addVoteToCorrectMap(HashMap<String,Integer> map, String candidateName) throws NotValidCandidateException{
		if(!map.containsKey(candidateName)){
			throw new NotValidCandidateException();
		}
		map.put(candidateName, map.get(candidateName) + 1);
	}
	/**
	 * Returns candidate with the most points under the following formula: 
	 * three points for each first-place vote they received, 
	 * two points for each second-place vote they received, 
	 * and one point for each third-place vote they received.
	 */
	public String findWinnerMostPoints(){
		String winner = "";
		int individualTotal = 0;
		int total = 0;
		for(String name : firstChoice.keySet()){
			individualTotal = (firstChoice.get(name) * 3)
					+ (secondChoice.get(name) * 2)
					+ (thirdChoice.get(name) * 1);
			if(individualTotal > total){
				total = individualTotal;
				winner = name;
			}
		}
		return winner;
	}
	/**
	 * Returns candidate name with the most first place votes.
	 */
	public String findWinnerMostFirstVotes(){
		String mostVotes = "";
		int numVotes = 0;
		for(String name : firstChoice.keySet()){
			if(firstChoice.get(name)> numVotes){
				mostVotes = name;
				numVotes = firstChoice.get(name);
			}
		}
		return mostVotes;
	}
}
 