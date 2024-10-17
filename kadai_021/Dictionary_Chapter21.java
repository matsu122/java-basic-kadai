package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	public static void set(String fluteName) {

	HashMap<String, String>dictionaryMap=new HashMap<String,String>();
	
	dictionaryMap.put("apple","りんご");
	dictionaryMap.put("peach","桃");
	dictionaryMap.put("banana","バナナ");
	dictionaryMap.put("lemon","レモン");
	dictionaryMap.put("pear","梨");
	dictionaryMap.put("kiwi","キウィ");
	dictionaryMap.put("strawberry","いちご");
	dictionaryMap.put("grape","ぶどう");
	dictionaryMap.put("muscat","マスカット");
	dictionaryMap.put("cherry","さくらんぼ");
	
	String yes="";
	
	
	
	
	for(String searchName : dictionaryMap.keySet()) {
		if(searchName==fluteName) {
			
			
			yes=fluteName+"の意味は"+dictionaryMap.get(fluteName);
			break;
			
		}else {
			yes=fluteName+"は辞書に存在しません";
		}
		
		
		
			
		}
	System.out.println(yes);
		
	}
	
	

		
	
	
		
	}
	


