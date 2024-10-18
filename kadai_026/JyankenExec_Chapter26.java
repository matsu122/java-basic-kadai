package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		Jyanken_Chapter26 janken =new Jyanken_Chapter26();
		String input=janken.getMyChoice();
		
		String selectHand=janken.getRandom();
		
		janken.playGame(input,selectHand);

	}

}
