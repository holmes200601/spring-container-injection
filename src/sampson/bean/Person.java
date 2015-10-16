package sampson.bean;

import sampson.enumeration.Gender;

public abstract class Person {
	private String Name;
	private String phone; // Need validation
	private Integer age;
	private Gender gener;
	private String qq;
	private String wechat;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Gender getGener() {
		return gener;
	}
	public void setGener(Gender gener) {
		this.gener = gener;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getWechat() {
		return wechat;
	}
	public void setWechat(String wechat) {
		this.wechat = wechat;
	}
	
	
	
}
