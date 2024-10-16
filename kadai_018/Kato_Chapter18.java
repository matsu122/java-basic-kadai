package kadai_018;

public abstract class Kato_Chapter18 {

	public String familyName;
	public String givenName;
	public String address;
	
	public void commonIntroduce(){
		familyName="加藤";
		address="住所は東京都中野区〇×です";
		System.out.println("名前は"+familyName+givenName+"です");	
		System.out.println(address);
	}
	abstract public void eachIntroduce();
	
	public void execIntroduce(){
		commonIntroduce();
		eachIntroduce();
	}
		
}
