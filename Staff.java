
public class Staff {
	private String name;
	private String phoneNum;
	private String position;
	
	public Staff(){
		
	}
	public Staff(String name, String phoneNum, String position){
		this.name = name;
		this.phoneNum = phoneNum;
		this.position = position;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getPhoneNum(){
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum){
		this.phoneNum = phoneNum;
	}
	public String getPosition(){
		return position;
	}
	public void setPosition(String position){
		this.position = position;
	}
}
