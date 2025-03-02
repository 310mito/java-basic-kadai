package kadai.kadai_018;

abstract public  class Kato_Chapter18 {
	
	public String familyName;
	public String givenName;
	public String address;

	
	
	public void commonIntroduce() {	
		
		this.address = "東京都中野区〇×";
		this.familyName = "加藤";
		System.out.println("名前は" + this.familyName + this.givenName +"です");
		System.out.println("住所は" + this.address + "です");
		
	}
//	抽象メソッド
	abstract public void eachIntroduce();
	
	public void execIntroduce() {
		
		commonIntroduce();
		eachIntroduce();
	}
}
