/**
 * 
 */
package com.school.db;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author shiva
 *
 */

/**
 * @author shiva
 *
 */
@Entity
@Table(name = "role")
public class Roles {

	@Column(name = "ROLE_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roleID;

	@Column(name = "ROLE_NAME")
	private String role;

	@Column(name = "CREATION_DATE")
	private Date creationDate;

	@Column(name = "CREATION_BY")
	private int creationBy;

	public int getRoleID() {
		return roleID;
	}

	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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


}
