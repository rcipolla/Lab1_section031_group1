package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();

	public Round() {
		
		Roll RoundOpener = new Roll();
		ComeOutScore = RoundOpener.getScore();
		rolls.add(RoundOpener);
			
			if (ComeOutScore == 7 || ComeOutScore == 11) {
				eGameResult result = eGameResult.NATURAL;
				System.out.println(result + "! \n");

			}else if (ComeOutScore == 2 || ComeOutScore == 3 || ComeOutScore == 12) {
				eGameResult result = eGameResult.CRAPS;
				System.out.println(result + "! \n");

			} else {
				int Looper = 0;
				while (Looper<1) {
					Roll NextRoll = new Roll();
					rolls.add(NextRoll);
						
					if (NextRoll.getScore() == ComeOutScore) {
						eGameResult result = eGameResult.POINT;
						System.out.println(result + "! \n");	
						Looper=1;
					}else if (NextRoll.getScore() == 7) {
						eGameResult result = eGameResult.SEVEN_OUT;
						System.out.println(result + "! \n");	
						Looper = 1;	
				}
			}
			
			
		}
		
		System.out.println("Here are your results for the round: \n");
		System.out.println("You rolled " + RollCount() + " time[s].");
		System.out.println("The roles were: \n");
		
		for (Roll r: rolls){
			System.out.println(r.getScore() + "\n");
		}
		
		System.out.println("--------------------------------------------------------------");
		
	}

	public int RollCount() {
		return rolls.size();
	}
	
}
