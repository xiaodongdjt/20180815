package com.offcn.po;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="user")
public class User {
private String userid;
private String name;
private String password;
private Integer sex;
private Date birthday;
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Integer getSex() {
	return sex;
}
public void setSex(Integer sex) {
	this.sex = sex;
}
public Date getBirthday() {
	return birthday;
}
public void setBirthday(Date birthday) {
	this.birthday = birthday;
}
@Override
public String toString() {
	return "User [userid=" + userid + ", name=" + name + ", password=" + password + ", sex=" + sex + ", birthday="
			+ birthday + "]";
}


}
