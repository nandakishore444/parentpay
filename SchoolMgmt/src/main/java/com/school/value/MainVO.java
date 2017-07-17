/**
 * 
 */
package com.school.value;

import java.util.Map;

/**
 * @author shiva
 *
 */
public class MainVO extends ValueObject {

	private Map<String, String> domains;
	private String domain;
	private String userName;
	private String password;
	private String email;
	private String phone;
	private String schoolName;
	public Map<String, String> getDomains() {
		return domains;
	}
	public void setDomains(Map<String, String> domains) {
		this.domains = domains;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}



}
