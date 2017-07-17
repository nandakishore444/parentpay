/**
 * 
 */
package com.school.db;

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
@Entity
@Table(name="school")
public class School {

	@Column(name="SCHOOL_ID")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int schoolID;
	
	@Column(name="SCHOOL_NAME")
	private String schoolName;

	public int getSchoolID() {
		return schoolID;
	}

	public void setSchoolID(int schoolID) {
		this.schoolID = schoolID;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
}
