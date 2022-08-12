package ch09;

public class personInfo {
	
	
	public int personHigh;
	public int personHeight;
	public String personSex;
	public String personName;
	public int personAge;
	
	public personInfo(){
	
	}
	public personInfo(int personHigh, int personHeight, String personSex, String personName, 
			String personName1, int personAge) {
		this.personHigh = personHigh;
		this.personHeight = personHeight;
		this.personSex = personSex;
		this.personName = personName;
		this.personAge = personAge;
		
	}
	public String showpersonInfo() {
		
		return "키가" + personHigh + "이고 몸무게가" + personHeight + "킬로인" + personSex +
				"이 있습니다. 이름은" + personName + "이고 나이는" + personAge + "입니다.";
				
	}
	
}
