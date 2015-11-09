package hwk5;


public interface IVoteSet {
	public void writeBallot(); 
	public void addToFirstVoteCount(String candidateName)throws NotValidCandidateException;
	public void addToSecondVoteCount(String candidateName)throws NotValidCandidateException;
	public void addToThirdVoteCount(String candidateName)throws NotValidCandidateException;
	public String findWinnerMostFirstVotes();
	public String findWinnerMostPoints();
}
