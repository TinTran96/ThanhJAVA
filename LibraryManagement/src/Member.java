
public class Member {
	private String name;
	private Integer age;
	private String phoneNum;
	private String gender;
	
	public Member(){
		
	}
	public Member(String name,int age, String phoneNum, String gender){
		this.name = name;
		this.phoneNum = phoneNum;
		this.age = age;
		this.gender = gender;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getPhoneNum(){
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum){
		this.phoneNum = phoneNum;
	}
	public String getGender(){
		return gender;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
}
