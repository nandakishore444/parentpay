/**
 * 
 */
package com.school.db;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author shiva
 *
 */
@Entity
@Table(name = "user")
public class User {

	@Column(name = "USER_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userID;

	@Column(name = "USER_FIRSTNAME")
	private String firstName;

	@Column(name = "USER_LASTNAME")
	private String lastName;

	@Column(name = "CREATION_DATE")
	private Date creationDate;

	@Column(name = "CREATION_BY")
	private int creationBy;

	@Column(name = "USER_LOGINID")
	private String loginID;

	@Column(name = "USER_PASSWORD")
	private String password;

	@Column(name = "SEX")
	private String sex;
	
	@OneToOne(cascade=CascadeType.ALL)  
	@JoinColumn(name="ROLE_ID")  
	private Roles role;

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public int getCreationBy() {
		return creationBy;
	}

	public void setCreationBy(int creationBy) {
		this.creationBy = creationBy;
	}

	public String getLoginID() {
		return loginID;
	}

	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Roles getRole() {
		return role;
	}

	public void setRole(Roles role) {
		this.role = role;
	}

}
