package kadai_026;
import java.util.HashMap;
import java.util.Scanner;
public class Jyanken_Chapter26 {
	public String getMyChoice() {
		String myHand[]={"p","r","s"};
		while(true) {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");

	      Scanner scanner = new Scanner(System.in);
			
	      String input= scanner.next();
	      
	    	  if(input.equals(myHand[0]) ){
	    		  scanner.close();
	    		  return input;
	    	  }else if(input.equals(myHand[1])){
	    		  scanner.close();
	    		  return input;
	    		  
	    	  }else if(input.equals(myHand[2]) ){
	    		  scanner.close();
	    		  return input;
	    		  
	    	  
	    		  
	    		 
	    	  } 
	    		
	    	  }
	      } 
	
		
	      
	    	  
		
	public String getRandom() {
		String yourHand[]={"p","r","s"};
		String selectHand;
		selectHand=yourHand[(int) Math.floor(Math.random() * 3)];
		
		
		return selectHand;
		
	}
	public void playGame(String input,String selectHand) {
		
		HashMap<String, String>henkanMap=new HashMap<String,String>();
		henkanMap.put("r","グー");
		henkanMap.put("p","パー");
		henkanMap.put("s","チョキ");
		
		String newInput =henkanMap.get(input);
		String newSelectHand=henkanMap.get(selectHand);
		System.out.println("自分の手は"+newInput+",相手の手は"+newSelectHand);
		
		if(newInput.equals(newSelectHand)) {
			System.out.println("あいこです");
		}else if(newInput.equals("グー")&&newSelectHand.equals("パー")||
				newInput.equals("パー")&&newSelectHand.equals("チョキ")||
				newInput.equals("チョキ")&&newSelectHand.equals("グー")) {
			System.out.println("自分の負けです");
		}else if(newInput.equals("グー")&&newSelectHand.equals("チョキ")||
				newInput.equals("パー")&&newSelectHand.equals("グー")||
				newInput.equals("チョキ")&&newSelectHand.equals("パー")) {
			System.out.println("自分の勝ちです");
		
		
		
	}
	}
}


